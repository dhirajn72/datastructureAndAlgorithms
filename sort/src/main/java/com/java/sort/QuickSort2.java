package com.java.sort;

/**
 * @author Dhiraj
 * @date 06/05/18
 */
public class QuickSort2 {

    public int[] quickSort(int[] arr){
        sort(arr,0,arr.length-1);
        return arr;
    }

    private void sort(int[] arr, int low, int high) {
        int i=low,j=high;
        int temp;
        int pivot=arr[(low+high)/2];

        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        if (low<j)
            sort(arr,low,j);
        if (i<high)
            sort(arr,i,high);
    }
}

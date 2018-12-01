package com.java.sort;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 06/05/18
 */
public class QuickSort2 {

    public void quickSort(int[] arr){
        sort(arr,0,arr.length-1);
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

    public static void main(String[] args) {

        int[] arr={9,4,6,2};
        System.out.println(Arrays.toString(arr));
        QuickSort2 sort= new QuickSort2();
        sort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

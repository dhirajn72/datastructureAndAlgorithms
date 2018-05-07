package com.java.sort;

/**
 * @author Dhiraj
 * @date 03/05/18
 */
public class SelectionSort {
    public int[] selectionSort(int[] arr){
        if (arr==null)return null;
        int min;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}

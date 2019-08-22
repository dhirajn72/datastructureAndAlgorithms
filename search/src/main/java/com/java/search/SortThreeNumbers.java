package com.java.search;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class SortThreeNumbers {
    public static void main(String[] args) {
        int[] arr={2,2,0,1,2,2,1,1,2,2,1,0,0,1,1,2,2};
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr, int low, int high) {
        int i=low;
        int j=high;
        int pivot=arr[(low+high)/2];
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j)
            _quickSort(arr,low,j);
        if (i<high)
            _quickSort(arr,i,high);
    }
}

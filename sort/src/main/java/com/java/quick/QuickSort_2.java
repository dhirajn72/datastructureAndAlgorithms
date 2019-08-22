package com.java.quick;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class QuickSort_2 {
    public static void main(String[] args) {
        int[] arr= {6,5,2,4,1,6,9,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        _sort(arr,0,arr.length-1);
    }

    private static void _sort(int[] arr, int low, int high) {
        int i=low,j=high;
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
            _sort(arr,low,j);
        if (i<high)
            _sort(arr,i,high);
    }
}

package com.java.quick;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 14/06/19
 */
public class QuickSort {
    public static void main(String[] args) {
        //int[] arr = {9, 2, 5, 1, 8, 7, 4, 3};
        int[] arr = {9, 1, 8, 10, 7, 4, 2};

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr,int low,int high) {
        int i=low,j=high;
        int pivot=arr[(low+high)/2];
        int temp;
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
            _quickSort(arr,low,j);
        if (i<high)
            _quickSort(arr,i,high);
    }
}

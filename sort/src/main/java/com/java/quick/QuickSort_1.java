package com.java.quick;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 29/10/18
 */
public class QuickSort_1 {

    public static void main(String[] arg) {
        int[] arr = {9, 2, 5, 1, 8, 7, 4, 3};
        //QuickSort_1 sort = new QuickSort_1();
        System.out.println(Arrays.toString(arr));
        //sort.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //_sort(arr);
        __sort(arr);
        System.out.println(Arrays.toString(arr));    }

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private void quickSort(int[] arr, int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        while (i <=j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }




    public static void _sort(int[] arr){
        _sort(arr,0, arr.length-1);

    }

    private static void _sort(int[] arr, int low, int high) {
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
            _sort(arr,low,j);
        if (i<high)
            _sort(arr,i,high);
    }
    private static void __sort(int[] arr){
        __sort(arr,0,arr.length-1);
    }
    private static void __sort(int[] arr, int low, int high) {
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
            __sort(arr,low,j);
        if (i<high)
            __sort(arr,i,high);
    }


}

package com.java.sort;

/**
 * @author Dhiraj
 * @date 06/05/18
 */
public class QuickSort {

   /*public void quickSort(int[] arr,int low,int high){
        int pivot;
        if (high>low){
            pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    private int partition(int[] arr, int low, int high) {
        int left,right,pivot_item=arr[low];
        left=low;
        right=high;
        while (left<right){
            while (arr[left]<=pivot_item)
                left++;
            while (arr[right]>pivot_item)
                right--;
            if (left<right)
                swap(arr,left,right);
        }
        arr[low]=arr[right];
        arr[right]=pivot_item;
        return right;
    }
    private void swap(int[] arr, int left, int right) {
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }*/


    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int arr[], int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];

        while (i <= j) {
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
}

package com.java.merge;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 1, 8, 7, 4, 3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int low,int high) {
        if (low<high){
            int mid=(low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            _merge(arr,low,mid,high);
        }
    }

    private static void _merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] leftArray= new int[n1];
        int[] rightArray=new int[n2];

        for (int i=0;i<n1;i++)
            leftArray[i]=arr[low+i];
        for (int j=0;j<n2;j++)
            rightArray[j]=arr[mid+1+j];

        int i=0,j=0;

        for (int k=low;k<high;k++){
            if (leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i=i+1;
            }
            else {
                arr[k]=rightArray[j];
                j=j+1;
            }
        }


        /*int k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }*/
    }
}

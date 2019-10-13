package com.java.sort;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 03/05/18
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={9,2,5,4,3,1,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
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

    }
}

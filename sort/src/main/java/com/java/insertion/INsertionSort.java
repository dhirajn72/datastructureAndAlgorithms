package com.java.insertion;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class INsertionSort {

    public static void main(String[] args) {
        int[] arr={4,3,2,9,8,7,6,5,7,6,5};
        _sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void _sort(int[] arr){
        int key=0;
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}

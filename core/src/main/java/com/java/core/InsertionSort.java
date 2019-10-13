package com.java.core;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 12/09/19
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,7,4,5,8,6,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        int j=0,key=0;
        for (int i = 1; i <arr.length ; i++) {
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

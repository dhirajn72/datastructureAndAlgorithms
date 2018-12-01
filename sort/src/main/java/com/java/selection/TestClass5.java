package com.java.selection;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/11/18
 */
public class TestClass5 {
    public static void sort(int[] arr){
        int min,temp;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[min]){
                    min=j;
                }
                temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

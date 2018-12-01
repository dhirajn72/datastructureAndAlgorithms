package com.java.bubble;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/11/18
 */
public class TestClass3 {
    public static void sort(int[] arr){
        int temp=0;
        for (int i=arr.length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,3,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

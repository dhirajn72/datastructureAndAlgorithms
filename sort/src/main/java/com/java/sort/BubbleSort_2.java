package com.java.sort;

/**
 * @author Dhiraj
 * @date 03/10/18
 */
public class BubbleSort_2 {
    public static int[] sort(int[] arr){
        int temp;
        for (int i=arr.length-1;i>=0;i--){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}

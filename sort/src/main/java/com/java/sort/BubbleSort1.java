package com.java.sort;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class BubbleSort1 {
    public int[] bubbleSort(int[] arr){
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

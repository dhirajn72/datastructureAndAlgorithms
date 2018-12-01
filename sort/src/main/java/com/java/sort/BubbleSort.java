package com.java.sort;

/**
 * @author Dhiraj
 * @date 03/05/18
 */
public class BubbleSort<T> {

    public int[] bubbleSort(int[] arr){
        if (arr==null)return null;
        for (int i=arr.length-1;i>=0;i--){
            for (int j=0;j<i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}

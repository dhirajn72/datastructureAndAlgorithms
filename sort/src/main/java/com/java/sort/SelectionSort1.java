package com.java.sort;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class SelectionSort1 {
    public int[] selectionSort(int[] arr){

        int min,temp;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}

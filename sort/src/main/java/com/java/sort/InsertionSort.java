package com.java.sort;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class InsertionSort {
    public int[] insertionSort(int[] arr){

        /*int i,j,v;
        for (i=2;i<=arr.length-1;i++){
            v=arr[i];
            j=i;
            while (arr[j-1] > v && j>=1){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;
        }*/

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}

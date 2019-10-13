package com.java.sort;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr={9,2,5,4,3,1,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){

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

        /*int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;*/

            int key=0;
            for (int i=1;i<arr.length;i++){
                key=arr[i];
                int j=i-1;
                while (j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=key;
            }
        }
}

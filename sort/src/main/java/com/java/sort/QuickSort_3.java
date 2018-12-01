package com.java.sort;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/10/18
 */
public class QuickSort_3 {

    public static void main(String[] args) {
        int[] arr={9,2,5,1,8,7,4,3};
        QuickSort_3 sort=new QuickSort_3();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void sort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private void quickSort(int[] arr,int low,int high){
     int i=low,j=high;
     int temp;
     int pivot=arr[(low+high)/2];

     while (i<j){

         while (arr[i]<pivot)
             i++;
         while (arr[j]>pivot)
             j--;

         if (i<=j){
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
     }
     if (low<j)
         quickSort(arr,low,j);
     if (i<high)
         quickSort(arr,i,high);
    }
}

package com.java.selection;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/11/18
 */
public class TestClass6 {
    public static void sort(int[] arr){
        int min,temp;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[min])
                    min=j;
                temp=arr[min];
                arr[min]=arr[j];
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={9,8,7,6,3,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

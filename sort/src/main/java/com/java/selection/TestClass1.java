package com.java.selection;

import com.java.sort.client.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 09/11/18
 */
public class TestClass1 {
    public static void sort(int[] arr){
        int min,temp;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= DataUtils.getIntArray();
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("done");


    }
}

package com.java.insertion;

import com.java.sort.client.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 13/11/18
 */
public class TestClass2 {

    public static void sort(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j>=0;j--){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ints= DataUtils.getIntArray();
        System.out.println(Arrays.toString(ints));
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}

package com.java.selection;

import com.java.sort.client.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 13/11/18
 */
public class TestClass4 {
    public static void sort(int[] arr){
        int temp,min;
        for (int i=0;i<arr.length;i++){
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
        int[] ints= DataUtils.getIntArray();
        System.out.println(Arrays.toString(ints));
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}

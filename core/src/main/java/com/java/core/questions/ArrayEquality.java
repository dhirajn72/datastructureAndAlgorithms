package com.java.core.questions;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class ArrayEquality {
    public static void main(String[] args) {

        int[] arr1={2,4,3,6,1,8};
        int[] arr2={2,4,3,6,1,8};
        boolean result= areEquals(arr1,arr2);
        System.out.println(result);
    }

    public static boolean areEquals(int[] arr1,int[] arr2){
        if (arr1.length!=arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0 ;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return  false;
            }
        }
        return true;
    }




}




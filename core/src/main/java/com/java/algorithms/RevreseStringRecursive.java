package com.java.algorithms;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 06/09/19
 */
public class RevreseStringRecursive {
    public static void main(String[] args) {
        String str="My name is dhiraj singh, and I live in bangalore and I am foody";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String[] arr=str.split(" |,|\n");
        //return reverseRecursive(arr, "");
        return reverseRecursive(arr);
    }

    private static String reverseRecursive(String[] arr) {
        if (arr.length==1)
            return arr[0];
        else {
            String[] arr2= Arrays.copyOfRange(arr,1,arr.length);
            return reverseRecursive(arr2)+" "+arr[0];
        }
    }
}

package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class Fibonacci {
    public static void main(String[] args) {
       // fiboMemoized(1000000000);
        fiboMemoizedIterative(1000000000);
    }
    private static void fiboMemoizedIterative(int n) {
        int fNumber=0;
        int sNumber=1;
        System.out.print(fNumber+","+sNumber+", ");
        while (n>0){
            int sum=fNumber+sNumber;
            System.out.print(sum+", ");
            fNumber=sNumber;
            sNumber=sum;
            n--;
        }
    }

    private static void fiboMemoized(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
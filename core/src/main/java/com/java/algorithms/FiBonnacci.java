package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 06/09/19
 */
public class FiBonnacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int n) {
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        return fibonacci(arr,n);
    }

    private static int fibonacci(int[] arr, int n) {
        if (n==0||n==1)return 1;
        if (n<0)return 0;
        return fibonacci(arr,n-1)+fibonacci(arr,n-2);
    }
}

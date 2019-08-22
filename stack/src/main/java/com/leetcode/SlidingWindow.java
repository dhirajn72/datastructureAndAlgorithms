package com.leetcode;

/**
 * @author Dhiraj
 * @date 10/07/19
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr=new int[]{1,-3,4,5,2,6,4,8,-1,4}; // [4,5,5,6,6,8,8,8]
        System.out.println(slidingWindow(arr,3));

    }
    private static int[] slidingWindow(int[] arr, int k) {
       // int max=0;
        for (int i=0;i<=arr.length-k;i++){
             int max=arr[i];
            for (int j=0;j<k;j++){
                if (arr[i+j]>max) {
                    max=arr[i+j];
                }
            }
            System.out.print(max+ ",");

        }
        return null;
    }
}

package com.karumanchi;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class MaximumSlidingWindow {
    public static void main(String[] args) {
        int[] arr= {1,3,-1,-3,5,3,6,7}; // k=3  [3,3,5,5,6,7]
        maximumSlidingWindow(arr,3);
    }

    public static void maximumSlidingWindow(int[] arr,int k){

        int max=Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-k;i++){
            for (int j = 0; j < k; j++) {
                if (arr[i+j]>arr[i]){
                    max=Math.max(max,arr[i+j]);
                }
            }
            System.out.print(max+",");
        }
    }
}

package com.leetcode;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class HouseRobber {

    public static void main(String[] args) {

    }

    public int rob(int[] arr) {
        if (arr==null||arr.length==0)return 0;
        if (arr.length==1)return arr[0];
        if (arr.length==2)return Math.max(arr[0],arr[1]);
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i < arr.length ;i++) {
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}

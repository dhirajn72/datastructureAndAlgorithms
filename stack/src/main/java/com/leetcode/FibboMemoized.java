package com.leetcode;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class FibboMemoized {
    public static void main(String[] args) {

        System.out.println( _fibo(5));
    }
    private static int _fibo(int n) {
        if (n==0)return 0;
        else if (n==1)return 1;

        int[] memo= new int[n];
        memo[0]=0;
        memo[1]=1;
        for (int i=2;i<n;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n-1]+memo[n-2];
    }
}

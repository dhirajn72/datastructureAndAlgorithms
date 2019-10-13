package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return _climbStairs(n, memo);
    }

    public static int _climbStairs(int n, int[] memo) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (memo[n] > -1)
            return memo[n];
        else {
            memo[n] = _climbStairs(n - 1, memo) + _climbStairs(n - 2, memo);
            return memo[n];
        }
    }
}

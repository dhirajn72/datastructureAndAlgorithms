package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/07/19
 */
public class LongestIncreasingSubSequense_1 {

    public static void main(String[] args) {

        System.out.println(lengthOfLIS(new int[]{-2, 1, 2, 3}));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] maxLength = new int[nums.length];
        Arrays.fill(maxLength, 1);
        int maximumSoFar = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
                }
            }
            maximumSoFar = Math.max(maximumSoFar, maxLength[i]);
        }

        return maximumSoFar;
    }
}

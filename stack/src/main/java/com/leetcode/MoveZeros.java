package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 3, 0, 12,0};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0) zeroCount++;

        while (zeroCount >0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            zeroCount--;
        }
    }
}

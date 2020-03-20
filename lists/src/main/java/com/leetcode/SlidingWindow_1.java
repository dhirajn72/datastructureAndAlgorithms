package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class SlidingWindow_1 {
    /*
Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7] []
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7}; //[3,3,5,5,6,7]
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return null;
        int max = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            max = nums[i];
            for (int j = 0; j < k; j++) {
                if (nums[i + j] > max)
                    max = nums[i + j];
            }
            integers.add(max);
            System.out.println(max);
        }
        int[] arr = new int[integers.size()];
        int index = 0;
        for (int i : integers)
            arr[index++] = i;
        return arr;
    }
}
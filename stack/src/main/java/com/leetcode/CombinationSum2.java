package com.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class CombinationSum2 {


/*

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
     */

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5}; // [1,2,5] [2,6] [1,7]
        System.out.println(combinationSum2(arr, 8));
        System.out.println();
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[candidates.length];
        int index = 0;
        for (int i : candidates) {
            if (i <= target) {
                map.put(i, i);
                arr[index++] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(target - arr[i]) != null) {
                System.out.println("[" + arr[i] + "," + map.get(target - arr[i]) + "]");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            if (sum == target) {
                System.out.println(arr[i]);
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
                if (sum > target) {
                    sum -= arr[j];
                }
                if (sum < target) {
                    if (map.get(target - sum) != null && target == sum + map.get(target - sum)) {
                        System.out.println("correct[" + sum + "," + map.get(target - sum) + "]");
                    }
                }
            }
        }
        return null;
    }
}

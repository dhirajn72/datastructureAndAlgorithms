package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/07/19
 */
public class LongestIncreasingSubSequense {

    public static void main(String[] args) {

        System.out.println(lengthOfLIS(new int[]{-2, 1, 2, 3,1,2,3,4,5,6}));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] maxLength = new int[nums.length];
        Arrays.fill(maxLength , 1);
        int maximumSoFar = 1;
  /*
    Solve the LIS subproblem for each snippet
    of the array ending between 1, 2, 3, ... and
    so on until nums.length - 1 (inclusive)

    Ex:

    [-2, 1, 2, 3]

    [-2] from index 0 to index 0
    [-2, 1] from index 0 to index 1
    [-2, 1, 2] from index 0 to index 2
    [-2, 1, 2, 3] from index 0 to index 3

    Our answer is the maximum LNDS found between
    all subproblems we solve along the way.
  */
        for (int i = 1; i < nums.length; i++) {

    /*
      At each snippet previous to the present subproblem, we
      see if we can append the item at nums[i].

      If we can we see which is greater between:

      maxLength[i]: The best answer so far for the snippet
      from 0 to i (includes both boundaries)

      and

      maxLength[j] + 1): We append this item to the LIS found
      from 0 to j (includes both boundaries). maxLength[j] has
      the LIS for this snippet. We add 1 because we extend the
      sequence by one item. The item we are solving the subproblem
      for.
    */
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]) {
                    maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
                }
            }

    /*
      We now have an answer for the subproblem going from
      0 to i (inclusive). Compete it against the LIS found
      so far
    */
            maximumSoFar = Math.max(maximumSoFar, maxLength[i]);
        }

        return maximumSoFar;
    }
}

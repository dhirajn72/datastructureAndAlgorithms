package com.java.ds.trees;

/**
 * @author Dhiraj
 * @date 22/12/19
 */

// Based on Catalan number


/**
 *
 *
 *
 Success
 Details
 Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
 Memory Usage: 33 MB, less than 5.55% of Java online submissions for Unique Binary Search Trees.
 */
public class NumTrees {
    public static void main(String[] args) {

        System.out.println(numTrees(5));
    }

    public static int numTrees(int n) {
        int[] count = new int[n + 1];

        count[0] = 1;
        count[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                count[i] = count[i] + count[j] * count[i - j - 1];
            }
        }

        return count[n];
    }
}

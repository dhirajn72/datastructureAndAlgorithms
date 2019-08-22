package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
        // “ABCDGH” and “AEDFHR” is “ADH” of length 3.
        //System.out.println(longestSubstr("ABCDGH","AEDFHR"));
        // System.out.println(longestSubstr("AGGTAB", "GXTXAYB"));
        System.out.println(longestSubstr("ABAZDC", "BACBAD"));
    }

    public static String longestSubstr(String str1, String str2) {
        int[][] matrix = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j))
                    matrix[i + 1][j + 1] = 1 + matrix[i][j];
                else
                    matrix[i + 1][j + 1] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
            }
        }

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        System.out.println(Arrays.toString(matrix[4]));
        System.out.println(Arrays.toString(matrix[5]));
        System.out.println(Arrays.toString(matrix[6]));

        StringBuilder sY = new StringBuilder();
        for (int i = str1.length(), j = str2.length(); i != 0 && j != 0; ) {
            if (matrix[i][j] == matrix[i - 1][j]) // starting from down right corner of matrix
                i--; // go left
            else if (matrix[i][j] == matrix[i][j - 1])
                j--;  // go up
            else {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    sY.append(str1.charAt(i - 1));
                i--; // go diagonal
                j--;
            }
        }
        return sY.reverse().toString();
    }
}

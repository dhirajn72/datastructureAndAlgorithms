package com.leetcode;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class LongestCommonSubSequence {
    public static void main(String[] args) {
        //System.out.println(_longestCommonSubSequence("ABAZDC", "BACBAD"));
        System.out.println(_longestCommonSubSequence("ABCBDAB", "BDCABA"));

    }
    private static String _longestCommonSubSequence(String s1, String s2) {
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    matrix[i + 1][j + 1] = 1 + matrix[i][j];
                } else {
                    matrix[i + 1][j + 1] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
                }
            }
        }
        StringBuilder builder= new StringBuilder();
        for (int i=s1.length(),j=s2.length();  i!=0 && j!=0;){
            if (matrix[i][j]==matrix[i-1][j])
                i--;
            else if (matrix[i][j]==matrix[i][j-1])
                j--;
            else {
                if (s1.charAt(i-1)==s2.charAt(j-1))
                    builder.append(s1.charAt(i-1));
                i--;
                j--;

            }
        }
        return builder.reverse().toString();
    }
}

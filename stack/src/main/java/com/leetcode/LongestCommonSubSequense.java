package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/07/19
 */
public class LongestCommonSubSequense {
    public static void main(String[] args) {

        System.out.println(_longestCommonSubSequense("ABCBDAB", "BDCABA"));

    }

    private static String _longestCommonSubSequense(String str1, String str2) {
        int[][] matrix=new int[str1.length()+1][str2.length()+1];

        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                if (str1.charAt(i)==str2.charAt(j)){
                    matrix[i+1][j+1]=1+matrix[i][j];
                }
                else {
                    matrix[i+1][j+1]=Math.max(matrix[i][j+1],matrix[i+1][j]);
                }
            }
        }
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        System.out.println(Arrays.toString(matrix[4]));
        System.out.println(Arrays.toString(matrix[5]));

        StringBuilder builder=new StringBuilder();
        for (int i = str1.length(),j=str2.length(); i !=0 && j!=0;) {
            if (matrix[i][j]==matrix[i-1][j])
                i--;
            else if (matrix[i][j]==matrix[i][j-1])
                j--;
            else {
                if (str1.charAt(i-1)==str2.charAt(j-1))
                    builder.append(str1.charAt(i-1));
                i--;
                j--;
            }

        }
        return builder.reverse().toString();
    }
}

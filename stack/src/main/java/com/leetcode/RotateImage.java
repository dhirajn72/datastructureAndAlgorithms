package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class RotateImage {
    public static void main(String[] args) {
        /*

  [1,2,3],
  [4,5,6],
  [7,8,9]
         */

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

    }

    public static void rotate(int[][] matrix) {
        if (matrix==null|| matrix.length!=matrix[0].length)return;
        int[][] res=new int[matrix.length][matrix[0].length];
        int secondIndex=0;
        for (int i=matrix.length-1;i>=0;i--){
            for (int j=0;j<matrix.length;j++){
                res[j][secondIndex]=matrix[i][j];
            }
            secondIndex++;
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                matrix[i][j]=res[i][j];
            }
        }
    }
}

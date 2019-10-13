package com.leetcode;

/**
 * @author Dhiraj
 * @date 22/07/19
 */
public class MatrixSpiralOrder {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 1,2,3,6,9,8,7,4,5
        spiralOrder(arr, arr.length, arr[0].length);
        System.out.println();
    }
    public static void spiralOrder(int[][] arr, int m, int n) {
        int rowStart = 0, columnStart = 0;
        int rowEnd = m - 1, columnEnd = n - 1;
        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            int i = rowStart, j = columnStart;
            for (j = columnStart; j <= columnEnd; j++)
                System.out.print(" " + arr[i][j]);
            for (i = rowStart + 1, j--; i <= rowEnd; i++)
                System.out.print(" " + arr[i][j]);
            for (j = columnEnd - 1, i--; j >= columnStart; j--)
                System.out.print(" " + arr[i][j]);
            for (i = rowEnd - 1, j++; i >= rowStart + 1; i--)
                System.out.print(" " + arr[i][j]);
            rowStart++;
            columnStart++;
            rowEnd--;
            columnEnd--;
        }
    }
}

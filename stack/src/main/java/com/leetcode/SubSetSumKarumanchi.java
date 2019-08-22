package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class SubSetSumKarumanchi {
    public static void main(String[] args) {
        System.out.println(_subSetSum(new int[]{3, 1,4,5,1,2},6,5));
    }
    private static int _subSetSum(int[] arr, int n, int target) {
        int i,j;
        int[][] arr1=new int[n+1][target+1];
        arr1[0][0]=0;
        for (int k = 1; k <=target ; k++) {
            arr1[0][k]=0;
        }
        for (int k = 1; k <n; k++) {
            for (int l = 1; l <target ; l++) {
                arr1[k][l]=Math.max( arr1[k-1][l],arr1[k-1][l-arr[k]]);
            }
        }
        return arr1[n][target];
    }
}

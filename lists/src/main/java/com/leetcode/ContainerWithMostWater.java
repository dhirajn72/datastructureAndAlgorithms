package com.leetcode;

/**
 * @author Dhiraj
 * @date 07/07/19
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int a[] = {1, 5, 4, 3};
        int b[] = {3, 1, 2, 4, 5};
        int[] arr1 = {5, 1, 5, 4, 4, 3, 4};
        //System.out.println(maxArea(a));
        System.out.println(maxArea(b));
        //System.out.println(maxArea(arr1));
        //System.out.println(maxArea( new int[]{3,5,4,2,3}));
       // System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int A[]) {
        int l = 0;
        int r = A.length - 1;
        int area = 0;
        while (l < r) {
            int min= Math.min(A[l], A[r]);
            System.out.println(min * (r - l));
            area = Math.max(area, min * (r - l));
            if (A[l] < A[r])
                l++;
            else
                r --;
        }
        return area;
    }
}



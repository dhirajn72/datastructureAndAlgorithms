package com.leetcode;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class IndexOfRotatedArray {
    public static void main(String[] args) {
    //nums = [4,5,6,7,0,1,2], target = 0

        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==target)return i;
        return  -1;
    }
}

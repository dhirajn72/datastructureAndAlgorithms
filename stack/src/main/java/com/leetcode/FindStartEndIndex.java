package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class FindStartEndIndex {
    public static void main(String[] args) {
        //nums = [5,7,7,8,8,10], target = 8
        //int[] arr={5,7,7,8,8,10};
        int[] arr={5,5,6,8,8,7};

        System.out.println(Arrays.toString(searchRange(arr,7)));// [3,4]
    }
    public static int[] searchRange(int[] nums, int target) {
        if (nums==null)return null;
        if (nums.length==0) return new int[]{-1,-1};
        for (int  i=0;i<nums.length;i++){
            if (nums[i]==target){
                int startIndex=i;
                int entIndex=i;
                for (int j=i;j<nums.length;j++){
                    if (nums[j]==target)
                            entIndex=j;
                }
                return new int[]{startIndex,entIndex};
            }
        }
        return new int[]{-1,-1};
    }
}

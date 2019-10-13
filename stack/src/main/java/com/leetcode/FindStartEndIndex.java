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
        int[] arr={5,5,6,8,8,8,7};

        System.out.println(Arrays.toString(searchRange(arr,8)));// [3,4]
    }
    public static int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int startIndex=-1;
        int endIndex=-1;
        while (i<=j){
            if (nums[i]!=target) {
                i++;
                continue;
            }
            else {
                startIndex=i;
                break;
            }
        }
        while (i<=j){
            if (nums[j]!=target) {
                j--;
                continue;
            }
            else {
                endIndex =j;
                break;
            }
        }
        return new int[]{startIndex,endIndex};

    }
}

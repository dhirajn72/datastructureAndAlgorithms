package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 07/07/19
 */




public class TwoSum {

    /*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
     */


    public static void main(String[] args) {

        int[] nums = {2, 11, 15,7,3};
        int target=5;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] arr, int target) {
        if (arr==null || arr.length==0)return null;
        Map<Integer,Integer> integers= new HashMap();
        int index=0;
        for (int i:arr)
            integers.put(i, index++);
        for (int i = 0; i < arr.length ; i++) {
            int search=target-arr[i];
            if (integers.get(search)!=null) {
                if (arr[i] + search == target && i != integers.get(search)) {
                    return new int[]{i, integers.get(search)};
                }
            }
        }
        return null;
    }
}

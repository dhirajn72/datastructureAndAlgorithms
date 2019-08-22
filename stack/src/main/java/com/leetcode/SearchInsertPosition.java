package com.leetcode;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
      //  [1,3,5,6], 5
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,4));
    }


    public static int searchInsert(int[] nums, int target) {
        if (target==0)return 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target)
                return i;
            else if (nums[i]<target)
                continue;
            else if (nums[i]>target)
                return i;
        }
        if (target>nums[nums.length-1])return nums.length;
        return nums.length-1;
    }
}

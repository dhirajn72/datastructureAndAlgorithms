package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
      //  int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[]arr={-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums==null|| nums.length==0)return 0;
        Set<Integer> set = new TreeSet<>();
        for (int i : nums)
            set.add(i);
        int index = 0;
        for (int i : set) {
            nums[index++]=i;
        }
        return set.size();
    }
}

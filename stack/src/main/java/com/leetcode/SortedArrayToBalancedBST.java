package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class SortedArrayToBalancedBST {
    public static void main(String[] args) {

        TreeNode_1 root = sortedArrayToBST(new int[]{1, 2, 3, 4, 5/*, 6, 7, 8, 9, 10*/});
        System.out.println(root);
        System.out.println();
        System.out.println();
    }

    public static TreeNode_1 sortedArrayToBST(int[] nums) {

        Set<Integer> integers=new HashSet<>();
        for (int i:nums)
            integers.add(i);
        nums=new int[integers.size()];
        int index=0;
        for (int i:integers){
            nums[index++]=i;
        }
        Arrays.sort(nums);
        return _createTree(nums, 0, nums.length - 1);
    }

    /**
     *
     * @param nums
     * @param low
     * @param high
     * @return
     */
    private static TreeNode_1 _createTree(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        for (int i=low;i<=high;i++)
            System.out.print(nums[i]+",");
        System.out.println();
        System.out.println("Mid::"+nums[mid]);
        System.out.println();
        TreeNode_1 node = new TreeNode_1(nums[mid]);
        node.setLeft(_createTree(nums, 0, mid - 1));
        node.setRight(_createTree(nums, mid + 1, high));
        return node;
    }
}

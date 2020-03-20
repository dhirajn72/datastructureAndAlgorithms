package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class PathSum {
    public static void main(String[] args) {
        /*

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1


         */

        TreeNode_1 root= new TreeNode_1(5);// DataUtil.getTree();
        root.setLeft(new TreeNode_1(4));
        root.setRight(new TreeNode_1(8));
        root.getLeft().setLeft(new TreeNode_1(11));
        root.getLeft().getLeft().setLeft(new TreeNode_1(7));
        root.getLeft().getLeft().setRight(new TreeNode_1(2));
        root.getRight().setLeft(new TreeNode_1(13));
        root.getRight().setRight(new TreeNode_1(4));
        root.getRight().getRight().setRight(new TreeNode_1(1));

        System.out.println(hasPathSum(root,22));

    }

    public static boolean hasPathSum(TreeNode_1 root, int sum) {
        if (root==null) return false;
        int[] arr=new int[100];
        List<List<Integer>> integers= new ArrayList<>();
        _printPath(root,arr,0,sum,integers);
        for (List<Integer> list:integers) {
            if (list.stream().mapToInt(x -> x).sum() == sum)
                return true;
        }
        return false;
    }

    private static void  _printPath(TreeNode_1 root, int[] arr, int i, int target, List<List<Integer>> integers) {
        if (root==null)return;
        arr[i++]=root.data;
        if (root.left==null && root.right==null) {
            _printArray(arr, i, target, integers);
        }
        else {
           _printPath(root.left,arr,i,target,integers);
           _printPath(root.right,arr,i,target,integers);
        }
    }
    private static void _printArray(int[] arr,int n,int target,List<List<Integer>> integers) {
        List<Integer> integers1= new ArrayList<>();
        for (int i=0;i<n;i++) {
            integers1.add(arr[i]);
        }
        integers.add(new ArrayList<Integer>(integers1));
        integers1.clear();
    }
}

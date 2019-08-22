package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class PathSum_II {
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

        TreeNode root= new TreeNode(5);// DataUtil.getTree();
        root.setLeft(new TreeNode(4));
        root.setRight(new TreeNode(8));
        root.getLeft().setLeft(new TreeNode(11));
        root.getLeft().getLeft().setLeft(new TreeNode(7));
        root.getLeft().getLeft().setRight(new TreeNode(2));
        root.getRight().setLeft(new TreeNode(13));
        root.getRight().setRight(new TreeNode(4));
        root.getRight().getRight().setRight(new TreeNode(1));

        System.out.println(pathSum(root,22));

    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null) return new ArrayList<>();
        int[] arr=new int[Integer.MAX_VALUE];
        List<List<Integer>> integers= new ArrayList<>();
        List<List<Integer>> finalList= new ArrayList<>();

        _printPath(root,arr,0,sum,integers);
        for (List<Integer> list:integers) {
            if (list.stream().mapToInt(x -> x).sum() == sum)
                //return true;
                finalList.add(list);
        }
        return finalList;
    }

    private static void  _printPath(TreeNode root, int[] arr, int i, int target,List<List<Integer>> integers) {
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

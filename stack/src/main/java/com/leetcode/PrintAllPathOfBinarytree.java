package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class PrintAllPathOfBinarytree {
    public static void main(String[] args) {
        TreeNode node= DataUtil.getTree();
        _printPaths(node);
    }

    private static void _printPaths(TreeNode node) {
        int[] arr= new int[100];
        _printPaths(arr,0,node);
    }

    private static void _printPaths(int[] arr, int i, TreeNode node) {
        if (node==null)return;
        arr[i++]=node.data;
        if (node.left==null && node.right==null){
            printArray(arr,i);
        }
        else {
            _printPaths(arr,i,node.left);
            _printPaths(arr,i,node.right);
        }
    }

    private static void printArray(int[] arr,int len) {
        for (int i=0;i<len;i++)
            System.out.print(arr[i]+"->");
        System.out.println();
    }
}

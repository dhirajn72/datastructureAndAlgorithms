package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class PrintPathsOfTree {
    public static void main(String[] args) {
        BinaryTreeNode node= DataUtils.getBinaryOrderedTree();
        _printPaths(node);
    }

    private static void _printPaths(BinaryTreeNode root) {
        if (root==null)return;
        int[] arr=new int[100];
        _printPaths(arr,0,root);
    }

    private static void _printPaths(int[] arr, int i, BinaryTreeNode root) {
        if (root==null)return;
        arr[i++]=root.data;
        if (root.left ==null && root.right==null)
            _printArray(arr,i);
        else {
            _printPaths(arr,i,root.left);
            _printPaths(arr,i,root.right);
        }

    }

    private static void _printArray(int[] arr, int i) {
        for (int j = 0; j <i ; j++)
            System.out.print(arr[j]+"-->");
        System.out.println();
    }
}

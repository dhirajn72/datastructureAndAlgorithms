package com.java.ds.tree.practice;

import com.java.ds.client.DataUtils;
import interview.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 23/09/19
 */
public class PrintPaths {

    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode=DataUtils.getBinaryOrderedTree();
        _printPaths(binaryTreeNode);

    }

    private static void _printPaths(BinaryTreeNode binaryTreeNode) {
        int[] arr=new int[100];
        _printPaths(binaryTreeNode,arr,0);
    }

    private static void _printPaths(BinaryTreeNode binaryTreeNode, int[] arr,int index) {
        if (binaryTreeNode==null)
            return;
        arr[index++]=binaryTreeNode.data;
        if (binaryTreeNode.left==null && binaryTreeNode.right==null)
            _print(index,arr);
        else {
            _printPaths(binaryTreeNode.left,arr,index);
            _printPaths(binaryTreeNode.right,arr,index);
        }
    }

    private static void _print(int index, int[] arr) {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}

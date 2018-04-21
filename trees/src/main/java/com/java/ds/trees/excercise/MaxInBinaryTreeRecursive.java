package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 18/04/18
 */
public class MaxInBinaryTreeRecursive {
    public int maxInBinaryTree(BinaryTreeNode root){
        int maxValue=Integer.MIN_VALUE;
        if (root!=null){
            int leftMax=maxInBinaryTree(root.left);
            int rightMax=maxInBinaryTree(root.right);

            if(leftMax>rightMax)
                maxValue=leftMax;
            else
                maxValue=rightMax;
            if (root.data>maxValue)
                maxValue=root.data;
        }
        return maxValue;
    }
}

package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class PreorderRecursiveTraversal {
    public void preorderRecursiveTraversal(BinaryTreeNode root){
        if (root!=null){
            System.out.print (root.data+", ");
            preorderRecursiveTraversal(root.left);
            preorderRecursiveTraversal(root.right);
        }
    }
}

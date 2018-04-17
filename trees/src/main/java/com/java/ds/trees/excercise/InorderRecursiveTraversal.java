package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class InorderRecursiveTraversal {
    public void inorderRecursiveTraversal(BinaryTreeNode root){
        if (root!=null){
            inorderRecursiveTraversal(root.left);
            System.out.print(root.data+", ");
            inorderRecursiveTraversal(root.right);
        }
    }
}

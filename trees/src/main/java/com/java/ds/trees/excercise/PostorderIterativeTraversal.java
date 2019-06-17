package com.java.ds.trees.excercise;

import com.java.ds.client.DataUtils;
import com.java.ds.trees.BinarySearchTreeNode;
import interview.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class PostorderIterativeTraversal {

    public static void main(String[] args) {
        BinaryTreeNode root=DataUtils.getBinaryTree();
        //postOrderTraversal(root);
        System.out.println(root);
        //ArrayList<Integer> post=postorderIterativeTraversal(root);
        //System.out.println(post);
        ArrayList<ArrayList<Integer>> level=LevelOrder.levelOrder(root);
        System.out.println(level);
    }

}

/*
        [12]
       /    \
   [23]     [56]
   /  \     /  \
 [22] [65][88] [99]
  /
[45]

 */


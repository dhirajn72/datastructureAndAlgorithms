package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/01/19
 */
public class PostOrderIterativeTraversal_2 {

    public static ArrayList<Integer> postOrder(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.peek();
            if (prev == null || prev.left == currentNode || prev.right == currentNode) {
                if (currentNode.left != null)
                    stack.push(currentNode.left);
                else if (currentNode.right != null)
                    stack.push(currentNode.right);
            } else if (currentNode.left == prev) {
                if (currentNode.right != null)
                    stack.push(currentNode.right);
            }
                else {
                    res.add(currentNode.getData());
                    stack.pop();
                }
            prev = currentNode;
        }
        return res;
    }
}

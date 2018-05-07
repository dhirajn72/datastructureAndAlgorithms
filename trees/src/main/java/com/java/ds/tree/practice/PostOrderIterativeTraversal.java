package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class PostOrderIterativeTraversal {

    public ArrayList<Integer> postOrderIterativeTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        BinaryTreeNode prev = null;
        while (!s.isEmpty()) {
            BinaryTreeNode currentNode = s.peek();
            if (prev == null || prev.left == currentNode || prev.right == currentNode) {
                if (currentNode.left != null)
                    s.push(currentNode.left);
                else if (currentNode.right != null)
                    s.push(currentNode.right);
            } else if (currentNode.left == prev) {
                if (currentNode.right != null)
                    s.push(currentNode.right);
            } else {
                res.add(currentNode.getData());
                s.pop();
            }
            prev = currentNode;

        }
        return res;
    }
}

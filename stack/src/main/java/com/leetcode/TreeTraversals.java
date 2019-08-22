package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class TreeTraversals {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.setRight(new TreeNode(3));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));
        //System.out.println(inorderTraversal(root));
        System.out.println(preorderTraversal(root));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        Stack<TreeNode> s = new Stack<>();
        //s.push(root);
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.getLeft();
            } else {
                TreeNode node = s.pop();
                integers.add(node.getData());
                root = node.getRight();
            }
        }
        return integers;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode temp = s.pop();
            integers.add(temp.data);
            if (temp.right != null)
                s.push(temp.right);
            if (temp.left != null)
                s.push(temp.left);
        }
        return integers;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        Stack<Integer> out= new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            TreeNode temp=s.pop();
            out.push(temp.getData());
            if (temp.left!=null)
                s.push(temp.right);
            if (temp.right!=null)
                s.push(temp.left);
        }
        while (!out.isEmpty())
            integers.add(out.pop());
        return integers;
    }
}

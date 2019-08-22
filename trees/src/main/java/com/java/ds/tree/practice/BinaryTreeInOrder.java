package com.java.ds.tree.practice;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/07/19
 */
public class BinaryTreeInOrder {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        System.out.println(root);
        _inOrder(root); //[4,2,5,1,6,3,7]
    }

    private static void _inOrder(BinaryTreeNode root) {
        if (root == null) return;
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode temp = root;
        while (!s.isEmpty() || temp != null) {
            if (temp != null) {
                s.push(temp);
                temp = temp.getLeft();
            } else {
                BinaryTreeNode node = s.pop();
                System.out.print(node.data + ",");
                temp = node.right;
            }
        }
    }
}



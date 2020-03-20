package com.leetcode;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class TreeNode_1 {
    int data;
    TreeNode_1 left;
    TreeNode_1 right;

    public TreeNode_1(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode_1 getLeft() {
        return left;
    }

    public void setLeft(TreeNode_1 left) {
        this.left = left;
    }

    public TreeNode_1 getRight() {
        return right;
    }

    public void setRight(TreeNode_1 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 29/01/19
 */
public class BinarySearchTreeNode {
     int data;
     BinarySearchTreeNode left;
     BinarySearchTreeNode right;

    public BinarySearchTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinarySearchTreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

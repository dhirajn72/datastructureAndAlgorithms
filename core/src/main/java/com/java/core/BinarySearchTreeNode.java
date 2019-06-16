package com.java.core;

/**
 * @author Dhiraj
 * @date 12/05/19
 */
public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode(int data, BinarySearchTreeNode left, BinarySearchTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
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

    public BinarySearchTreeNode reverse() {
        BinarySearchTreeNode left = null, right = null;
        if (this.getLeft() != null)
            left=this.getLeft().reverse();
        if (this.getRight() != null)
            right=this.getRight().reverse();
        return new BinarySearchTreeNode(this.getData(), left, right);

    }
}

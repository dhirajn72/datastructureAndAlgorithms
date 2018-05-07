package com.java.ds.trees.excercise;

import com.java.ds.trees.BinarySearchTreeNode;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class BinarySearchTreeOperations {
    public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {

        if (root == null) {
            root = new BinarySearchTreeNode(data);
            if (root == null) {
                System.out.println("Out of Memory error");
            }
        } else {
            if (data < root.getData())
                root.setLeft(insert(root.getLeft(), data));
            if (data > root.getData())
                root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode temp;
        if (root == null){
            System.out.println("No elements in tree !!");
            return null;
        }
        else if (data < root.getData()) {
            root.left = delete(root.left, data);
        } else if (data > root.getData()) {
            root.right = delete(root.right, data);
        } else {
            if (root.getLeft() == null)
                return root.getRight();
            else if (root.getRight() == null)
                return root.getLeft();
            BinarySearchTreeNode min=findMin(root.right);
            root.data=min.getData();
            root.right=delete(root.right,root.getData());
        }
        return root;
    }

    public BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root==null)return null;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    public BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
        if (root == null)
            return null;
        while (root.getRight() != null)
            root = root.getRight();
        return root;
    }


}

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
        } else {
            if (data < root.getData())
                root.setLeft(insert(root.getLeft(), data));
            if (data > root.getData())
                root.setRight(insert(root.getRight(), data));
        }
        return root;
    }


    public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data) {
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

    public BinarySearchTreeNode findMinRecursively(BinarySearchTreeNode root) {
        if (root==null)return null;
        if (root.getLeft()!=null)
            return findMinRecursively(root.getLeft());
        return root;
    }
    public BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
        if (root == null)
            return null;
        while (root.getRight() != null)
            root = root.getRight();
        return root;
    }
    public BinarySearchTreeNode findMaxRecursively(BinarySearchTreeNode root) {
        if (root == null)
            return null;
        if (root.getRight()!=null)
            return findMaxRecursively(root.getRight());
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTreeNode root= new BinarySearchTreeNode(50);
        BinarySearchTreeOperations treeOperations= new BinarySearchTreeOperations();
        /*int i=100;
        while (i!=0){
            treeOperations.insert(root,i);
            i--;
        }
        System.out.println();*/

        treeOperations.insert(root,50);
        treeOperations.insert(root,65);
        treeOperations.insert(root,70);
        treeOperations.insert(root,60);
        treeOperations.insert(root,45);
        treeOperations.insert(root,48);
        treeOperations.insert(root,69);



        System.out.println(treeOperations.findMin(root).data);
        System.out.println(treeOperations.findMinRecursively(root).data);
        System.out.println("*****");
        System.out.println(treeOperations.findMax(root).data);
        System.out.println(treeOperations.findMaxRecursively(root).data);

        treeOperations.delete(root,65);
        System.out.println();

    }
}

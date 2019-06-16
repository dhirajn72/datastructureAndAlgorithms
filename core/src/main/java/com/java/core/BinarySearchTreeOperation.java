package com.java.core;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 12/05/19
 */
public class BinarySearchTreeOperation {

    public static void main(String[] args) {
        BinarySearchTreeOperation operation = new BinarySearchTreeOperation();
        BinarySearchTreeNode root = new BinarySearchTreeNode(50);
        //root.setRight(new BinarySearchTreeNode(10));
        operation.insert(root, 49);
        operation.insert(root, 52);
        operation.insert(root, 51);
        operation.insert(root, 53);

        /**
         *                  50
         *               /       \
         *            49          52
         *                      /   \
         *                    51     53
         *
         *
         *
         */


        /*operation.insert(root, 51);
        operation.insert(root, 53);*/


        /*operation.insert(root, 65);
        operation.insert(root, 34);
        operation.insert(root, 67);
        operation.insert(root, 66);
        operation.insert(root, 42);
        operation.insert(root, 12);
        System.out.println(root);
        System.out.println(operation.min(root));
        System.out.println(operation.max(root));*/
        System.out.println(root);
        System.out.println(operation.delete(root, 52));
        // System.out.println(operation.reverse(root));
        //System.out.println(operation.isValidBST(root));
        //System.out.println(operation.MirrorOfBinaryTree(root));
        System.out.println();
        //System.out.println(operation.minRecursive(root));



    }

    public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
        if (root == null)
            return new BinarySearchTreeNode(data);
        else {
            if (data > root.getData())
                root.setRight(insert(root.getRight(), data));
            else
                root.setLeft(insert(root.getLeft(), data));
        }
        return root;
    }


    public BinarySearchTreeNode min(BinarySearchTreeNode root) {
        if (root == null) return root;
        while (root.getLeft() != null)
            root = root.getLeft();
        return root;
    }

    public BinarySearchTreeNode minRecursive(BinarySearchTreeNode root) {
        if (root == null) return root;
        else {
            if (root.getLeft() == null) return root;
            return minRecursive(root.getLeft());
        }
    }

    public BinarySearchTreeNode max(BinarySearchTreeNode root) {
        if (root == null) return root;
        while (root.getRight() != null)
            root = root.getRight();
        return root;
    }

    /*public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data) {
        if (root == null) {
            System.out.println("Tree is null");
        } else if (data < root.getData()) {
            root.setLeft(delete(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(delete(root.getRight(), data));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            BinarySearchTreeNode min = min(root.getRight()); // Minimum of right should become the root of deleted node, that will satisfy the BST property
            root.setData(min.getData());
            root.setRight(delete(min.getRight(), min.getData()));
        }
        return root;
    }*/


    /*public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data) {
        if (root == null) {
            System.out.println("Tree is null");
        } else if (data < root.getData()) {
            root.setLeft(delete(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(delete(root.getRight(), data));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            BinarySearchTreeNode min = min(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(), min.getData()));
        }
        return root;
    }*/

    /**
     * FIXME! This doesn't work as expected
     */
    public BinarySearchTreeNode reverse(BinarySearchTreeNode root) {
        return root.reverse();
    }

    public boolean isValidBST(BinarySearchTreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(BinarySearchTreeNode root, int minValue, int maxValue) {
        if (root == null) return true;
        return (root.getData() > minValue && root.getData() < maxValue && isBST(root.getLeft(), minValue, root.getData()) && isBST(root.getRight(), root.getData(), maxValue));
    }

    public BinarySearchTreeNode MirrorOfBinaryTree(BinarySearchTreeNode root) {
        BinarySearchTreeNode temp;
        if (root != null) {
            MirrorOfBinaryTree(root.getRight());
            MirrorOfBinaryTree(root.getLeft());

            temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }
        return root;
    }

    public BinarySearchTreeNode delete(BinarySearchTreeNode root,int data){
        if (root==null) System.out.println("Root is null");
        else if (data>root.getData()){
            root.setRight(delete(root.getRight(),data));
        }
        else if (data<root.getData()){
            root.setLeft(delete(root.getLeft(),data));
        }
        else {
            if (root.getRight()==null)
                return root.getLeft();
            else if (root.getLeft()==null)
                return root.getRight();
            BinarySearchTreeNode min=min(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(),min.getData()));
        }
        return root;
    }






}

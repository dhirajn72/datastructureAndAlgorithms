package com.java.ds.tree.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 10/06/19
 */
public class LevelOrderInsertionBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(7);

        insert(root, 4);
        insert(root, 6);
        insert(root, 8);
        insert(root, 3);
        insert(root, 1);
        insert(root, 2);
        insert(root, 100);

        System.out.println(root);
        //delete(root, 6);
        System.out.println();
        System.out.println(findDeepestNode(root));

    }

    private static BinaryTreeNode delete(BinaryTreeNode root, int data) {
        if (root == null) {
            System.out.println("No elements to delete !");
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
            BinaryTreeNode min = findMin(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(), min.getData()));
        }
        return root;

    }

    public static BinaryTreeNode findDeepestNode(BinaryTreeNode root){
        if (root==null)
            return null;
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        BinaryTreeNode temp=null;
        while (!q.isEmpty()){
            temp=q.poll();
            if (temp.getLeft()!=null)
                q.offer(temp.getLeft());
            if (temp.getRight()!=null)
                q.offer(temp.getRight());
        }
        return temp;
    }

    private static BinaryTreeNode findMin(BinaryTreeNode node) {
        BinaryTreeNode temp = node;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp;
    }
    private static void insert(BinaryTreeNode root, int data) {
        if (root==null){
            root=new BinaryTreeNode(data);
            return;
        }
        Queue<BinaryTreeNode>  q= new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp.getLeft()!=null)
                q.offer(temp.getLeft());
            else {
                temp.setLeft(new BinaryTreeNode(data));
                return;
            }
            if (temp.getRight()!=null)
                q.offer(temp.getRight());
            else {
                temp.setRight(new BinaryTreeNode(data));
                return;
            }
        }
    }
}


class BinaryTree {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
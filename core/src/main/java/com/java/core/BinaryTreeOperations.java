package com.java.core;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 12/05/19
 */
public class BinaryTreeOperations {
    public static void main(String[] args) {
        BinaryTreeOperations operations = new BinaryTreeOperations();
        BinaryTreeNode root = new BinaryTreeNode(50);
        operations.insert(root, 46);
        operations.insert(root, 38);
        operations.insert(root, 12);
        operations.insert(root, 89);
        operations.insert(root, 86);
        operations.insert(root, 54);
        System.out.println(root);
        /**
         *                  50
         *               /      \
         *            46          89
         *           /          /
         *         38         86
         *        /           /
         *      12          54
         *
         *
         *
         */
        System.out.println(operations.max(root));
        System.out.println(operations.min(root));

        System.out.println(operations.maxInLevelOrder(root));


    }

    public void insert(BinaryTreeNode root, int data) {
        if (root == null)
            root = new BinaryTreeNode(data);
        else
            insertHelper(root, data);
    }

    private void insertHelper(BinaryTreeNode root, int data) {
        if (data >= root.getData()) {
            if (root.getRight() == null) {
                root.setRight(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getRight(), data);
            }
        } else {
            if (root.getLeft() == null)
                root.setLeft(new BinaryTreeNode(data));
            else
                insertHelper(root.getLeft(), data);
        }
    }


    public int max(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = max(root.getLeft());
            int rightMax = max(root.getRight());
            if (leftMax > rightMax) {
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }
            if (root.getData() > maxValue) {
                maxValue = root.getData();
            }
        }
        return maxValue;
    }

    public int min(BinaryTreeNode root) {
        int minValue = Integer.MAX_VALUE;
        if (root != null) {
            int minLeft = min(root.getLeft());
            int minRight = min(root.getRight());
            if (minLeft < minValue) {
                minValue = minLeft;
            } else {
                minValue = minRight;
            }
            if (root.getData() < minValue)
                minValue = root.getData();
        }
        return minValue;
    }

    public int maxInLevelOrder(BinaryTreeNode root){
        if (root==null)return Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        Queue<BinaryTreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            BinaryTreeNode temp=queue.poll();
            if (temp.getData()>max){
                max=temp.getData();
            }
            if (temp!=null){
                if (temp.getLeft()!=null)
                    queue.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    queue.offer(temp.getRight());

            }
        }
        return max;
    }
}

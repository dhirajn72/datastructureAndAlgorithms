package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 10/06/19
 */


import java.util.LinkedList;
import java.util.Queue;

public class AddNodeInBinaryTree {
    private Node rootNode;

    public AddNodeInBinaryTree() {

        addNodeInBinaryTree(rootNode, 1);
        addNodeInBinaryTree(rootNode, 2);
        addNodeInBinaryTree(rootNode, 3);
        addNodeInBinaryTree(rootNode, 4);
        addNodeInBinaryTree(rootNode, 5);

        printTreeLevelOrder(rootNode);
    }

    public static void main(String[] args) {
        new AddNodeInBinaryTree();
    }

    //Iterative way of adding new Node in Binary Tree.
    private void addNodeInBinaryTree(Node rootNode, int data) {
        if (rootNode == null) {
            this.rootNode = new Node(data);
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(rootNode);
            while (!q.isEmpty()) {
                Node node = q.poll();

                if (node.getLeft() != null && node.getRight() != null) {
                    q.add(node.getLeft());
                    q.add(node.getRight());
                } else {
                    if (node.getLeft() == null) {
                        node.setLeft(new Node(data));
                    } else {
                        node.setRight(new Node(data));
                    }
                    break;
                }
            }
        }

    }

    private void printTreeLevelOrder(Node rootNode) {
        if (rootNode == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(rootNode);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.getData() + " ");

            if (node.getLeft() != null)
                q.add(node.getLeft());

            if (node.getRight() != null)
                q.add(node.getRight());
        }

    }

}

class Node{
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
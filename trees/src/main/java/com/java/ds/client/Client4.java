package com.java.ds.client;

import com.java.ds.trees.BinarySearchTreeNode;
import com.java.ds.trees.excercise.BinarySearchTreeOperations;
import com.java.ds.trees.excercise.LevelOrderTraversalBinarySearchTreeNode;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class Client4 {
    public static void main(String[] args) {
        BinarySearchTreeNode root= new BinarySearchTreeNode(20);
        root.setLeft(new BinarySearchTreeNode(15));
        root.getLeft().setLeft(new BinarySearchTreeNode(14));
        root.getLeft().setRight(new BinarySearchTreeNode(19));
        root.setRight(new BinarySearchTreeNode(30));
        root.getRight().setLeft(new BinarySearchTreeNode(25));
        root.getRight().setRight(new BinarySearchTreeNode(35));




        BinarySearchTreeOperations binarySearchTreeOperations= new BinarySearchTreeOperations();
        /*binarySearchTreeOperations.insert(root,150);
        binarySearchTreeOperations.insert(root,50);*/
        /*binarySearchTreeOperations.insert(root,40);
        root=binarySearchTreeOperations.insert(root,45);*/
        System.out.println(root);
        System.out.println(">>>>LevelOrder traversal of BinarySearchTreeNode>>>>>");
        LevelOrderTraversalBinarySearchTreeNode levelOrderTraversalBinarySearchTreeNode= new LevelOrderTraversalBinarySearchTreeNode();
        System.out.println(levelOrderTraversalBinarySearchTreeNode.levelOrderTraversalBinarySearchTreeNode(root));
        System.out.println(">>>Deletion>>>>");
        System.out.println(binarySearchTreeOperations.delete(root,20));
       // System.out.println(levelOrderTraversalBinarySearchTreeNode.levelOrderTraversalBinarySearchTreeNode(root));
        System.out.println();


    }
}

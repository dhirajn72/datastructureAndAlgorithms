package com.java.ds.client;

import com.java.ds.tree.practice.PreOrderIterativeTraversal;
import com.java.ds.trees.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 15/11/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(12);
        binaryTreeNode.left=new BinaryTreeNode(23);
        binaryTreeNode.left.left=new BinaryTreeNode(22);
        binaryTreeNode.left.left.left=new BinaryTreeNode(45);
        binaryTreeNode.left.right=new BinaryTreeNode(65);
        binaryTreeNode.right=new BinaryTreeNode(56);
        binaryTreeNode.right.left=new BinaryTreeNode(88);
        binaryTreeNode.right.right=new BinaryTreeNode(99);

        /*      12
              /    \
            23      56
          /   \     / \
        22     65  88  99
       /
      45

        */

        //preorder: 45,22,23,65,12,88,56,99


        PreOrderIterativeTraversal preorder=new PreOrderIterativeTraversal();
        System.out.println(binaryTreeNode);
        preorder.preOrderRecursiveTraversal(binaryTreeNode);
        System.out.println();
        System.out.println(binaryTreeNode);



    }
}

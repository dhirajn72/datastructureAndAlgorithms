package com.java.ds.client;


import interview.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 15/02/19
 */
public class DataUtils {

    public static BinaryTreeNode getBinaryTree(){
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

        //preorder: 12,23,22,45,65,56,88,99
        //postorder: 45,22,65,23,88,99,56,12
        //levelorder: [[12],[23,56],[22,65,88,99],[45]]

        return binaryTreeNode;
    }
    public static BinaryTreeNode getBinaryOrderedTree(){
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(1);
        binaryTreeNode.left=new BinaryTreeNode(2);
        binaryTreeNode.left.left=new BinaryTreeNode(4);
        binaryTreeNode.left.right=new BinaryTreeNode(5);
        binaryTreeNode.right=new BinaryTreeNode(3);
        binaryTreeNode.right.left=new BinaryTreeNode(6);
        binaryTreeNode.right.right=new BinaryTreeNode(7);

        /*      1
              /    \
            2      3
          /   \     / \
        4     5   6    7


        */

        //preorder: 1,2,4,5,3,6,7
        //postorder: 4,5,2,6,7,3,1
        //Inorder: 4,2,5,1,6,3,7
        //levelorder: [[1],[2,3],[4,5,6,7]]

        return binaryTreeNode;
    }

    public static BinaryTreeNode getLeftSkeewedBinaryOrderedTree(){
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.getLeft().setLeft(new BinaryTreeNode(3));
        root.getLeft().getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().getLeft().getLeft().setLeft(new BinaryTreeNode(5));
        root.getLeft().getLeft().getLeft().getLeft().setLeft(new BinaryTreeNode(6));
        return root;
    }




}

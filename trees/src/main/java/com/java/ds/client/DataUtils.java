package com.java.ds.client;


import interview.BinarySearchTreeNode;
import interview.BinaryTreeNode;
import interview.TreeNode;

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

         /*
                 1
              /    \
            2      3
          /   \     / \
        4     5   6    7

        */

        //preorder: 1,2,4,5,3,6,7
        //postorder: 4,5,2,6,7,3,1
        //Inorder: 4,2,5,1,6,3,7
        //levelorder: [[1],[2,3],[4,5,6,7]]

        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(1);
        binaryTreeNode.left=new BinaryTreeNode(2);
        binaryTreeNode.left.left=new BinaryTreeNode(4);
     //   binaryTreeNode.left.left.left=new BinaryTreeNode(40);  // Diameter testing
     //   binaryTreeNode.left.left.left.right=new BinaryTreeNode(400);  // Diameter testing


        binaryTreeNode.left.right=new BinaryTreeNode(5);
  //      binaryTreeNode.left.right.left=new BinaryTreeNode(50); // Diameter testing
  //      binaryTreeNode.left.right.left.right=new BinaryTreeNode(500); // Diameter testing

        binaryTreeNode.right=new BinaryTreeNode(3);
        binaryTreeNode.right.left=new BinaryTreeNode(6);
        binaryTreeNode.right.right=new BinaryTreeNode(7);
        return binaryTreeNode;
    }

    public static BinaryTreeNode getBinaryMirrorOrderedTree(){

         /*
                 1
              /    \
            3       2
          /   \     / \
        7     6   5    4


        */
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(1);
        binaryTreeNode.left=new BinaryTreeNode(3);
        binaryTreeNode.left.left=new BinaryTreeNode(7);
        //binaryTreeNode.left.left.left=new BinaryTreeNode(40);  // Diameter testing
        //binaryTreeNode.left.left.left.right=new BinaryTreeNode(400);  // Diameter testing


        binaryTreeNode.left.right=new BinaryTreeNode(6);
        // binaryTreeNode.left.right.left=new BinaryTreeNode(50); // Diameter testing
        //binaryTreeNode.left.right.left.right=new BinaryTreeNode(500); // Diameter testing

        binaryTreeNode.right=new BinaryTreeNode(2);
        binaryTreeNode.right.left=new BinaryTreeNode(5);
        //binaryTreeNode.right.left.right=new BinaryTreeNode(9);  // Diameter testing
        binaryTreeNode.right.right=new BinaryTreeNode(4);
        //binaryTreeNode.left.left.right=new BinaryTreeNode(8);  // Diameter testing
        return binaryTreeNode;
    }


    public static BinaryTreeNode getLeftSkeewedBinaryOrderedTree(){
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.getLeft().setLeft(new BinaryTreeNode(3));
        root.getLeft().getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().getLeft().getLeft().setLeft(new BinaryTreeNode(5));
        root.getLeft().getLeft().getLeft().getLeft().setLeft(new BinaryTreeNode(6));


        /**
         *                          1
         *                         /
         *                        2
         *                       /
         *                      3
         *                     /
         *                    4
         *                   /
         *                  5
         *                 /
         *                6
         *
         *
         */

        return root;
    }

    public static BinaryTreeNode getSmallBinaryOrderedTree(){
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));


        /**
         *                          1
         *                         / \
         *                        2  3
         *
         */

        return root;
    }


    public static TreeNode getTreeNode() {
        TreeNode treeNode= new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        treeNode.left.left=new TreeNode(4);
        treeNode.left.right=new TreeNode(5);
        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(7);
        return treeNode;
    }

    /**
                        10
                8                 12
            7        9      11         13


     * @return root
     */

    public static BinaryTreeNode getBinarySearchTree(){
        BinaryTreeNode root= new BinaryTreeNode(10);
        root.setLeft(new BinaryTreeNode(8));
        root.getLeft().setLeft(new BinaryTreeNode(7));
        root.getLeft().setRight(new BinaryTreeNode(9));
        root.setRight(new BinaryTreeNode(12));
        root.getRight().setRight(new BinaryTreeNode(13));
        root.getRight().setLeft(new BinaryTreeNode(11));
        return root;

    }
    public static TreeNode getBSTTreeNode(){
        TreeNode root= new TreeNode(10);
        root.setLeft(new TreeNode(8));
        root.getLeft().setLeft(new TreeNode(7));
        root.getLeft().setRight(new TreeNode(9));
        root.setRight(new TreeNode(12));
        root.getRight().setRight(new TreeNode(13));
        root.getRight().setLeft(new TreeNode(11));
        return root;

    }   public static BinarySearchTreeNode getBinarySearchTreeNode(){
        BinarySearchTreeNode root= new BinarySearchTreeNode(10);
        root.setLeft(new BinarySearchTreeNode(8));
        root.getLeft().setLeft(new BinarySearchTreeNode(7));
        root.getLeft().setRight(new BinarySearchTreeNode(9));
        root.setRight(new BinarySearchTreeNode(12));
        root.getRight().setRight(new BinarySearchTreeNode(13));
        root.getRight().setLeft(new BinarySearchTreeNode(11));
        return root;

    }
}

package com.java.ds.client;

import com.java.ds.trees.*;
import com.java.ds.trees.excercise.MaxInBinaryTreeRecursive;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class Client1 {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(12);
        binaryTreeNode.left=new BinaryTreeNode(23);
        binaryTreeNode.left.left=new BinaryTreeNode(22);
        binaryTreeNode.left.left.left=new BinaryTreeNode(45);
        binaryTreeNode.left.right=new BinaryTreeNode(65);
        binaryTreeNode.right=new BinaryTreeNode(56);
        binaryTreeNode.right.left=new BinaryTreeNode(88);
        binaryTreeNode.right.right=new BinaryTreeNode(99);

        System.out.println(binaryTreeNode.toString());

        System.out.println("#####");
        /*System.out.println("******iterative preorder(original)*****");
        PreOrderIterative preOrderIterative= new PreOrderIterative();
        System.out.println(preOrderIterative.preorderTraversal(binaryTreeNode));
        System.out.println("******iterative preorder(mine)*****");
        PreorderIterativeTraversal preorderIterativeTraversal= new PreorderIterativeTraversal();
        System.out.println(preorderIterativeTraversal.preorderIterativeTraversal(binaryTreeNode));
        */

        /*System.out.println("\n*****iterative inorder(original)******");
        InOrderIterative inOrderIterative= new InOrderIterative();
        System.out.println(inOrderIterative.inorderTraversal(binaryTreeNode));
        System.out.println("\n*****iterative inorder(mine)******");
        InorderIterativeTraversal inorderIterativeTraversal= new InorderIterativeTraversal();
        System.out.println(inorderIterativeTraversal.inorderIterativeTraversal(binaryTreeNode));*/


        /*System.out.println("\n*****recursive inorder(original)******");
        InOrderRecursive inOrderRecursive= new InOrderRecursive();
        inOrderRecursive.InOrder(binaryTreeNode);
        System.out.println("\n*****recursive inorder(mine)******");
        InorderRecursiveTraversal inorderRecursiveTraversal= new InorderRecursiveTraversal();
        inorderRecursiveTraversal.inorderRecursiveTraversal(binaryTreeNode);*/

        /*System.out.println("\n*****recursive postorder(original)******");
        PostOrderIterative postOrderIterative= new PostOrderIterative();
        System.out.println(postOrderIterative.postorderTraversal(binaryTreeNode));
        /*System.out.println("\n*****recursive postorder(mine)******");
        PostorderIterativeTraversal postorderIterativeTraversal= new PostorderIterativeTraversal();
        System.out.println(postorderIterativeTraversal.postorderIterativeTraversal(binaryTreeNode));*/

        /*PreOrderIterative preOrderIterative= new PreOrderIterative();
        System.out.println(preOrderIterative.preorderTraversal(binaryTreeNode));
        System.out.println("******iterative preorder(mine)*****");
        Pre_OrderIterativeTraversal pre_orderIterativeTraversal= new Pre_OrderIterativeTraversal();
        System.out.println(pre_orderIterativeTraversal.preorderTraversal(binaryTreeNode));*/

        /*System.out.println("\n*****iterative inorder(original)******");
        InOrderIterative inOrderIterative= new InOrderIterative();
        System.out.println(inOrderIterative.inorderTraversal(binaryTreeNode));
        System.out.println("\n*****iterative inorder(mine)******");
        In_OrderIterativeTraversal in_orderIterativeTraversal= new In_OrderIterativeTraversal();
        System.out.println(in_orderIterativeTraversal.inorderTraversal(binaryTreeNode));*/


        /*System.out.println("\n*****recursive postorder(original)******");
        PostOrderIterative postOrderIterative= new PostOrderIterative();
        System.out.println(postOrderIterative.postorderTraversal(binaryTreeNode));
        System.out.println("*****recursive postorder(mine)******");
        Post_OrderIterativeTraversal post_orderIterativeTraversal= new Post_OrderIterativeTraversal();
        System.out.println(post_orderIterativeTraversal.postOrderIterativeTraversal(binaryTreeNode));*/

        MaxInBinaryTreeRecursive maxInBinaryTree= new MaxInBinaryTreeRecursive();
        System.out.println(maxInBinaryTree.maxInBinaryTree(binaryTreeNode));

    }
}
/*
        [12]
       /    \
   [23]     [56]
   /  \     /  \
 [22] [65][88] [99]
  /
[45]


 */
package com.java.ds.client;

import com.java.ds.trees.BinaryTreeNode;
import com.java.ds.trees.InOrderIterative;
import com.java.ds.trees.PostOrderIterative;

/**
 * @author Dhiraj
 * @date 26/04/18
 */
public class Client2 {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(12);
        binaryTreeNode.left=new BinaryTreeNode(23);
        /*binaryTreeNode.left.left=new BinaryTreeNode(22);
        binaryTreeNode.left.left.left=new BinaryTreeNode(45);
        binaryTreeNode.left.right=new BinaryTreeNode(65);
        binaryTreeNode.right=new BinaryTreeNode(56);
        binaryTreeNode.right.left=new BinaryTreeNode(88);
        binaryTreeNode.right.right=new BinaryTreeNode(99);*/

        System.out.println(binaryTreeNode.toString());

        System.out.println("#####");
        System.out.println("******iterative preorder(original)*****");
        InOrderIterative inOrderIterative= new InOrderIterative();
        System.out.println(inOrderIterative.inorderTraversal(binaryTreeNode));
        System.out.println("******iterative preorder(mine)*****");

        System.out.println("******iterative postorder(original)*****");
        PostOrderIterative postOrderIterative= new PostOrderIterative();
        System.out.println(postOrderIterative.postorderTraversal(binaryTreeNode));
        System.out.println("******iterative postorder(mine)*****");
        System.out.println("******iterative postorder(mine)*****");




    }
}

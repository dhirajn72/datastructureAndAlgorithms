package com.java.ds.client;

import com.java.ds.tree.practice.*;
import com.java.ds.trees.*;
import com.java.ds.trees.excercise.In_Order_IterativeTraversal;
import com.java.ds.trees.excercise.Post_Order_IterativeTraversal;
import com.java.ds.trees.excercise.PreOrder_IterativeTraversal;

/**
 * @author Dhiraj
 * @date 30/04/18
 */
public class Client3 {
    public static void main(String[] args) {
        BinaryTreeNode root= new BinaryTreeNode(1);
        root.left=new BinaryTreeNode(2);
        root.left.left= new BinaryTreeNode(4);
        root.left.right= new BinaryTreeNode(5);
        root.right=new BinaryTreeNode(3);
        root.right.left= new BinaryTreeNode(6);
        root.right.right=new BinaryTreeNode(7);
        System.out.println(root);

        /*System.out.println("****Post Order Karumanchi******");
        PostOrderIterative postOrderIterative= new PostOrderIterative();
        System.out.println(postOrderIterative.postorderTraversal(root));
        System.out.println("****Post Order Mine******");
        PostOrderIterativeTraversal postOrderIterativeTraversal= new PostOrderIterativeTraversal();
        System.out.println(postOrderIterativeTraversal.postOrderIterativeTraversal(root));
        System.out.println("****InOrder Karumanchi******");
        InOrderIterative inOrderIterative= new InOrderIterative();
        System.out.println(inOrderIterative.inorderTraversal(root));
        System.out.println("****InOrder Mine******");
        InOrderIterativeTraversal inOrderIterativeTraversal= new InOrderIterativeTraversal();
        System.out.println(inOrderIterativeTraversal.inOrderIterativeTraversal(root));

        System.out.println("****PreOrder Karumanchi******");
        PreOrderIterative preOrderIterative= new PreOrderIterative();
        System.out.println(preOrderIterative.preorderTraversal(root));
        System.out.println("****PreOrder Mine******");
        PreOrderIterativeTraversal preOrderIterativeTraversal= new PreOrderIterativeTraversal();
        System.out.println(preOrderIterativeTraversal.preOrderIterativeTraversal(root));
        System.out.println("****LevelOrder Karumanchi******");
        LevelOrder levelOrder= new LevelOrder();
        System.out.println(levelOrder.levelOrder(root));
        System.out.println("****LevelOrder Mine******");
        LevelOrderIterative levelOrderIterative= new LevelOrderIterative();
        System.out.println(levelOrderIterative.levelOrderIterative(root));
        LevelOrder_IterativeTraversal levelOrder_iterativeTraversal=new LevelOrder_IterativeTraversal();
        System.out.println(levelOrder_iterativeTraversal.levelOrder_IterativeTraversal(root));*/

        //TODO ! Delete me
        PreOrderIterative preOrderIterative= new PreOrderIterative();
        System.out.println(preOrderIterative.preorderTraversal(root));
        PreOrder_IterativeTraversal preOrder_iterativeTraversal= new PreOrder_IterativeTraversal();
        System.out.println(preOrder_iterativeTraversal.preOrder_iterativeTraversals(root));
        System.out.println("*******");
        InOrderIterative inOrderIterative= new InOrderIterative();
        System.out.println(inOrderIterative.inorderTraversal(root));
        In_Order_IterativeTraversal in_order_iterativeTraversal= new In_Order_IterativeTraversal();
        System.out.println(in_order_iterativeTraversal.inOrderIterativeTraversal(root));
        System.out.println("*******");
        PostOrderIterativeTraversal postOrderIterativeTraversal= new PostOrderIterativeTraversal();
        System.out.println(postOrderIterativeTraversal.postOrderIterativeTraversal(root));
        Post_Order_IterativeTraversal post_order_iterativeTraversal= new Post_Order_IterativeTraversal();
        System.out.println(post_order_iterativeTraversal.postOrderterativeTraversal(root));


    }
}

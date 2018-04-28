package com.java.ds.client;

import com.java.ds.trees.BinaryTreeNode;
import com.java.ds.trees.InOrderIterative;
import com.java.ds.trees.PostOrderIterative;
import com.java.ds.trees.excercise.InOrder_IterativeTraversal;
import com.java.ds.trees.excercise.MaxInBinaryTreeRecursive;
import com.java.ds.trees.excercise.PostOrder_IterativeTraversal;
import com.java.ds.trees.excercise.PostOrder__IterativeTraversal;

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
        InOrder_IterativeTraversal inOrder_iterativeTraversal= new InOrder_IterativeTraversal();
        System.out.println(inOrder_iterativeTraversal.inOrderIterativeTravesal(binaryTreeNode));

        System.out.println("******iterative postorder(original)*****");
        PostOrderIterative postOrderIterative= new PostOrderIterative();
        System.out.println(postOrderIterative.postorderTraversal(binaryTreeNode));
        System.out.println("******iterative postorder(mine)*****");
        PostOrder_IterativeTraversal postOrder_iterativeTraversal= new PostOrder_IterativeTraversal();
        System.out.println(postOrder_iterativeTraversal.postOrderIterativeTraversal(binaryTreeNode));
        System.out.println("******iterative postorder(mine)*****");
        PostOrder__IterativeTraversal postOrder__iterativeTraversal= new PostOrder__IterativeTraversal();
        System.out.println(postOrder__iterativeTraversal.postOrderIterativeTraversal(binaryTreeNode));




    }
}

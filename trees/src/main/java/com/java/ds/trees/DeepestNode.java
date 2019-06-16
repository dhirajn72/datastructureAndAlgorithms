

package com.java.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
	// The last node processed from queue in level order is the deepest node in binary tree.
	public BinaryTreeNode deepestNodeinBinaryTree(BinaryTreeNode root) {
		BinaryTreeNode tmp = null;
    	if(root == null)
            return null;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
        	tmp = q.poll();
            if(tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if(tmp.right != null)
                q.offer(tmp.right);
        }
		return tmp;
	}

    public static void main(String[] args) {
/*
                            50
                       /        \
                      49        51
                     /  \           \
                   48    57         60
                   /     \
                  47      58
                            \
                            59


 */

        BinaryTreeNode root= new BinaryTreeNode(50);
        root.setLeft(new BinaryTreeNode(49));
        root.getLeft().setLeft(new BinaryTreeNode(48));
        root.getLeft().getLeft().setLeft(new BinaryTreeNode(47));
        root.getLeft().setRight(new BinaryTreeNode(57));
        root.getLeft().getRight().setRight(new BinaryTreeNode(58));
        root.getLeft().getRight().getRight().setRight(new BinaryTreeNode(59));
        root.setRight(new BinaryTreeNode(51));
        root.getRight().setRight(new BinaryTreeNode(60));

        System.out.println(new DeepestNode().deepestNodeinBinaryTree(root));
    }
}

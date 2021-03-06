

package com.java.ds.trees;

public class ConstructMirror {
	public BinaryTreeNode MirrorOfBinaryTree(BinaryTreeNode root) {
		BinaryTreeNode  temp;
		if(root != null) {
			MirrorOfBinaryTree(root.left);
			MirrorOfBinaryTree(root.right);
			/* swap the pointers in this node */
			temp  = root.getLeft();
			root.setLeft(root.right);
			root.right = temp;
		}
		return root;
	}
}

package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 22/12/19
 */
public class PrintBoundry_Leetcode1 {
    // Driver program to test above functions
    public static void main(String args[]) {
        TreeNode tree = DataUtils.getTreeNode();
        boundaryLevelTraversal(tree);
    }

    public static void boundaryLevelTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val+",");
            leftBoundry(root.left);
            printLeaf(root);
            rightBoundry(root.right);
        }
    }

    private static void printLeaf(TreeNode root) {
        if (root==null)
            return;
        if (root.left ==null && root.right==null)
            System.out.print(root.val+",");

        printLeaf(root.left);
        printLeaf(root.right);
    }

    private static void leftBoundry(TreeNode root) {
        if (root==null)
            return;
        if (root.left==null && root.right==null)
            return;
        System.out.print(root.val+",");
        if (root.left!=null)
            leftBoundry(root.left);
        else
            leftBoundry(root.right);
    }

    private static void rightBoundry(TreeNode root) {
        if (root==null)
            return;
        if (root.left==null && root.right==null)
            return;
        System.out.print(root.val+",");
        if (root.right!=null)
            leftBoundry(root.right);
        else
            leftBoundry(root.left);
    }
}
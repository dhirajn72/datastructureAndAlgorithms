package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 22/12/19
 */
public class PrintBoundry_Leetcode {
    public static void main(String args[]) {
        TreeNode tree = DataUtils.getTreeNode();
        boundaryLevelTraversal(tree);
    }

    public static void boundaryLevelTraversal(TreeNode root) {
        System.out.print(root.val + " ");
        printLeftEdgeNodes(root.left);
        printLeafNodes(root);
        printRightBottomUp(root.right);

    }

    private static void printLeafNodes(TreeNode root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
            return;
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    private static void printRightBottomUp(TreeNode root) {
        if (root == null)
            return;

        // if leaf node, ignore while printing edges
        if (root.left == null && root.right == null) { // excluding last leaf node in right boundary
            return;
        }

        if (root.right != null) {
            printRightBottomUp(root.right);
        } else if (root.left != null) {
            printRightBottomUp(root.left);
        }

        System.out.print(root.val + " ");
    }


    private static void printLeftEdgeNodes(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)// Excluding the last leaf node on left boundary
            return;

        System.out.print(root.val + " ");
        if (root.left == null) {
            printLeftEdgeNodes(root.right);
        } else {
            printLeftEdgeNodes(root.left);
        }

    }
}
package com.karumanchi;

import com.leetcode.DataUtil;
import com.leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class LCAOftwoNodes {
    public static void main(String[] args) {
        TreeNode root = DataUtil.getTree();
        TreeNode n1 = root.getRight().getRight();
        TreeNode n2 = root.getLeft().getLeft();
        System.out.println(LCA(root, n1, n2));
       // System.out.println(printAncestors(root, n1));
    }

    public static TreeNode LCA(TreeNode root, TreeNode n1,TreeNode n2) {
        if (root == null) return root;
        if (root == n1||root==n2)
            return root;
        TreeNode left = LCA(root.getLeft(), n1,n2);
        TreeNode right = LCA(root.getRight(), n1,n2);
        if (left != null && right != null)
            return root;
        else
            return left != null ? left : right;
    }

    static boolean printAncestors(TreeNode root, TreeNode target) {
        if (root == null)
            return false;
        if (root == target)
            return true;

        if (printAncestors(root.getLeft(), target) || printAncestors(root.getRight(), target)) {
            System.out.print(root.getData() + " ");
            return true;
        }
        return false;
    }

}

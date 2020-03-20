package com.karumanchi;

import com.leetcode.DataUtil;
import com.leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class LCAOftwoNodes {
    public static void main(String[] args) {
        TreeNode_1 root = DataUtil.getTree();
        TreeNode_1 n1 = root.getRight().getRight();
        TreeNode_1 n2 = root.getLeft().getLeft();
        System.out.println(LCA(root, n1, n2));
       // System.out.println(printAncestors(root, n1));
    }

    public static TreeNode_1 LCA(TreeNode_1 root, TreeNode_1 n1, TreeNode_1 n2) {
        if (root == null) return root;
        if (root == n1||root==n2)
            return root;
        TreeNode_1 left = LCA(root.getLeft(), n1,n2);
        TreeNode_1 right = LCA(root.getRight(), n1,n2);
        if (left != null && right != null)
            return root;
        else
            return left != null ? left : right;
    }

    static boolean printAncestors(TreeNode_1 root, TreeNode_1 target) {
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

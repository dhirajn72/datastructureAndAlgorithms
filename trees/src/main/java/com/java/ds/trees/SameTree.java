package com.java.ds.trees;

import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 23/12/19
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q)
            return true;
        return isSame(p, q);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (p == q)
            return true;
        if (p == null || q == null)
            return false;
        return p.val == q.val && isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        if (root.left==null && root.right==null)return true;
        return isSymmetric(root.left,root.right);

    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p==q)return true;
        if (p==null||q==null)
            return false;
        return p.val==q.val && isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }
}

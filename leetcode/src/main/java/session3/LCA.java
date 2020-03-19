package session3;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 23/02/20
 */

/*

Success
Details
Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
Memory Usage: 42.2 MB, less than 5.55% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
 */
public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)
            return root;
        if (root==p||root==q)
            return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if (left!=null && right!=null)
            return root;
        else
            return left!=null?left:right;
    }
}

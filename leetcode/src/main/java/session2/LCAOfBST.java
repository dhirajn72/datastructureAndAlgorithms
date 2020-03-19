package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LCAOfBST {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeDataPreOrdered();
        System.out.println(lowestCommonAncestor(root,root.right.right,root.right.left));


    }

    /*
                     1
                   /  \
                 2     5
                / \   / \
               3  4  6   7


     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)return null;
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

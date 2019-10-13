package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class SymetricTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(0);
        p.right = new TreeNode(2);
        /*p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(4);
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(3);*/
        System.out.println(isSymmetric(p));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return _isSymetric(root.left,root.right)&& _isSymetric(root.right,root.left);
    }

    private static boolean _isSymetric(TreeNode root1, TreeNode root2) {

        if (root1==null && root2==null)return true;
        if (root1==null || root2==null)return false;
        if (root1.val!=root2.val)return false;
        return _isSymetric(root1.left,root2.right) && _isSymetric(root1.right, root2.left);
    }
}

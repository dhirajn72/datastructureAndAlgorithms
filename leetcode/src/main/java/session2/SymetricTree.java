package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class SymetricTree {
    public static void main(String[] args) {
        TreeNode_1 p = new TreeNode_1(1);
        p.left = new TreeNode_1(0);
        p.right = new TreeNode_1(2);
        /*p.left.left = new TreeNode_1(3);
        p.left.right = new TreeNode_1(4);
        p.right.left = new TreeNode_1(4);
        p.right.right = new TreeNode_1(3);*/
        System.out.println(isSymmetric(p));
    }

    public static boolean isSymmetric(TreeNode_1 root) {
        if (root==null)return true;
        return _isSymetric(root.left,root.right)&& _isSymetric(root.right,root.left);
    }

    private static boolean _isSymetric(TreeNode_1 root1, TreeNode_1 root2) {

        if (root1==null && root2==null)return true;
        if (root1==null || root2==null)return false;
        if (root1.val!=root2.val)return false;
        return _isSymetric(root1.left,root2.right) && _isSymetric(root1.right, root2.left);
    }
}

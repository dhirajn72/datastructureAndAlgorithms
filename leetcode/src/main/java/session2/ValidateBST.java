package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getBinarySearchTreeData();
        System.out.println(isValidBST(root));

    }

    public static boolean isValidBST(TreeNode root) {
        return _isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private static boolean _isValidBST(TreeNode root,long min,long max) {
        if (root==null)return true;
        return (root.val>min && root.val<max && _isValidBST(root.left,min,root.val) && _isValidBST(root.right,root.val,max));
    }
}

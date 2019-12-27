package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 21/10/19
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        _ancesstors(root,root.right.right);
    }

    private static void _ancesstors(TreeNode root,TreeNode node) {
        if (root==null)return;
        _printAllAncesstors(root,node);
    }

    private static boolean _printAllAncesstors(TreeNode root,TreeNode node) {
        if (root==null)return false;
        else if (root.left==node ||root.right==node ||_printAllAncesstors(root.left,node) || _printAllAncesstors(root.right,node)){
            System.out.println(root.val);
            return true;
        }
        return false;
    }
}

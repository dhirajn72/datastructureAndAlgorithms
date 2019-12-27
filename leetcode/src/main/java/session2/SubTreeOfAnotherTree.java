package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root = DataUtil.getTreeData();
        System.out.println(isSubtree(root, new TreeNode(90)));
    }


    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (isSame(s, t))
            return true;
        if (t == null)
            return false;
        return s != null && (isSubtree(s.left, t) || isSubtree(s.right, t));
    }

    public static boolean isSame(TreeNode root, TreeNode root2) {
        if (root == null && root2 == null)
            return true;
        if (root == null || root2 == null)
            return false;
        return root.val == root2.val && isSame(root.left, root2.left) && isSame(root.right, root2.right);
    }
}
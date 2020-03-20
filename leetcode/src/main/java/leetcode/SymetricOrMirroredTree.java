package leetcode;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class SymetricOrMirroredTree {
    public static void main(String[] args) {

    }

    /***
     *
     Success
     Details
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
     Memory Usage: 40.6 MB, less than 5.44% of Java online submissions for Symmetric Tree.
     Next challenges:
     Balanced Binary Tree
     Kth Smallest Element in a BST
     N-ary Tree Level Order Traversal
     Show off your acceptance:

     *
     *
     *
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode_1 root) {
        if (root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;
        if (root.left==null || root.right==null)
            return true;
        if (root.left.val!=root.right.val)
            return false;
        return _areMirrored(root.left,root.right) && _areMirrored(root.right,root.left);
    }

    private static boolean _areMirrored(TreeNode_1 right, TreeNode_1 left) {
        if (left==null && right==null)
            return true;
        if (left==null ||right==null)
            return false;
        if (left.val!=right.val)
            return false;
        return _areMirrored(right.right,left.left)&& _areMirrored(right.left,left.right);
    }
}

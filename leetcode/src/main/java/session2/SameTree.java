package session2;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        TreeNode q=new TreeNode(1);
        q.right=new TreeNode(2);
        System.out.println(isSameTree(p,q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==q) return true;
        return _isSame(p,q);
    }

    private static boolean _isSame(TreeNode p, TreeNode q) {
        if (p==q)return true;
        if (p!=null && q==null)return false;
        if (p==null && q!=null) return false;
        return  (p.val==q.val && _isSame(p.left,q.left) && _isSame(p.right,q.right));
    }
}

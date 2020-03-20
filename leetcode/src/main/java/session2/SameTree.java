package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode_1 p=new TreeNode_1(1);
        p.left=new TreeNode_1(2);
        TreeNode_1 q=new TreeNode_1(1);
        q.right=new TreeNode_1(2);
        System.out.println(isSameTree(p,q));
    }

    public static boolean isSameTree(TreeNode_1 p, TreeNode_1 q) {
        if (p==q) return true;
        return _isSame(p,q);
    }

    private static boolean _isSame(TreeNode_1 p, TreeNode_1 q) {
        if (p==q)return true;
        if (p!=null && q==null)return false;
        if (p==null && q!=null) return false;
        return  (p.val==q.val && _isSame(p.left,q.left) && _isSame(p.right,q.right));
    }
}

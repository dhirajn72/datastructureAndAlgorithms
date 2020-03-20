package leetcode;

/**
 * @author Dhiraj
 * @date 12/07/19
 */
public class TreeOperations {
    public static void main(String[] args) {
        TreeNode_1 t1=new TreeNode_1(1);
        t1.left=new TreeNode_1(2);
        t1.right=new TreeNode_1(3);
        TreeNode_1 t2=new TreeNode_1(1);
        t2.left=new TreeNode_1(2);
        t2.right=new TreeNode_1(3);
        t2.right.left=new TreeNode_1(4);
        System.out.println(isSameTree(t1,t2));
    }
    public static boolean isSameTree(TreeNode_1 p, TreeNode_1 q) {
        if (p==null && q==null)
            return true;
        if (p==null||q==null)
            return false;
        if (p.val!=q.val)
            return false;
        else  return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

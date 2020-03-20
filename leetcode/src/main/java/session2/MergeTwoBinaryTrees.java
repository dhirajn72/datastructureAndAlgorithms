package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 20/10/19
 */
public class MergeTwoBinaryTrees {


    public TreeNode_1 mergeTrees(TreeNode_1 t1, TreeNode_1 t2) {
        if (t1 == null && t2 == null) return null;

        int val=(t1==null?0:t1.val)+(t2==null?0:t2.val);

        TreeNode_1 root=new TreeNode_1(val);
        root.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        root.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        return root;
    }
}
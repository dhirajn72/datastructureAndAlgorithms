package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 23/02/20
 */
public class TreeBoundary {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getUnbalancedTreeData();
        boundary(root);
    }


    public static void boundary(TreeNode_1 root){
        if (root==null)
            return;
        System.out.print(root.val+",");
        left(root.left);
        bottom(root);
        right(root.right);
    }

    private static void right(TreeNode_1 root) {
        if (root==null)
            return;
        if (root.left==null && root.right==null)
            return;
        System.out.print(root.val+",");
        if (root.right!=null){
            right(root.right);
        }
        else
            right(root.left);
    }

    private static void bottom(TreeNode_1 root) {
        if (root==null)
            return;
        if (root.left==null&& root.right==null){
            System.out.print(root.val+",");
            return;
        }
        bottom(root.left);
        bottom(root.right);
    }

    private static void left(TreeNode_1 root) {
        if (root==null)
            return;
        if (root.left==null && root.right==null)
            return;
        System.out.print(root.val+",");
        if (root.left!=null){
            left(root.left);
        }
        else
            left(root.right);
    }
}

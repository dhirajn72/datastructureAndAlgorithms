package com.leetcode;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class ValidateBST {
    public static void main(String[] args) {
        TreeNode_1 root= new TreeNode_1(2);
        root.left=new TreeNode_1(1);
        root.right=new TreeNode_1(3);
        root.right.right=new TreeNode_1(1);
       /// root.left.left=new TreeNode_1(7);

        System.out.println(checkValidBST(root));

    }

    public static boolean checkValidBST(TreeNode_1 root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBST(TreeNode_1 root, int min, int max) {
        if (root == null) return true;
        return (root.data > min && root.data < max && isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
    }

}

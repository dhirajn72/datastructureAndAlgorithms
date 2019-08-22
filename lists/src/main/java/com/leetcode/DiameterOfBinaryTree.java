package com.leetcode;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {

        /*

          1
         / \
        2   3
       / \
      4   5
     /     \
    6       7
    \       /
    8      9



         */
        TreeNode root= new TreeNode(1);
        //root.left=new TreeNode(2);
        /*root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.left.left=new TreeNode(6);
        root.left.left.left.right=new TreeNode(8);
        root.left.right.right=new TreeNode(7);
        root.left.right.right.left=new TreeNode(9);*/
        System.out.println(diameterOfBinaryTree(root));

    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root==null)return 0;
        //if (root.left==null&& root.right==null)return 0;
        int height=_height(root.left)+_height(root.right);
        int leftdiameter=diameterOfBinaryTree(root.left);
        int rightdiameter=diameterOfBinaryTree(root.right);
        int diameter=Math.max(height,Math.max(leftdiameter,rightdiameter));
        return diameter;
    }
    private static int _height(TreeNode root) {
        if (root==null)return 0;
        int left=_height(root.left);
        int right=_height(root.right);
        return Math.max(left,right)+1;
    }
}

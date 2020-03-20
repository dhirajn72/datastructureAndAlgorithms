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
        TreeNode_1 root= new TreeNode_1(1);
        //root.left=new TreeNode_1(2);
        /*root.right=new TreeNode_1(3);
        root.left.left=new TreeNode_1(4);
        root.left.right=new TreeNode_1(5);
        root.left.left.left=new TreeNode_1(6);
        root.left.left.left.right=new TreeNode_1(8);
        root.left.right.right=new TreeNode_1(7);
        root.left.right.right.left=new TreeNode_1(9);*/
        System.out.println(diameterOfBinaryTree(root));

    }

    public static int diameterOfBinaryTree(TreeNode_1 root) {
        if (root==null)return 0;
        //if (root.left==null&& root.right==null)return 0;
        int height=_height(root.left)+_height(root.right);
        int leftdiameter=diameterOfBinaryTree(root.left);
        int rightdiameter=diameterOfBinaryTree(root.right);
        int diameter=Math.max(height,Math.max(leftdiameter,rightdiameter));
        return diameter;
    }
    private static int _height(TreeNode_1 root) {
        if (root==null)return 0;
        int left=_height(root.left);
        int right=_height(root.right);
        return Math.max(left,right)+1;
    }
}

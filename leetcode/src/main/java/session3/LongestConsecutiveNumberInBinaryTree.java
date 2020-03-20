package session3;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/02/20
 */
public class LongestConsecutiveNumberInBinaryTree {

    public static void main(String[] args) {
        TreeNode_1 root=new TreeNode_1(1);
        root.left=new TreeNode_1(4);
        root.left.left=new TreeNode_1(4);
        root.left.right=new TreeNode_1(4);
        root.right=new TreeNode_1(5);
        root.right.right=new TreeNode_1(5);
        System.out.println(longestUnivaluePath(root));

    }
    static int max;
    public static int longestUnivaluePath(TreeNode_1 root) {
        max = 0;
        longestPath(root);
        return max;
    }
        /*
              1
             / \
            4   5
           / \   \
          4   4   5
     */


    public static int longestPath(TreeNode_1 node) {
        if (node == null) {
            return 0;
        }
        int maxLeft = longestPath(node.left);
        int maxRight = longestPath(node.right);
        int maxLeftSoFar = 0;
        int maxRightSoFar = 0;
        if (node.left != null && node.left.val == node.val) {
            maxLeftSoFar = maxLeft + 1;
        }
        if(node.right != null && node.right.val == node.val) {
            maxRightSoFar = maxRight + 1;
        }
        max = Math.max(max, maxLeftSoFar + maxRightSoFar);
        return Math.max(maxLeftSoFar,maxRightSoFar);
    }

}

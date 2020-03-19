package session3;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 22/02/20
 */
public class LongestConsecutiveNumberInBinaryTree {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(4);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(5);
        System.out.println(longestUnivaluePath(root));

    }
    static int max;
    public static int longestUnivaluePath(TreeNode root) {
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


    public static int longestPath(TreeNode node) {
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

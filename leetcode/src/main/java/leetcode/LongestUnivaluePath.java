package leetcode;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class LongestUnivaluePath {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(1);
        root.right.right=new TreeNode(5);

        System.out.println(longestUnivaluePath(root));




/*
            5
                / \
          4   5
                / \   \
        1   1   5*/

    }

    static int max;
    public static int longestUnivaluePath(TreeNode root) {
        max = 0;
        longestPath(root);
        return max;
    }

    public static int longestPath(TreeNode node) {
        // Base case: if null node, return 0
        if (node == null) {
            return 0;
        }
        // Get the max length from left and right
        int maxLeft = longestPath(node.left);
        int maxRight = longestPath(node.right);
        // Calculate the current max length
        int maxLeftSoFar = 0;
        int maxRightSoFar = 0;
        // Compare parent node with child node
        // If they are the same, extend the max length by one
        if (node.left != null && node.left.val == node.val) {
            maxLeftSoFar = maxLeft + 1;
        }
        if(node.right != null && node.right.val == node.val) {
            maxRightSoFar = maxRight + 1;
        }
        // Update the max with the sum of left and right length
        max = Math.max(max, maxLeftSoFar + maxRightSoFar);
        // Return the max from left and right to upper node
        // since only one side path is valid
        return Math.max(maxLeftSoFar,maxRightSoFar);
    }
}

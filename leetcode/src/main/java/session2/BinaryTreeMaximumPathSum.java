package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode_1 root = DataUtil.getTreeData();
        System.out.println(maxPathSum(root));

    }


    public static int maxPathSum(TreeNode_1 root) {
        if (root == null) return 0;
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateMax(root, max);
        return max[0];
    }

    private static int calculateMax(TreeNode_1 root, int[] max) {
        if (root==null)
            return 0;
        int left=calculateMax(root.left,max);
        int right=calculateMax(root.right,max);

        int curr=Math.max(root.val,Math.max(left+root.val,right+root.val));
        max[0]=Math.max(max[0],Math.max(curr,left+right+root.val));
        return curr;
    }
}

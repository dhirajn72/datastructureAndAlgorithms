package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 04/01/20
 */
public class MaximumSum {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(TreeNode_1 root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }

    public static int calculateSum(TreeNode_1 root, int[] max) {
        if (root == null)
            return 0;

        int left = calculateSum(root.left, max);
        int right = calculateSum(root.right, max);

        int current = Math.max(root.val, Math.max(root.val + left, root.val + right));

        max[0] = Math.max(max[0], Math.max(current, left + root.val + right));

        return current;
    }
}

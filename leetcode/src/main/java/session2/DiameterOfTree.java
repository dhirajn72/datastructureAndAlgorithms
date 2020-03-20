package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class DiameterOfTree {

    /***
     *
     * Accepted on leetcode
     *
     *
     * @param root
     * @return
     */

    public int diameterOfBinaryTree(TreeNode_1 root) {
        if (root==null) return 0;
        int height=_height(root.left)+_height(root.right);
        int lDiameter=diameterOfBinaryTree(root.left);
        int rDiameter=diameterOfBinaryTree(root.right);
        return Math.max(height,Math.max(lDiameter,rDiameter));
    }

    private int _height(TreeNode_1 root) {
        if (root==null)return 0;
        int left=_height(root.left);
        int right=_height(root.right);
        return Math.max(left,right)+1;
    }
}
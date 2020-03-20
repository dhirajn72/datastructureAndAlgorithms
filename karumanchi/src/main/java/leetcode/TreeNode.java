package leetcode;

/**
 * @author Dhiraj
 * @date 12/07/19
 */
public class TreeNode {
    int val;
    TreeNode_1 left;
    TreeNode_1 right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode_1{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
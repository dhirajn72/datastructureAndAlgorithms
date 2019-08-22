package gfg;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class TreeNode {
    int val;
    TreeNode left,right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

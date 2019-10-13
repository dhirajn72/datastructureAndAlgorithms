package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class MinDepth {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getBinarySearchTreeData();
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int levelCount=0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.left==null && temp.right==null)
                        return levelCount;
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                    if (!q.isEmpty())
                        q.offer(null);
                    levelCount++;

                }
            }
            return levelCount;
        }
    }
}

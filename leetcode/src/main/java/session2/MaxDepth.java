package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int levelCount=0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
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

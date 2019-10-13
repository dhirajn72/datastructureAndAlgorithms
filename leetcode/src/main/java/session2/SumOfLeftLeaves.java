package session2;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }

    private int sum(TreeNode root) {
        if (root==null)return 0;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            int count=0;
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    if (temp.left!=null && temp.left.left==null && temp.left.right==null){
                        count+=temp.left.val;
                    }
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
            }
            return count;
        }
    }
}

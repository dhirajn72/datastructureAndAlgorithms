package session2;

import leetcode.TreeNode_1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode_1 root) {
        return sum(root);
    }

    private int sum(TreeNode_1 root) {
        if (root==null)return 0;
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            int count=0;
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
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

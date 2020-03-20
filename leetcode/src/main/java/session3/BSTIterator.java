package session3;

import leetcode.TreeNode_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 04/01/20
 */
public class BSTIterator {

    Queue<Integer> q=new LinkedList<>();

    public BSTIterator(TreeNode_1 root) {
        inOrder(root);
    }

    private void inOrder(TreeNode_1 root) {

        Stack<TreeNode_1> s=new Stack<>();
        while (!s.isEmpty()||root!=null){
            if (root!=null){
                s.push(root);
                root=root.left;
            }
            else {
                TreeNode_1 temp=s.pop();
                q.offer(temp.val);
                root=temp.right;
            }
        }
    }

    /** @return the next smallest number */
    public int next() {
        return q.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !q.isEmpty();
    }
}
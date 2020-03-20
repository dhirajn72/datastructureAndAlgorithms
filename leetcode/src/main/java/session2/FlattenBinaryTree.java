package session2;

import leetcode.TreeNode_1;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 28/12/19
 */
public class FlattenBinaryTree {


    /**
     *
     * Success
     Details
     Runtime: 1 ms, faster than 51.52% of Java online submissions for Flatten Binary Tree to Linked List.
     Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
     * @param root
     */
    public void flatten(TreeNode_1 root) {
        if (root==null)return;

        Stack<TreeNode_1> s = new Stack<>();
        TreeNode_1 temp=root;
        while (!s.isEmpty()||temp!=null){
            if (temp.right!=null)
                s.push(temp.right);
            if (temp.left!=null){
                temp.right=temp.left;
                temp.left=null;
            }
            else if (!s.isEmpty()){
                TreeNode_1 r=s.pop();
                temp.right=r;
            }
            temp=temp.right;

        }
    }
}

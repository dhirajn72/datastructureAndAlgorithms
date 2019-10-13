package session2;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)return new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        List<Integer> result=new ArrayList<>();
        while (!s.isEmpty() || root!=null){
            if (root!=null){
                s.push(root);
                root=root.left;
            }
            else {
                TreeNode temp=s.pop();
                result.add(temp.val);
                root=temp.right;
            }
        }
        return result;
    }
}

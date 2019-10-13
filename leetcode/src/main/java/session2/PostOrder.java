package session2;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null)return new ArrayList<>();
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            Stack<Integer> out=new Stack<>();
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp!=null){
                    out.push(temp.val);
                    if (temp.left!=null)
                        s.push(temp.left);
                    if (temp.right!=null)
                        s.push(temp.right);
                }
            }
            List<Integer> result=new ArrayList<>();
            while (!out.isEmpty())
                result.add(out.pop());
            return result;
        }
    }
}

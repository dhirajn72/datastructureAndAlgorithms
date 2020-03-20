package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class PreOrder {

    public List<Integer> preorderTraversal(TreeNode_1 root) {
        if (root==null)return new ArrayList<>();
        else {
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            List<Integer> result=new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
                if (temp!=null){
                    result.add(temp.val);
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return result;
        }
    }
}

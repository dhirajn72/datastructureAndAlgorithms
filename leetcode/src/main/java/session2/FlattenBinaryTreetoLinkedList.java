package session2;

import leetcode.ListNode;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        List<Integer> preOrder=_preOrder(root);
        TreeNode result=null;
        for (int i:preOrder)
            result=_addToList(result,i);
        root.left=null;
        root.right=result.right;
    }

    private TreeNode _addToList(TreeNode result, int e) {
        if (result==null)return new TreeNode(e);
        else {
            TreeNode p,q;
            for (p=result;(q=p.right)!=null;p=q);
            p.right=new TreeNode(e);
            return result;
        }
    }

    private List<Integer> _preOrder(TreeNode root) {
        if (root==null)return null;
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            List<Integer> preorder=new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if(temp!=null){
                    preorder.add(temp.val);
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return preorder;
        }
    }
}

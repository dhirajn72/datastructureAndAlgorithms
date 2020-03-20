package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode_1 root) {
        List<Integer> preOrder=_preOrder(root);
        TreeNode_1 result=null;
        for (int i:preOrder)
            result=_addToList(result,i);
        root.left=null;
        root.right=result.right;
    }

    private TreeNode_1 _addToList(TreeNode_1 result, int e) {
        if (result==null)return new TreeNode_1(e);
        else {
            TreeNode_1 p,q;
            for (p=result;(q=p.right)!=null;p=q);
            p.right=new TreeNode_1(e);
            return result;
        }
    }

    private List<Integer> _preOrder(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            List<Integer> preorder=new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
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

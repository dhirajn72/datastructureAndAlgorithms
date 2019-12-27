package session3;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 20/12/19
 */
public class TreeOperations {

    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        postorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        else {
            List<Integer> list=new ArrayList<>();
            Stack<TreeNode> s=new Stack<>();
            while (!s.isEmpty() || root!=null){
                if (root!=null){
                    s.push(root);
                    root=root.left;
                }
                else {
                    TreeNode temp=s.pop();
                    list.add(temp.val);
                    root=temp.right;
                }
            }
            return list;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return _isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean _isValid(TreeNode root, long minValue, long maxValue) {
        if (root==null)return true;
        return root.val>minValue && root.val<maxValue && _isValid(root.left,minValue,root.val ) && _isValid(root.right,root.val,maxValue);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            List<Integer> result = new ArrayList<>();
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp != null) {
                    result.add(temp.val);
                    if (temp.right != null)
                        s.push(temp.right);
                    if (temp.left != null)
                        s.push(temp.left);
                }
            }
            return result;
        }
    }


    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root==null)return new ArrayList<>();
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            Stack<Integer> out=new Stack<>();
            List<Integer> result=new ArrayList<>();
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
            while (!out.isEmpty())
                result.add(out.pop());
            return result;
        }
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class FlattenTreeToList {

    /**
     *
      1
     / \
     2   5
     / \   \
     3   4   6
     * @param args
     */
    public static void main(String[] args) {
        TreeNode root=DataUtil.getTreeDataPreOrdered();
        root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(6);
        flatten(root);
    }

    public static void flatten(TreeNode root) {
        if (root==null)return;
        List<Integer> integers=getAllNodeData(root);
        TreeNode temp=null;
        for (int i:integers){
            if (temp==null)
                temp=addToTreeNode(temp,i);
            else {
                temp.left=null;
                addToTreeNode(temp, i);
            }
        }
        root=temp;
        root.left=null;
        System.out.println(root);
    }
    private static TreeNode addToTreeNode(TreeNode head, int i) {
        if (head==null)head=new TreeNode(i);
        else {
            TreeNode p,q;
            for (p=head;((q=p.right)!=null);p=q);
            p.right=new TreeNode(i);
        }
        return head;
    }

    private static List<Integer> getAllNodeData(TreeNode root) {
        return _preOrder(root);
    }
    public static List<Integer> _preOrder(TreeNode root) {
        if (root==null)return null;
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            List<Integer> integers= new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return integers;
        }
    }
}

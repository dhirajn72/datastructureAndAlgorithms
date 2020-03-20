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
        TreeNode_1 root=DataUtil.getTreeDataPreOrdered();
        root=new TreeNode_1(1);
        root.left=new TreeNode_1(2);
        root.right=new TreeNode_1(5);
        root.left.left=new TreeNode_1(3);
        root.left.right=new TreeNode_1(4);
        root.right.right=new TreeNode_1(6);
        flatten(root);
    }

    public static void flatten(TreeNode_1 root) {
        if (root==null)return;
        List<Integer> integers=getAllNodeData(root);
        TreeNode_1 temp=null;
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
    private static TreeNode_1 addToTreeNode(TreeNode_1 head, int i) {
        if (head==null)head=new TreeNode_1(i);
        else {
            TreeNode_1 p,q;
            for (p=head;((q=p.right)!=null);p=q);
            p.right=new TreeNode_1(i);
        }
        return head;
    }

    private static List<Integer> getAllNodeData(TreeNode_1 root) {
        return _preOrder(root);
    }
    public static List<Integer> _preOrder(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            List<Integer> integers= new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
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

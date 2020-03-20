package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class CountCompleteTreeNode {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        countNodes(root);

    }
    public static int countNodes(TreeNode_1 root) {
        if (root==null)return 0;
        else {
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            int res=0;
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
                if (temp!=null){
                    ++res;
                    if (temp.left!=null)
                        s.push(temp.left);
                    if (temp.right!=null)
                        s.push(temp.right);
                }
            }
            return res;
        }
    }
}

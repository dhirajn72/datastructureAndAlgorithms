package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 21/08/19
 */
public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode root=DataUtil.getTreeData() ;
        System.out.println(rightSideView(null));;
    }

    public static List<Integer> rightSideView(TreeNode root) {
        return _levelOrder(root);
    }
    private static List<Integer> _levelOrder(TreeNode root) {
        if (root==null)return new ArrayList<>();
        else {
            Queue<TreeNode>  q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            ArrayList<Integer> out=new ArrayList<>();
            List<Integer> result=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    out.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    result.add(out.get(out.size()-1));
                    if (!q.isEmpty())
                        q.offer(null);
                    out.clear();
                }
            }
            return result;
        }
    }
}

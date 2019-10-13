package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        System.out.println(levelOrder(root));
    }

    public  static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)return new ArrayList<>();
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<List<Integer>> result=new Stack<>();
            List<Integer>  integers=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    result.add(new ArrayList<>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();

                }
            }
            return result;
        }
    }
}

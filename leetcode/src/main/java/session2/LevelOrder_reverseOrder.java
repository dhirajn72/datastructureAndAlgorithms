package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.*;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LevelOrder_reverseOrder {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(levelOrder(root));
    }

    public  static List<List<Integer>> levelOrder(TreeNode_1 root) {
        if (root==null)return new ArrayList<>();
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            Stack<List<Integer>> result=new Stack<>();
            List<Integer>  integers=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
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
            List<List<Integer>> list=new ArrayList<>();
            while (!result.isEmpty())
                list.add(result.pop());
            return list;
        }
    }
}

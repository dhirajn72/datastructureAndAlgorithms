package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class TreeZigZagTraversals {
    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        System.out.println(zigzagLevelOrder(root));
    }

    public  static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null)return new ArrayList<>();
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<List<Integer>> result=new ArrayList<>();
            List<Integer>  integers=new ArrayList<>();
            Stack<Integer> stack=new Stack<>();
            boolean flag=true;
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    if (flag)
                        integers.add(temp.val);
                    else
                        stack.push(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    if (flag) {
                        result.add(new ArrayList<>(integers));
                        flag=false;
                    }
                    else {
                        while (!stack.isEmpty())
                            integers.add(stack.pop());
                        result.add(new ArrayList<>(integers));
                        flag=true;
                    }
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();

                }
            }
            return result;
        }
    }
}

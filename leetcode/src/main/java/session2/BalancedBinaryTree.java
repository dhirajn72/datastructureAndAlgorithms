package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root= DataUtil.getUnbalancedTreeData();
        root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(15);
        root.left.right=new TreeNode(7);


        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null)return false;
        return isTreeBalanced(root);
    }

    private static boolean isTreeBalanced(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
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
                list.add(new ArrayList<>(integers));
                if (!q.isEmpty())
                    q.offer(null);
                integers.clear();
            }
        }
        System.out.println(list);
        boolean result=true;
        int count=0;
        int currSize=0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (!set.contains(list.get(i).size())){
                set.add(list.get(i).size());
                currSize=list.get(i).size();
            }
            else {
                count++;
                if (count==2 ||list.get(i).size()<currSize) {
                    result=false;
                    break;
                }
            }
        }
        return result;
    }
}

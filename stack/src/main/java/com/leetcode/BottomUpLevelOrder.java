package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class BottomUpLevelOrder {
    public static void main(String[] args) {
        TreeNode_1 root = DataUtil.getTree();
        System.out.println(levelOrderBottom(root));


    }


    public static List<List<Integer>> levelOrderBottom(TreeNode_1 root) {
        if (root == null)
            return new ArrayList<>();
        else {
            Queue<TreeNode_1> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers = new ArrayList<>();
            List<List<Integer>> list = new ArrayList<>();
            Stack<List<Integer>> s= new Stack<>();
            while (!q.isEmpty()) {
                TreeNode_1 temp = q.poll();
                if (temp != null) {
                    integers.add(temp.data);
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                   // list.add(new ArrayList<>(integers));
                    s.push(new ArrayList<>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            //System.out.print(s);
            while (!s.isEmpty())
                list.add(s.pop());
            return list;
        }
    }
}

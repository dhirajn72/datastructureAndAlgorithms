package com.karumanchi;

import com.leetcode.DataUtil;
import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class ZigZagTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);//DataUtil.getTree();
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));
        /*root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(7));*/


        System.out.println(zigzagLevelOrder(root));; // 1 2 3 7 6 5 4

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            ArrayList<Integer> integers = new ArrayList<>();
            List<List<Integer>> list = new ArrayList<>();
            boolean flag = true;
            List<Integer> integers1 = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    integers.add(temp.getData());
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                } else {
                    if (flag) {
                        list.add(new ArrayList<>(integers));
                        flag = false;
                    } else {
                        for (int i = integers.size() - 1; i >= 0; i--)
                            integers1.add(integers.get(i));
                        list.add(new ArrayList<>(integers1));
                        integers1.clear();
                        flag = true;
                        System.out.println();
                    }
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
            return list;
        }
    }
}


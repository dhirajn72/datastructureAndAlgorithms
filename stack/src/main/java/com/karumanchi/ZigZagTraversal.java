package com.karumanchi;

import com.leetcode.TreeNode_1;

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
        TreeNode_1 root = new TreeNode_1(3);//DataUtil.getTree();
        root.setLeft(new TreeNode_1(9));
        root.setRight(new TreeNode_1(20));
        /*root.getRight().setLeft(new TreeNode_1(15));
        root.getRight().setRight(new TreeNode_1(7));*/


        System.out.println(zigzagLevelOrder(root));// 1 2 3 7 6 5 4

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode_1 root) {
        if (root==null)
            return new ArrayList<>();
        else {
            Queue<TreeNode_1> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            ArrayList<Integer> integers = new ArrayList<>();
            List<List<Integer>> list = new ArrayList<>();
            boolean flag = true;
            List<Integer> integers1 = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode_1 temp = q.poll();
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


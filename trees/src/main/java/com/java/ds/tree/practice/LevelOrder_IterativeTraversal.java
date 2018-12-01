package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class LevelOrder_IterativeTraversal {
    public static ArrayList<ArrayList<Integer>> levelOrder_IterativeTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        ArrayList<Integer> curr = new ArrayList<>();

        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                curr.add(temp.getData());
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            } else {
                ArrayList<Integer> c_curr = new ArrayList<>(curr);
                res.add(c_curr);
                curr.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        BinaryTreeNode root= new BinaryTreeNode(1);
        root.left=new BinaryTreeNode(2);
        root.left.left= new BinaryTreeNode(4);
        root.left.right= new BinaryTreeNode(5);
        root.right=new BinaryTreeNode(3);
        root.right.left= new BinaryTreeNode(6);
        root.right.right=new BinaryTreeNode(7);
        System.out.println(root);
        /*
                          1
                       /     \
                      2       3
                     / \     / \
                   4    5   6   7

                   Preorder: 1,2,4,5,3,6,7
         */

        System.out.println(levelOrder_IterativeTraversal(root));;

}

}

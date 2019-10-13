package com.java.ds.tree.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class LevelOrderIterative {

    public static ArrayList<ArrayList<Integer>> levelOrderIterative(BinarySearchTreeNode root){
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        if (root==null)
            return res;
        Queue<BinarySearchTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);

        ArrayList<Integer> curr= new ArrayList<>();
        while (!q.isEmpty()){
            BinarySearchTreeNode temp= q.poll();
            if (temp!=null){
                curr.add(temp.getData());
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
            else {
                ArrayList<Integer> c_curr= new ArrayList<>(curr);
                res.add(c_curr);
                curr.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        System.out.println(res);
        return res;
    }
}

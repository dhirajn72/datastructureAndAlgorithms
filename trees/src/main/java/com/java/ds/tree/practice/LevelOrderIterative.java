package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class LevelOrderIterative {

    public ArrayList<ArrayList<Integer>> levelOrderIterative(BinaryTreeNode root){
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        if (root==null)
            return res;
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);

        ArrayList<Integer> curr= new ArrayList<>();
        while (!q.isEmpty()){
            BinaryTreeNode temp= q.poll();
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
        return res;
    }
}

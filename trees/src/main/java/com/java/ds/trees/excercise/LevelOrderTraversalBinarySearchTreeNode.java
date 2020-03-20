package com.java.ds.trees.excercise;

import com.java.ds.trees.BinarySearchTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class LevelOrderTraversalBinarySearchTreeNode {

    public ArrayList<ArrayList<Integer>> levelOrderTraversalBinarySearchTreeNode(BinarySearchTreeNode root){
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        if (root==null)
            return res;
        Queue<BinarySearchTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> curr= new ArrayList<>();
        while (!q.isEmpty()){
            BinarySearchTreeNode temp=q.poll();
            if (temp!=null){
                curr.add(temp.getData());
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
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

package com.java.ds.trees.excercise;

import com.java.ds.client.DataUtils;
import interview.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrder {
    public static ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if (root == null)
			return res;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			if (tmp != null) {
				curr.add(tmp.data);
				if (tmp.getLeft() != null)
					q.offer(tmp.getLeft());
				if (tmp.right != null)
					q.offer(tmp.right);
			} else {
				ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
				if (!q.isEmpty())
					q.offer(null);
			}
		}
		return res;
    }

    public static ArrayList<ArrayList<Integer>> levelOrderIterative(BinaryTreeNode root){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if (root==null)
            return res;
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);

        ArrayList<Integer> curr= new ArrayList<>();
        while (!q.isEmpty()){
            BinaryTreeNode temp= q.poll();
            if (temp!=null){
                curr.add(temp.data);
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
            else {
                ArrayList<Integer> c_curr=new ArrayList<>(curr);
                res.add(c_curr);
                curr.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeNode root= DataUtils.getBinaryTree();
        System.out.println(root);
        System.out.println(levelOrderIterative(root));


    }



}

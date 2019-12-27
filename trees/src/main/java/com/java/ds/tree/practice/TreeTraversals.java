package com.java.ds.tree.practice;

import com.java.ds.client.DataUtils;
import interview.TreeNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 11/12/19
 */
public class TreeTraversals {

    public static void main(String[] args) {
        TreeNode root = DataUtils.getTreeNode();
        preOrder(root);
        postOrder(root);
        inOrder(root);
        levelOrder(root);
    }

    public static void preOrder(TreeNode root) {
        if (root == null)
            return;
        else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            List<Integer> list = new ArrayList<>();
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp != null) {
                    list.add(temp.val);
                    if (temp.right != null)
                        s.push(temp.right);
                    if (temp.left != null)
                        s.push(temp.left);
                }
            }
            System.out.println(list);
        }
    }

    public static void postOrder(TreeNode root) {
        if (root == null)
            return;
        else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.val);
                    if (temp.left != null)
                        s.push(temp.left);
                    if (temp.right != null)
                        s.push(temp.right);
                }
            }
            List<Integer> list=new ArrayList<>();
            while (!out.isEmpty())
                list.add(out.pop());
            System.out.println(list);
        }
    }

    public static void inOrder(TreeNode root) {
        if (root==null)
            return;
        else {
            Stack<TreeNode> s=new Stack<>();
            List<Integer> list=new ArrayList<>();
            while (!s.isEmpty() || root!=null){
                if (root!=null){
                    s.push(root);
                    root=root.left;
                }
                else {
                    TreeNode temp=s.pop();
                    list.add(temp.val);
                    root=temp.right;
                }
            }
            System.out.println(list);
        }
    }

    public static void levelOrder(TreeNode root) {
        if (root==null)
            return;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> ints=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    ints.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }else {
                    list.add(new ArrayList<Integer>(ints));
                    if (!q.isEmpty())
                        q.offer(null);
                    ints.clear();
                }
            }
            System.out.println(list);
        }
    }
}

//
//op: 4,2,5,1,6,3,7
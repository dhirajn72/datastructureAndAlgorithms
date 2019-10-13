package com.java.ds.trees;

import interview.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 27/09/19
 */
public class CreateTree {
    public static void main(String[] args) {
        TreeNode root=createTree(7);
        System.out.println(root.left);
        System.out.println(root.left.left);
        System.out.println(root.left.right);

    }
    public static TreeNode createTree(int n){
        TreeNode root=null;
        for (int i = 1; i <= n; i++) {
            root=_createTree(root,i);
        }
        _levelOrder(root);
        return root;
    }

    private static void _levelOrder(TreeNode root) {
        if (root==null)
            return;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
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
                    list.add(new ArrayList<Integer>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            System.out.println(list);
        }
    }

    private static TreeNode _createTree(TreeNode root,int data) {
        if (root==null)
            return new TreeNode(data);
        else{
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                TreeNode temp=q.poll();
                if (temp!=null){
                 if (temp.left==null) {
                     temp.left = new TreeNode(data);
                     break;
                 }
                 else q.offer(temp.left);
                }
                if (temp.right==null) {
                    temp.right = new TreeNode(data);
                    break;
                }
                else q.offer(temp.right);
            }
        }
        return root;
    }
}

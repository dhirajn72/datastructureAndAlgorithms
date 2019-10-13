package com.java.ds.trees;

import interview.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class TreeNodeOperations {

    public static List<Integer> preOrder(TreeNode root){
        if (root==null)return null;
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            List<Integer> result=new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp!=null){
                    result.add(temp.val);
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return result;
        }
    }
    public static List<Integer> inOrder(TreeNode root){
        if (root==null)return null;
        else {
            Stack<TreeNode> s=new Stack<>();
            List<Integer> result=new ArrayList<>();
            while (!s.isEmpty() || root!=null){
                if (root!=null){
                    s.push(root);
                    root=root.left;
                }
                else {
                    TreeNode temp=s.pop();
                    result.add(temp.val);
                    root=temp.right;
                }
            }
            return result;
        }
    }

    public static List<Integer> postOrder(TreeNode root){
        if (root==null)return null;
        else {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            Stack<Integer> out=new Stack<>();
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp!=null){
                    out.push(temp.val);
                    if (temp.left!=null)
                        s.push(temp.left);
                    if (temp.right!=null)
                        s.push(temp.right);
                }
            }
            List<Integer> result=new ArrayList<>();
            while (!out.isEmpty())
                result.add(out.pop());
            return result;
        }
    }
}

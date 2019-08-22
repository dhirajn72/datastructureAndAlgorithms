package com.java.ds.tree.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Dhiraj
 * @date 23/07/19
 */
public class TreeOperations {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        _createTreeLevelOrder(root,2);
        _createTreeLevelOrder(root,3);
        _createTreeLevelOrder(root,4);
        _createTreeLevelOrder(root,5);
        _createTreeLevelOrder(root,6);
        _createTreeLevelOrder(root,7);
        _levelOrder(root);
        _preOrder(root);
        _postOrder(root);
        _inOrder(root);

    }
    private static void _inOrder(BinaryTreeNode root) {
        if (root==null)return;
        else {
            Stack<BinaryTreeNode> s= new Stack<>();
            while (!s.isEmpty()||root!=null){
                if (root!=null){
                    s.push(root);
                    root=root.getLeft();
                }else {
                    BinaryTreeNode temp=s.pop();
                    System.out.print(temp.data+", ");
                    root=temp.getRight();
                }
            }
            System.out.println();
        }
    }
    private static void _postOrder(BinaryTreeNode root) {
        if (root==null)return;
        else {
            Stack<BinaryTreeNode> s= new Stack<>();
            s.push(root);
            Stack<Integer> out=new Stack<>();
            while (!s.isEmpty()){
                BinaryTreeNode temp=s.pop();
                if (temp!=null){
                    out.push(temp.data);
                    if (temp.left!=null)
                        s.push(temp.left);
                    if (temp.right!=null)
                        s.push(temp.right);
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop()+", ");
            System.out.println();
        }
    }
    private static void _preOrder(BinaryTreeNode root) {
        if (root==null)return;
        else {
            Stack<BinaryTreeNode> s=new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                BinaryTreeNode temp=s.pop();
                if (temp!=null){
                    System.out.print(temp.getData()+", ");
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            System.out.println();
        }
    }
    private static void _levelOrder(BinaryTreeNode root) {
        if (root==null)return;
        else {
            Queue<BinaryTreeNode> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers= new CopyOnWriteArrayList<>();
            List<List<Integer>> list= new CopyOnWriteArrayList<>();
            while (!q.isEmpty()){
                BinaryTreeNode temp= q.poll();
                if (temp!=null){
                    integers.add(temp.getData());
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    list.add(new CopyOnWriteArrayList<Integer>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();

                }
            }
            System.out.println(list);
        }
    }
    private static void _createTreeLevelOrder(BinaryTreeNode root,int data){
        if (root==null)
            root = new BinaryTreeNode(data);
        else {
            Queue<BinaryTreeNode> q= new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()){
                BinaryTreeNode temp=q.poll();
                if (temp!=null){
                    if (temp.left!=null)
                        q.offer(temp.left);
                    else {
                        temp.setLeft(new BinaryTreeNode(data));
                        break;
                    }
                    if (temp.right!=null)
                        q.offer(temp.right);
                    else {
                        temp.setRight(new BinaryTreeNode(data));
                        break;
                    }
                }
            }
        }
    }
}

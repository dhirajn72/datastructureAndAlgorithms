package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class PostOrderIterativeTraversal {
    public static ArrayList<Integer> postOrderIterativeTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);

        BinaryTreeNode prev = null;
        while (!s.isEmpty()) {
            BinaryTreeNode currentNode = s.peek();
            if (prev == null || prev.left == currentNode || prev.right == currentNode) {
                if (currentNode.left != null)
                    s.push(currentNode.left);
                else if (currentNode.right != null)
                    s.push(currentNode.right);
            } else if (currentNode.left == prev) {
                if (currentNode.right != null)
                    s.push(currentNode.right);
            } else {
                res.add(currentNode.getData());
                s.pop();
            }
            prev = currentNode;

        }
        return res;
    }

    public static ArrayList<Integer> postOrderInterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.peek();
            if (prev == null || prev.left == currentNode || prev.right == currentNode) {
                if (currentNode.left != null)
                    stack.push(currentNode.left);
                else if (currentNode.right != null)
                    stack.push(currentNode.right);
            } else if (currentNode.left == prev) {
                if (currentNode.right != null)
                    stack.push(currentNode.right);

            } else {
                res.add(currentNode.getData());
                stack.pop();
            }
            prev = currentNode;
        }
        return res;
    }

    public static ArrayList<Integer> postOrderIterative(BinaryTreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        if (root==null)return res;

        Stack<BinaryTreeNode> stack= new Stack<>();
        stack.push(root);

        BinaryTreeNode prev=null;
        while (!stack.isEmpty()){
            BinaryTreeNode currentNode=stack.peek();
            if (prev==null||prev.left==currentNode||prev.right==currentNode){
                if (currentNode.left!=null)
                    stack.push(currentNode.left);
                else if(currentNode.right!=null)
                    stack.push(currentNode.right);
            }
            else if(currentNode.left==prev){
                if (currentNode.right!=null)
                    stack.push(currentNode.right);
            }
            else {
                res.add(currentNode.getData());
                stack.pop();
            }
            prev=currentNode;
        }
        return res;
    }

    public static ArrayList<Integer> postOrder_Iterative(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)return res;
        Stack<BinaryTreeNode> stack= new Stack<>();
        stack.push(root);

        BinaryTreeNode prev=null;
        while (!stack.isEmpty()){
            BinaryTreeNode currentNode=stack.peek();
            if (prev==null||prev.left==currentNode||prev.right==currentNode){
                if (currentNode.left!=null)
                    stack.push(currentNode.left);
                else if (currentNode.right!=null)
                    stack.push(currentNode.right);
            }
            else if (currentNode.left==prev){
                if (currentNode.right!=null)
                    stack.push(currentNode.right);
            }
            else {
                res.add(currentNode.data);
                stack.pop();
            }
            prev=currentNode;
        }
        return res;
    }


    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(12);
        binaryTreeNode.left = new BinaryTreeNode(23);
        binaryTreeNode.left.left = new BinaryTreeNode(22);
        binaryTreeNode.left.left.left = new BinaryTreeNode(45);
        binaryTreeNode.left.right = new BinaryTreeNode(65);
        binaryTreeNode.right = new BinaryTreeNode(56);
        binaryTreeNode.right.left = new BinaryTreeNode(88);
        binaryTreeNode.right.right = new BinaryTreeNode(99);

        /*
                12
              /    \
            23      56
          /   \     / \
        22     65  88  99
       /
      45

      Pre-Order:  12,23,22,45,65,56,88,99
      Post-order: 45,22,65,23,88,99,56,12

        */

        System.out.println(postOrderIterativeTraversal(binaryTreeNode));
        System.out.println(postOrderInterative(binaryTreeNode));
        System.out.println(postOrderIterative(binaryTreeNode));
        System.out.println(postOrder_Iterative(binaryTreeNode));
    }
}

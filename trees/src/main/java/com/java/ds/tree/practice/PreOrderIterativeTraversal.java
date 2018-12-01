package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class PreOrderIterativeTraversal {

    public static ArrayList<Integer> preOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            res.add(temp.getData());
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return res;
    }

    public static ArrayList<Integer> preOrderIterativeTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);

        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            res.add(temp.getData());
            if (temp.right != null)
                s.push(temp.right);
            if (temp.left != null)
                s.push(temp.left);
        }
        return res;
    }

    public void preOrderRecursiveTraversal(BinaryTreeNode root) {
        if (root != null) {
            preOrderRecursiveTraversal(root.getLeft());
            System.out.print(root.getData() + ",");
            preOrderRecursiveTraversal(root.getRight());
        }
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

        /*      12
              /    \
            23      56
          /   \     / \
        22     65  88  99
       /
      45

      Pre-Order:  12,23,22,45,65,56,88,99
      Post-order: 45,22,65,23,88,99,56,12

        */

        System.out.println(preOrderIterativeTraversal(binaryTreeNode));
        System.out.println(preOrderIterative(binaryTreeNode));
        System.out.println(_preOrderIterative(binaryTreeNode));
    }


    public static ArrayList<Integer> _preOrderIterative(BinaryTreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        if (root==null)return res;
        Stack<BinaryTreeNode> stack= new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTreeNode temp=stack.pop();
            res.add(temp.getData());
            if (temp.right!=null)
                stack.push(temp.right);
            if (temp.left!=null)
                stack.push(temp.left);
        }
        return  res;
    }
}

package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/01/19
 */
public class PreOrderIterative_1 {
    public static ArrayList<Integer> preorder(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> stack= new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTreeNode temp=stack.pop();
            res.add(temp.data);
            if (temp.right!=null)
                stack.push(temp.right);
            if (temp.left!=null)
                stack.push(temp.left);
        }
        return res;
    }
}

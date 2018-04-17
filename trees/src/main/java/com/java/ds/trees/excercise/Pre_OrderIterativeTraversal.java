package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Pre_OrderIterativeTraversal {

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode node){
        ArrayList<Integer> res=new ArrayList<>();
        if (node==null)
            return  res;
        Stack<BinaryTreeNode> stack =  new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            BinaryTreeNode temp= stack.pop();
            res.add(temp.data);
            if (temp.right!=null)
                stack.push(temp.right);
            if (temp.left!=null)
                stack.push(temp.left);
        }
        return  res;
    }
}

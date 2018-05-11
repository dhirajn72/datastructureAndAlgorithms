package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class PreOrder_IterativeTraversal {

    public ArrayList<Integer> preOrder_iterativeTraversals(BinaryTreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> s= new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode temp=s.pop();
            res.add(temp.getData());
            if (temp.getRight()!=null)
                s.push(temp.getRight());
            if (temp.getLeft()!=null)
                s.push(temp.getLeft());
        }
        return res;
    }
}

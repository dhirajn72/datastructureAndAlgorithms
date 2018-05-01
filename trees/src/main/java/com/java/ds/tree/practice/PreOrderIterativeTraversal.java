package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class PreOrderIterativeTraversal {

    public ArrayList<Integer> preOrderIterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> s= new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode temp= s.pop();
            res.add(temp.getData());
            if (temp.right!=null)
                s.push(temp.right);
            if (temp.left!=null)
                s.push(temp.left);
        }
        return res;
    }
}

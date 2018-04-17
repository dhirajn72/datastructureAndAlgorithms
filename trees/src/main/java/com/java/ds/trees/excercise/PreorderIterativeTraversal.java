package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class PreorderIterativeTraversal {
    public ArrayList<Integer> preorderIterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> s= new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode temp=s.pop();
            res.add(temp.data);
            if (temp.right!=null)
                s.push(temp.right);
            if (temp.left!=null)
                s.push(temp.left);
        }
        return res;
    }
}

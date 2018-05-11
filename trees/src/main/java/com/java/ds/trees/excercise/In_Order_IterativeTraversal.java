package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class In_Order_IterativeTraversal {

    public ArrayList<Integer> inOrderIterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        Stack<BinaryTreeNode> s =  new Stack<>();
        boolean done=false;
        BinaryTreeNode curr=root;
        while (!done){
            if (curr!=null){
                s.push(curr);
                curr=curr.getLeft();
            }
            else {
                if (s.isEmpty())
                    done=true;
                else {
                    curr=s.pop();
                    res.add(curr.getData());
                    curr=curr.getRight();
                }
            }
        }
        return res;
    }
}

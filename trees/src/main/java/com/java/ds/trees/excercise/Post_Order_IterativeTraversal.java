package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class Post_Order_IterativeTraversal {

    public ArrayList<Integer> postOrderterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> s =  new Stack<>();
        s.push(root);
        BinaryTreeNode prev=null;
        while (!s.isEmpty()){
            BinaryTreeNode curr= s.peek();
            if (prev==null||prev.getLeft()==curr||prev.getRight()==curr){
                if (curr.getLeft()!=null)
                    s.push(curr.getLeft());
                else if (curr.getRight()!=null)
                    s.push(curr.getRight());
            }
            else if (curr.getLeft()==prev){
                if (curr.getRight()!=null) {
                    s.push(curr.getRight());
                }
            }
            else {
                res.add(curr.getData());
                s.pop();
            }
            prev=curr;
        }
        return res;
    }

}

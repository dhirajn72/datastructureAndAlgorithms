package com.java.ds.trees.excercise;


import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 26/04/18
 */
public class InOrder_IterativeTraversal {
    public ArrayList<Integer> inOrderIterativeTravesal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        Stack<BinaryTreeNode> s= new Stack<>();
       // s.push(root);
        boolean done=false;
        BinaryTreeNode currentNode=root;
        while (!done){
            if (currentNode!=null){
                s.push(currentNode);
                currentNode=currentNode.getLeft();
            }
            else {
                if (s.isEmpty()){
                    done=true;
                }
                else {
                    currentNode=s.pop();
                    res.add(currentNode.getData());
                    currentNode=currentNode.getRight();
                }
            }
        }
        return res;
    }
}

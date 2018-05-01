package com.java.ds.tree.practice;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class InOrderIterativeTraversal {
    public ArrayList<Integer> inOrderIterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        Stack<BinaryTreeNode> s= new Stack<>();
        boolean done=false;
        BinaryTreeNode currentNode= root;
        while (!done){
            if (currentNode!=null){
                s.push(currentNode);
                currentNode=currentNode.left;
            }
            else {
                if (s.isEmpty()){
                    done=true;
                }
                else {
                    currentNode=s.pop();
                    res.add(currentNode.getData());
                    currentNode=currentNode.right;
                }
            }
        }
        return res;
    }
}

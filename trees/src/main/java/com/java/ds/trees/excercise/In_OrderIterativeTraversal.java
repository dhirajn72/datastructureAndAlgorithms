package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 16/04/18
 */
public class In_OrderIterativeTraversal {
    public ArrayList<Integer> inorderTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        Stack<BinaryTreeNode> stack= new Stack<>();

        BinaryTreeNode currentNode=root;
        boolean done= false;
        while(!done){
            if (currentNode!=null){
                stack.push(currentNode);
                currentNode=currentNode.left;
            }
            else {
                if(stack.isEmpty()){
                    done=true;
                }
                else {
                    currentNode=stack.pop();
                    res.add(currentNode.data);
                    currentNode=currentNode.right;
                }
            }
        }
        return res;
    }
}

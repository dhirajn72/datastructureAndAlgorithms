package com.java.ds.trees.excercise;

import com.java.ds.client.DataUtils;
import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 10/04/18
 */
public class InorderIterativeTraversal {
    public static ArrayList<Integer> inorderIterativeTraversal(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;

        Stack<BinaryTreeNode> s= new Stack<>();
        BinaryTreeNode currentNode=root;
        boolean done=false;
        while (!done){
            if (currentNode!=null){
                s.push(currentNode);
                currentNode=currentNode.left;
            }
            else{
                if (s.isEmpty()){
                    done=true;
                }
                else {
                    currentNode=s.pop();
                    res.add(currentNode.data);
                    currentNode=currentNode.right;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeNode root=DataUtils.getBinaryOrderedTree();
        System.out.println(inorderIterativeTraversal(root));
    }
}

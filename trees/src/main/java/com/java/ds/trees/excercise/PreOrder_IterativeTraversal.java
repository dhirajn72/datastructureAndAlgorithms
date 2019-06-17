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

    public static void main(String[] args) {
        BinaryTreeNode root= new BinaryTreeNode(1);
        root.left=new BinaryTreeNode(2);
        root.left.left= new BinaryTreeNode(4);
        root.left.right= new BinaryTreeNode(5);
        root.right=new BinaryTreeNode(3);
        root.right.left= new BinaryTreeNode(6);
        root.right.right=new BinaryTreeNode(7);
        System.out.println(root);
        /*
                          1
                       /     \
                      2       3
                     / \     / \
                   4    5   6   7

                   Preorder: 1,2,4,5,3,6,7
         */

        //ArrayList<Integer> integers= preorder_Iterative(root);
        //System.out.println(integers);
    }
}

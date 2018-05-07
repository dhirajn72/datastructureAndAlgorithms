package com.java.ds.trees.excercise;

import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 26/04/18
 */
public class PostOrder__IterativeTraversal {

    public ArrayList<Integer> postOrderIterativeTraversal(BinaryTreeNode root){

        /*ArrayList<Integer> res= new ArrayList<>();
        if(root==null)
            return res;
        Stack<BinaryTreeNode> s= new Stack<>();
        s.push(root);
        BinaryTreeNode prev=null;
        while (!s.isEmpty()){
            BinaryTreeNode curr=s.peek();
            if (prev==null || prev.left==curr || prev.right==curr){
                if (curr.left!=null)
                    s.push(curr.left);
                else if (curr.right!=null)
                    s.push(curr.right);
            }
            else if(curr.left==prev){
                if (curr.right!=null)
                    s.push(curr.right);
            }
            else{
                res.add(curr.data);
                s.pop();
            }
            prev=curr;
        }
        return res;*/
        ArrayList<Integer> res= new ArrayList<>();
        if(root==null)
            return res;
        Stack<BinaryTreeNode> s= new Stack<>();
        s.push(root);
        BinaryTreeNode prev=null;
        while(!s.isEmpty()){
            BinaryTreeNode curr=s.peek();
            if(prev==null||prev.left==curr||prev.right==curr){
                if(curr.left!=null)
                    s.push(curr.left);
                else if(curr.right!=null)
                    s.push(curr.right);
            }
            else if(curr.left==prev) {
                  if (curr.right != null)
                     s.push(curr.right);
                }
                else{
                    //System.out.print(curr.data+" ");
                    res.add(curr.data);
                    s.pop();
                }
            prev=curr;
        }
        return  res;
    }
}





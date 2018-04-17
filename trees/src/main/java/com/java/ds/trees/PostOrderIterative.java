/*Copyright (c) April 10, 2018 @DhirajSingh.
 * E-Mail           	: dhirajn72@gmail.com
 * Creation Date    	: 2018-04-10 03:15:46
 * Last modification	: 2018-04-10
               by		: Dhiraj Singh
 * Book Title			: Data Structures And Algorithms
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.java.ds.trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderIterative {
	   public ArrayList<Integer> postorderTraversal(BinaryTreeNode root) {
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        if(root == null)
	            return res;
	        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	        s.push(root);

	        BinaryTreeNode prev = null;
	        while(!s.isEmpty()){
	        	BinaryTreeNode curr = s.peek();
	            if(prev == null || prev.getLeft() == curr || prev.right == curr){
	                // traverse from top to bottom, and if curr has left child or right child, 
	            	// push into the stack; otherwise, pop out. 
	                if(curr.getLeft() != null)
	                    s.push(curr.getLeft());
	                else if(curr.right != null)
	                    s.push(curr.right);
	            }else if(curr.getLeft() == prev){
	                if(curr.right != null)
	                    s.push(curr.right);
	            }else{
	                res.add(curr.data);
	                s.pop();
	            }
	            prev = curr;
	        }
	        return res;
	    }
}

/*
        [12]
       /    \
   [23]     [56]
   /  \     /  \
 [22] [65][88] [99]
 /  \
[45] null

 */

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

public class InOrderIterative {
    public ArrayList<Integer> inorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        BinaryTreeNode currentNode = root;
        boolean done = false;
        while(!done){
            if(currentNode != null){
                s.push(currentNode);
                currentNode = currentNode.left;
            }else{
                if(s.isEmpty())
                    done = true;
                else{
                	currentNode = s.pop();
                    res.add(currentNode.data);
                    currentNode = currentNode.right;
                }
            }
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
  /
[45]


 */

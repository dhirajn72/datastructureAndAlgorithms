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

public class PreOrderIterative {
    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        while(!s.isEmpty()){
        	BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            // pay more attention to this sequence. 
            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.getLeft() != null)
                s.push(tmp.getLeft());
        }
        return res;
    }
}

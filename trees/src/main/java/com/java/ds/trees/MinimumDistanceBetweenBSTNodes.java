package com.java.ds.trees;

import interview.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 22/12/19
 */


/**
 *
 *
 *Success
 Details
 Runtime: 3 ms, faster than 5.23% of Java online submissions for Minimum Distance Between BST Nodes.
 Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Minimum Distance Between BST Nodes.
 */
public class MinimumDistanceBetweenBSTNodes {

    public int minDiffInBST(TreeNode root) {
        if (root==null)return 0;
        if (root.left==null && root.right==null)return 0;
        List<Integer> inOrder=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        while (!s.isEmpty()||root!=null){
            if (root!=null){
                s.push(root);
                root=root.left;
            }
            else {
                TreeNode temp=s.pop();
                inOrder.add(temp.val);
                root=temp.right;
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<inOrder.size()-1;i++){
            min=Math.min(min,inOrder.get(i+1)-inOrder.get(i));

        }
        return min;
    }
}

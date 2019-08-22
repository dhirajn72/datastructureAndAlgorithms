package com.leetcode;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class DataUtil {
    /**
     *
     *                                1
     *                         2            3
     *                      4     5    6        7
     *
     *
     *
     *
     * @return
     */
    public  static  TreeNode getTree(){
        TreeNode node= new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);
        node.right.left=new TreeNode(6);
        node.right.right=new TreeNode(7);
        return node;
    }
}

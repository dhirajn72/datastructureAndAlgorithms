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
    public  static TreeNode_1 getTree(){
        TreeNode_1 node= new TreeNode_1(1);
        node.left=new TreeNode_1(2);
        node.right=new TreeNode_1(3);
        node.left.left=new TreeNode_1(4);
        node.left.right=new TreeNode_1(5);
        node.right.left=new TreeNode_1(6);
        node.right.right=new TreeNode_1(7);
        return node;
    }
}

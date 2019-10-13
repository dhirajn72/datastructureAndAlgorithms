package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 27/09/19
 */
public class PrintAllAncesstors {
    public static void main(String[] args) {
        TreeNode root= DataUtils.getTreeNode();
        TreeNode node=root.right.right;
        System.out.println(printAncesstors(root,node));

    }


    public static boolean printAncesstors(TreeNode root,TreeNode node){
        if (root==null)
            return false;
        else if (root.left==node||root.right==node ||printAncesstors(root.left,node)||printAncesstors(root.right,node)){
            System.out.println(root.val);
            return true;
        }
        return false;
    }
}

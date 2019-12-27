package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.TreeNode;


/**
 * @author Dhiraj
 * @date 22/12/19
 */
public class RecoverBST {

    public static void main(String[] args) {
        TreeNode root= DataUtils.getBSTTreeNode();
        recoverTree(root);// Correct BST
        //Make a mistake in tree.
        root.right.val=11;
        root.right.left.val=12;
        System.out.println();
        recoverTree(root);
        System.out.println(root);
    }

    static TreeNode first;
    static TreeNode second;
    static TreeNode pre;
    public static void inorder(TreeNode root){
        if(root==null)
            return;

        inorder(root.left);

        if(pre==null){
            pre=root;
        }else{
            if(root.val<pre.val){
                if(first==null){
                    first=pre;
                }

                second=root;
            }
            pre=root;
        }

        inorder(root.right);
    }

    public static void recoverTree(TreeNode root) {
        if(root==null)
            return;

        inorder(root);
        if(second!=null && first !=null){
            int val = second.val;
            second.val = first.val;
            first.val = val;
        }
    }
}

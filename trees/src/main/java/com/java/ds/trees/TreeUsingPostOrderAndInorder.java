package com.java.ds.trees;

import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class TreeUsingPostOrderAndInorder {
    public static void main(String[] args) {
        int[] postOrder={4,5,2,6,7,3,1};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode root=buildTree(postOrder,inOrder);
        System.out.println(root);
        System.out.println(TreeNodeOperations.postOrder(root));
        System.out.println(TreeNodeOperations.inOrder(root));



    }

    public static TreeNode buildTree(int[] postOrder, int[] inorder) {
        if (postOrder==null||inorder==null||postOrder.length!=inorder.length)return null;
        return _builTree(postOrder,0,postOrder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode _builTree(int[] postOrder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {

        if (postStart>postEnd||inStart>inEnd)return null;

        int data=postOrder[postEnd];
        TreeNode root=new TreeNode(data);
        int offset=inStart;
        for (;offset<inEnd;offset++){
            if (inorder[offset]==data)break;
        }
        root.left=_builTree(postOrder,postStart,postStart+offset-inStart-1,inorder,inStart,offset-1);
        root.right=_builTree(postOrder,postStart+offset-inStart,postEnd-1,inorder,offset+1,inEnd);
        return root;
    }

}

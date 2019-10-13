package com.java.ds.tree.practice;

import com.java.ds.client.DataUtils;
import com.java.ds.trees.excercise.LevelOrder;
import interview.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class BuildTreeFromPreOrderAndInOrder {


    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5,1, 6, 3,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root);
        System.out.println();
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null||preorder.length!=inorder.length)return null;
        return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode _buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart>preEnd ||inStart>inEnd)
            return null;

        int data=preOrder[preStart];
        TreeNode root=new TreeNode(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inOrder[offSet]==data)
                break;
        }
        root.left=_buildTree(preOrder,preStart+1,preStart+offSet-inStart,inOrder,inStart,offSet-1);
        root.right=_buildTree(preOrder,preStart+offSet-inStart+1,preEnd,inOrder,offSet+1,inEnd);
        return root;
    }
}

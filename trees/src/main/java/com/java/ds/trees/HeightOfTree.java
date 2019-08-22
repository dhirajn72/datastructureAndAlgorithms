package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class HeightOfTree {
    public static void main(String[] args) {
        BinaryTreeNode root= DataUtils.getLeftSkeewedBinaryOrderedTree();
        heightOfTree(root);
        findHeightOfTree(root);

        /**
                     10
              8                 12
         7        9      11         13


         * @return root
         */
        root=DataUtils.getBinarySearchTree();
        heightOfTree(root);
        findHeightOfTree(root);


    }
    public  static void heightOfTree(BinaryTreeNode root){
        int leftHeight=_height(root.left);
        int rightHeight=_height(root.right);
        int height=Math.max(leftHeight,rightHeight);
        System.out.println(height);
    }

    private static int _height(BinaryTreeNode root) {
        if (root!=null) {
            int leftHeight = _height(root.left);
            int rightHeight = _height(root.right);
            return Math.max(leftHeight, rightHeight)+1;
        }
        return 0;
    }


    public static void findHeightOfTree(BinaryTreeNode root){
        Queue<interview.BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int height=0;
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.remove();
            if (temp!=null ){
                System.out.print(temp.getData()+",");
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
            else {
                height++;
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        System.out.println("\nHeight of the tree is ::"+height);
    }
}

package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class MinDepth {
    public static void main(String[] args) {

        TreeNode root= new TreeNode(3);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));
        root.getRight().setRight(new TreeNode(7));
        root.getRight().setLeft(new TreeNode(15));




        System.out.println(minDepth(root));

        /**
         *
          3
         / \
         9  20
           /  \
         15   7

         */


    }

    public static int minDepth(TreeNode root) {
        if (root==null)return 0;
        else {
            Queue<TreeNode> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int count=1;
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    if (temp.getLeft()==null && temp.getRight()==null)
                       return count;
                    if (temp.getLeft()!=null)
                        q.offer(temp.getLeft());
                    if (temp.right!=null)
                        q.offer(temp.getRight());
                }
                else {
                    if (!q.isEmpty())
                        q.offer(null);
                    count++;
                }
            }
            return count;
        }
    }
}

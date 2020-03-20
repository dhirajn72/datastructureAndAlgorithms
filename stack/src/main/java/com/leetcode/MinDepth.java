package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class MinDepth {
    public static void main(String[] args) {

        TreeNode_1 root= new TreeNode_1(3);
        root.setLeft(new TreeNode_1(9));
        root.setRight(new TreeNode_1(20));
        root.getRight().setRight(new TreeNode_1(7));
        root.getRight().setLeft(new TreeNode_1(15));




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

    public static int minDepth(TreeNode_1 root) {
        if (root==null)return 0;
        else {
            Queue<TreeNode_1> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int count=1;
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
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

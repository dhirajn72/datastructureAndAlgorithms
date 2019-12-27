package com.java.ds.trees;

import interview.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 22/12/19
 */
public class GenerateTrees {

    public static void main(String[] args) {
        List<TreeNode> treeNodes=generateTrees(5);
        System.out.println(treeNodes.size());
        /*treeNodes.parallelStream()
                .forEach(node->System.out.println(node));*/

    }

    public static List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        return helper(1, n);
    }

    public static List<TreeNode> helper(int m, int n){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(m>n){
            result.add(null);
            return result;
        }

        for(int i=m; i<=n; i++){
            List<TreeNode> ls = helper(m, i-1);
            List<TreeNode> rs = helper(i+1, n);
            for(TreeNode l: ls){
                for(TreeNode r: rs){
                    TreeNode curr = new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    result.add(curr);
                }
            }
        }
        return result;
    }
}

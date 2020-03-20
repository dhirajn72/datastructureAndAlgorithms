

package com.java.ds.trees;

import com.java.ds.client.DataUtils;
import interview.BinarySearchTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBSTs {
    public static void main(String[] args) {
        List<BinarySearchTreeNode> node=generateTrees(7);
        System.out.println(node);
        for (BinarySearchTreeNode treeNode:node)
            _levelOrder(treeNode);
        System.out.println("***********");
        System.out.println(_levelOrder(DataUtils.getBinarySearchTreeNode()));

    }
    public static List<ArrayList<Integer>> _levelOrder(BinarySearchTreeNode root){
        ArrayList<Integer> integers=new ArrayList<>();
        List<ArrayList<Integer>> lists=new ArrayList<>();
        if (root==null)return lists;
        else {
            Queue<BinarySearchTreeNode> q=new LinkedList<>();
            q.offer(root);q.offer(null);
            while (!q.isEmpty()){
                BinarySearchTreeNode temp=q.poll();
                if (temp!=null){
                    integers.add(temp.getData());
                    if (temp.getLeft()!=null)
                        q.offer(temp.getLeft());
                    if (temp.getRight()!=null)
                        q.offer(temp.getRight());
                }else {
                    lists.add(new ArrayList<Integer>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
        }
        //System.out.println(lists);
        return lists;
    }

    public static ArrayList<BinarySearchTreeNode> generateTrees(int n) {
        if(n == 0) return generateTrees(1, 0);
        return generateTrees(1, n);
        
    }
    public static ArrayList<BinarySearchTreeNode> generateTrees(int start, int end) {
        ArrayList<BinarySearchTreeNode> subTrees = new ArrayList<BinarySearchTreeNode>();
        if(start > end){
            subTrees.add(null);
            return subTrees;
        }          
        for(int i = start; i <= end; i++){
            for(BinarySearchTreeNode left : generateTrees(start, i - 1)){
                for(BinarySearchTreeNode right : generateTrees(i + 1, end)){
                	BinarySearchTreeNode aTree = new BinarySearchTreeNode(i);
                    aTree.setLeft(left);
                    aTree.setRight(right);
                    subTrees.add(aTree);
                }
            }
        }
        return subTrees;
    } 
}

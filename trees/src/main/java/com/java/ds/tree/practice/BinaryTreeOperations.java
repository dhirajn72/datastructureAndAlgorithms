package com.java.ds.tree.practice;

import com.java.ds.client.DataUtils;
import interview.BinaryTreeNode;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 18/06/19
 */
public class BinaryTreeOperations {
    public static void main(String[] args) {
        BinaryTreeNode root1= DataUtils.getBinaryOrderedTree();
        BinaryTreeNode root2= DataUtils.getBinaryMirrorOrderedTree();

        //System.out.println(areIdenticals(root1,root2));
        //System.out.println(areMirrors(root1,root2));
        //postOrder(root1);
        System.out.println(diameter(root1));
        printPaths(DataUtils.getSmallBinaryOrderedTree());
        System.out.println("*******");
        printPaths(root1);
        System.out.println(haspathSum(DataUtils.getBinaryOrderedTree(),10));


    }

    private static boolean haspathSum(BinaryTreeNode root, int sum) {
        if (root==null)return false;
        if (root.getLeft()==null && root.getRight()==null && root.getData()==sum) {
            return true;
        }
        else return haspathSum(root.getLeft(),sum-root.getData()) || haspathSum(root.getRight(),sum-root.getData());

    }

    private static void printPaths(BinaryTreeNode root) {
        int[] path= new  int[250];
        printPaths(root,path,0);
    }

    private static void printPaths(BinaryTreeNode root, int[] path, int pathLen) {
        if (root==null)
            return;
        path[pathLen++]=root.getData();
        if (root.getLeft()==null && root.getRight()==null)
            printArray(path,pathLen);
        else {
            printPaths(root.getLeft(),path,pathLen);
            printPaths(root.getRight(),path,pathLen);
        }
    }

    private static void printArray(int[] path, int pathLen) {
        for (int i=0;i<pathLen;i++)
            System.out.print(path[i]+" ");
        System.out.println();
    }

    private static int diameter(BinaryTreeNode root) {
        if (root==null)return 0;
        int len1=height(root.getLeft())+height(root.getRight());
        int lDiameter=diameter(root.getLeft());
        int rDiameter=diameter(root.getRight());
        return Math.max(len1,Math.max(lDiameter,rDiameter));
    }

    private static int height(BinaryTreeNode root) {
        if (root==null)return 0;
        int lDepth=height(root.getLeft());
        int rDepth=height(root.getRight());
        return Math.max(lDepth,rDepth)+1;
    }

    private static boolean areIdenticals(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1==root2) return true;
        if (root1.getData()!=root2.getData())
            return false;
        return areIdenticals(root1.getLeft(),root2.getLeft()) || areIdenticals(root1.getRight(),root2.getRight());
    }

    private static boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1==root2) return true;
        if (root1.getLeft() == null || root2.getLeft()==null)
            return false;
        if (root1.getData()==root2.getData())
            return true;
        return areIdenticals(root1.getLeft(),root2.getRight()) || areIdenticals(root1.getRight(),root2.getLeft());
    }

    public static void postOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> s= new Stack<>();
        Stack<Integer> out= new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode temp=s.pop();
            if (temp!=null) {
                out.push(temp.getData());
                if (temp.getLeft()!=null)
                    s.push(temp.getLeft());
                if (temp.getRight()!=null)
                    s.push(temp.getRight());
            }
        }
        while (!out.isEmpty())
            System.out.print(out.pop()+",");
    }
}

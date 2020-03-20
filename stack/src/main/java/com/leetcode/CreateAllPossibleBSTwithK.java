package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 12/07/19
 */
public class CreateAllPossibleBSTwithK {
    public static void main(String[] args) {
        //System.out.println(generateTrees(3));
        TreeNode_1 root= new TreeNode_1(0);
        root.left=new TreeNode_1(-1);
        root.right=new TreeNode_1(-1);
        root.right.left=new TreeNode_1(3);
        root.right.right=new TreeNode_1(6);

        //-2147483648,null,2147483647]

        System.out.println(isValidBST(root));
        //[5,1,4,null,null,3,6]
        System.out.println("Created trees:::");
        //List<TreeNode_1> treeNode1= _generateTrees(3);
        List<TreeNode_1> treeNode1 = generateTrees(3);



        System.out.println(treeNode1);
        System.out.println(countNodes(root));
        System.out.println("**********");
        TreeNode_1 node=new TreeNode_1(1);
        System.out.println(node);
        flatten(node );
        System.out.println(node);



    }

    private static List<TreeNode_1> _generateTrees(int n) {
        if (n==0)return _generateTrees(1,0);
        return _generateTrees(1,n);
    }

    private static List<TreeNode_1> _generateTrees(int start, int end) {
        ArrayList<TreeNode_1> subTree= new ArrayList<>();
        if (start>end){
            subTree.add(null);
            return subTree;
        }
        else {
            for (int i = start; i <=end ; i++) {
                List<TreeNode_1> treeNode1s =_generateTrees(start,i-1);
                for (TreeNode_1 left: treeNode1s){
                    List<TreeNode_1> treeNodes11 =_generateTrees(i+1,end);
                    for (TreeNode_1 right: treeNodes11){
                        TreeNode_1 tree=new TreeNode_1(i);
                        tree.left=left;
                        tree.right=right;
                        subTree.add(tree);
                    }
                }
            }
        }
        return subTree;
    }

    public static boolean isValidBST(TreeNode_1 root) {
       return helper(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }

    private static boolean helper(TreeNode_1 root, double minValue, double maxValue) {
        if (root==null)return true;
        if (root.data<=minValue||root.data>=maxValue)
            return false;
        boolean left=helper(root.left,minValue,root.data);
        boolean right=helper(root.right,root.data,maxValue);
        return left && right;
    }


    public static List<TreeNode_1> generateTrees(int n) {
        Set<List<Integer>> ints= new HashSet<>();
        List<TreeNode_1> treeNode1s = new ArrayList<>();
        String string="";
        for (int i=1;i<=n;i++){
            string+=i;
        }
        _permutation("",string,ints);
        for (List<Integer> integers:ints){
            treeNode1s.add(_createTree(integers));
        }
        return treeNode1s;
    }

    private static TreeNode_1 _createTree(List<Integer> integers) {
        TreeNode_1 node = null;
        for (Integer i : integers)
            node = _createTree(node, i);
        return node;
    }


    private static void _permutation(String prefix, String str, Set<List<Integer>> ints) {
        if (str.length()==0) {
            char[] arr=prefix.toCharArray();
            List<Integer> integers= new ArrayList<>();
            for (char c:arr){
                integers.add(Integer.valueOf(c+""));
            }
            ints.add(integers);
        }
        else
            for (int i = 0; i < str.length(); i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),ints);

    }

    private static TreeNode_1 _createTree(TreeNode_1 root, int data) {
        if (root==null)
            root= new TreeNode_1(data);
        else if (data<root.getData())
            root.setLeft(_createTree(root.getLeft(),data));
        else if (data>root.getData())
            root.setRight(_createTree(root.getRight(),data));
        return root;
    }

    public static int countNodes(TreeNode_1 root) {
        if (root==null)return 0;
        else {
            int count=0;
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
                if (temp!=null){
                    count++;
                    if (temp.left!=null)
                        s.push(temp.left);
                    if (temp.right!=null)
                        s.push(temp.right);
                }
            }
            return count;
        }
    }

    public static void flatten(TreeNode_1 root) {
        if (root==null)return;
        List<Integer>  integers =getElements(root);
        TreeNode_1 list= null;
        for (int i:integers){
            list=_addToList(list,i);
        }
        root.setLeft(null);
        root.setRight(list.right);
    }

    private static TreeNode_1 _addToList(TreeNode_1 root , int i) {
        if (root==null)
            return new TreeNode_1(i);
        else {
            TreeNode_1 p=root,q=null;
            for (p=root;(q=p.getRight())!=null;p=q);
            p.setRight(new TreeNode_1(i));
            return root;
        }
    }

    public static List<Integer> getElements(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Stack<TreeNode_1> s= new Stack<>();
            s.push(root);
            List<Integer> integers= new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
                if (temp!=null){
                    integers.add(temp.getData());
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return integers;
        }
    }
}

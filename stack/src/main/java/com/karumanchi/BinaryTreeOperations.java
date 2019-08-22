package com.karumanchi;

import com.leetcode.DataUtil;
import com.leetcode.TreeNode;

import java.util.*;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class BinaryTreeOperations {
    public static void main(String[] args) {
        TreeNode root = DataUtil.getTree();
        _preOrder(root);
        System.out.println();
        _postOrder(root);
        System.out.println();
        _inOrder(root);
        System.out.println();
        _levelOrder(root);
        System.out.println();

        int[] arr= {1,2,3,4,5,6,7};
        TreeNode t=sortedArrayToBT(arr);
        System.out.println(t);
        System.out.println();

    }

    public static TreeNode sortedArrayToBT(int[] arr){
        return _sortedArrayToTree(arr,0,arr.length-1);
    }

    private static TreeNode _sortedArrayToTree(int[] arr, int low, int high) {
        if (low>high)
            return null;
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(arr[mid]);

        root.setLeft(_sortedArrayToTree(arr,low,mid-1));
        root.setRight(_sortedArrayToTree(arr,mid+1,high));
        return root;
    }

    private static void _levelOrder(TreeNode root) {
        if (root==null)return;
        else {
            Queue<TreeNode> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers= new ArrayList<>();
            List<List<Integer>> list= new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    //System.out.print(temp.getData()+", ");
                    integers.add(temp.getData());
                    if (temp.getLeft()!=null)
                        q.offer(temp.getLeft());
                    if (temp.getRight()!=null)
                        q.offer(temp.getRight());
                }
                else {
                    list.add(new ArrayList<>(integers));
                    integers.clear();;
                    if (!q.isEmpty())
                        q.offer(null);

                }
            }
            System.out.println(list);
        }
    }

    private static void _inOrder(TreeNode root) {
        if (root==null)return;
        else {
            Stack<TreeNode> s= new Stack<>();
            while (!s.isEmpty() ||root!=null ){
                if (root!=null){
                    s.push(root);
                    root=root.getLeft();
                }
                else {
                    TreeNode temp=s.pop();
                    System.out.print(temp.getData()+", ");
                    root=temp.getRight();
                }
            }
        }

    }

    private static void _postOrder(TreeNode root) {
        if (root==null)return;
        else {
            Stack<TreeNode> s= new Stack<>();
            Stack<Integer> out= new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if (temp.getLeft()!=null)
                        s.push(temp.getLeft());
                    if (temp.getRight()!=null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop()+", ");
        }
    }
    private static void _preOrder(TreeNode root) {
        if (root==null)return;
        else {
            Stack<TreeNode> s= new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                TreeNode temp=s.pop();
                if (temp!=null){
                    System.out.print(temp.getData()+", ");
                    if (temp.getRight()!=null)
                        s.push(temp.getRight());
                    if (temp.getLeft()!=null)
                        s.push(temp.getLeft());
                }
            }
        }
    }

}

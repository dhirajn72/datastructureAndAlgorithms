package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class BinarySearchTree {

    public static void main(String[] args) {
        TreeNode_1 root=new TreeNode_1(100);
        insert(root,75);
        insert(root,200);
        insert(root,50);
        insert(root,80);
        insert(root,150);
        insert(root,300);
        insert(root,45);
        insert(root,65);
        insert(root,90);
        DeleteNodeFromBinarySearchTree._levelOrder(root);
        System.out.println(root);
        int[] arr=generateArray(3);
        List<List<Integer>> permutation=_permutation(arr);
        List<TreeNode_1> treeNodes=new ArrayList<>();
        System.out.println("Below are the trees::");
        for (List<Integer> integers:permutation){
            TreeNode_1 root1=insert(null,integers.get(0));
            for (int i=1;i<integers.size();i++){
                insert(root1,integers.get(i));
            }
            treeNodes.add(root1);
        }
        System.out.println(treeNodes);


    }

    private static int[] generateArray(int n) {
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i+1;
        }
        return arr;

    }

    private static List<List<Integer>> _permutation(int[] arr) {
        Set<List<Integer>> integers=new HashSet<>();
        _permutation(arr,0,integers);
        return new ArrayList<>(integers);
    }

    private static void _permutation(int[] arr, int i,  Set<List<Integer>> integers) {
        if (i==arr.length){
            List<Integer> integers1=new ArrayList<>();
            for (int k:arr)integers1.add(k);
            integers.add(new ArrayList<>(integers1));
        }
        else {
            for (int j = i; j < arr.length; j++) {
                swap(arr,i,j);
                _permutation(arr,i+1,integers);
                swap(arr,i,j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static TreeNode_1 insert(TreeNode_1 root, int data){
       return  _insertHelper(root,data);
    }

    private static TreeNode_1 _insertHelper(TreeNode_1 root, int data) {
        if (root==null)
            root=new TreeNode_1(data);
        else {
            if (root.val>data)
                root.left=_insertHelper(root.left,data);
            else if (root.val<data)
                root.right=_insertHelper(root.right,data);
        }
        return root;
    }

}

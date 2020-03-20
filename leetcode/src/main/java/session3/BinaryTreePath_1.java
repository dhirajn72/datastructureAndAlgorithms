package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/02/20
 */
public class BinaryTreePath_1 {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode_1 root) {
        int[] arr=new int[100];
        List<String> result=new ArrayList<>();
        printPaths(arr,root,0,result);
        return result;
    }

    private static void printPaths(int[] arr, TreeNode_1 root, int i, List<String> res) {
        if(root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            printPaths(arr,i,res);
        else {
            printPaths(arr,root.left,i,res);
            printPaths(arr,root.right,i,res);
        }
    }
    private static void printPaths(int[] arr, int i,List<String> res) {
        StringBuilder builder=new StringBuilder();
        for (int j = 0; j < i; j++) {
            builder.append(arr[j]+"->");
        }
        res.add(builder.delete(builder.length()-2,builder.length()).toString());
    }

}

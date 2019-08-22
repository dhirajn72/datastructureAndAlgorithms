package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/07/19
 */
public class BinaryTreePath {
    public static void main(String[] args) {
        //TreeNode root = DataUtil.getTree();
        TreeNode root= null;
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        int[] arr = new int[100];
        _printPath(arr, root, 0, list);
        return list;
    }

    private static void _printPath(int[] arr, TreeNode root, int i,List<String> strings) {
        if (root == null) return;
        arr[i++] = root.getData();
        if (root.right == null && root.left == null) {
            strings.add(_printArray(arr, i));
        } else {
            _printPath(arr, root.left, i,strings);
            _printPath(arr, root.right, i,strings);
        }
    }
    private static String _printArray(int[] arr, int i) {
        String s = "";
        for (int j = 0; j < i; j++)
            s += arr[j] + "->";
        return s.substring(0,s.length()-2);
    }
}

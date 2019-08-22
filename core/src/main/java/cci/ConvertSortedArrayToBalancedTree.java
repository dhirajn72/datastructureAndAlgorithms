package cci;

import com.java.core.BinaryTreeNode;

/**
 * @author Dhiraj
 * @date 10/07/19
 */
public class ConvertSortedArrayToBalancedTree {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr={-10,-3,0,5,9};
        BinaryTreeNode root = _convertTobalancedTree(arr, 0, arr.length - 1);
        System.out.println(root);
        System.out.println();
    }

    private static BinaryTreeNode _convertTobalancedTree(int[] arr, int low, int high) {
        if (low > high)
            return null;
        int mid = (low + high) / 2;
        BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
        root.setLeft(_convertTobalancedTree(arr, low, mid - 1));
        root.setRight(_convertTobalancedTree(arr, mid + 1, high));
        return root;
    }



}

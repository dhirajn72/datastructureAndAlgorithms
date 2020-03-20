package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 24/08/19
 */
public class RootToLeaf {
    public static void main(String[] args) {
        TreeNode_1 root = DataUtil.getTreeData();
        _printPath(root);
    }

    private static void _printPath(TreeNode_1 root) {
        int[] arr = new int[100];
        _print(root, 0, arr);
    }

    private static void _print(TreeNode_1 root, int i, int[] arr) {
        if (root == null) return;
        arr[i++] = root.val;
        if (root.left==null && root.right==null)
            _print(arr,i);
        else {
            _print(root.left,i,arr);
            _print(root.right,i,arr);
        }
    }

    private static void _print(int[] arr, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]);
        }
        System.out.println();
    }
}

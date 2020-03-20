package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class LongestUniValuePath {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(longestUnivaluePath(root));
    }

    public static int longestUnivaluePath(TreeNode_1 root) {
        if (root==null)return 0;
        _printpaths(root);
        return 0;
    }

    private static void _printpaths(TreeNode_1 root) {
        int[] arr=new int[100];
        _printpaths(root,arr,0);
    }

    private static void _printpaths(TreeNode_1 root, int[] arr, int i) {
        if (root==null)return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            _printArray(arr,i);
        else {
            _printpaths(root.left,arr,i);
            _printpaths(root.right,arr,i);
        }
    }

    private static void _printArray(int[] arr, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]+",");
        }
        System.out.println();
    }
}

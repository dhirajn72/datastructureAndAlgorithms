package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 04/01/20
 */
public class SumNumbers {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode_1 root) {
        if (root==null)return 0;
        int[] arr=new int[1000];
        int[] res=new int[1];
        _print(root,arr,0,res);
        return res[0];
    }

    private static void _print(TreeNode_1 root, int[] arr, int i, int[] res) {
        if (root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            res[0]=res[0]+_print(arr,i);
        else {
            _print(root.left,arr,i,res);
            _print(root.right,arr,i,res);
        }
    }

    private static int _print(int[] arr, int i) {
        String s="";
        for (int j = 0; j < i; j++) {
            s+=arr[j];
        }
        return Integer.valueOf(s);
    }
}

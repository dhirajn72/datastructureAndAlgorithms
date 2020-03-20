package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 02/10/19
 */
public class BinaryTreePath {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode_1 root) {
        if (root==null)return new ArrayList<>();
        int[] arr=new int[100];
        List<String> res=new ArrayList<>();
        _print(root,arr,0,res);
        return res;
    }

    private static void _print(TreeNode_1 root, int[] arr, int i, List<String> res) {
        if (root==null)return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            _printArr(arr,i,res);
        else {
            _print(root.left,arr,i,res);
            _print(root.right,arr,i,res);
        }
    }

    private static void _printArr(int[] arr, int i,List<String> res) {
        StringBuilder s=new StringBuilder();
        for (int j = 0; j < i; j++) {
            s.append(arr[j]);
            s.append("->");
        }
        if (s.length()>0)
            s=s.delete(s.length()-2,s.length());
        res.add(s.toString());
    }
}

package session3;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 04/01/20
 */


/**
 *
 *
 * Success
 Details
 Runtime: 4 ms, faster than 13.68% of Java online submissions for Binary Tree Paths.
 Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Binary Tree Paths.
 */
public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode_1 root) {
        if (root==null)return new ArrayList<>();
        int[] arr=new int[1000];
        List<String> res=new ArrayList<>();
        paths(root,arr,0,res);
        System.out.println(res);
        return res;
    }

    private void paths(TreeNode_1 root, int[] arr, int i, List<String> res) {
        if (root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            print(arr,i,res);
        else {
            paths(root.left,arr,i,res);
            paths(root.right,arr,i,res);
        }
    }

    private void print(int[] arr, int i,List<String> res) {
        String path="";
        for (int j = 0; j < i; j++) {
            path+=arr[j]+"->";
        }
        res.add(path.substring(0,path.length()-2));
    }
}

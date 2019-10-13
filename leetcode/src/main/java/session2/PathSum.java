package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        System.out.println(hasPathSum(root,20));
    }


    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)return false;
        int[] arr=new int[100];
        List<List<Integer>> list= new ArrayList<>();
        _getPaths(arr,root,0,list);
        System.out.println(list);
        for (List<Integer> ints:list){
            if(ints.stream().mapToInt(x->x).sum()==sum)
                return true;
        }
        return false;
    }

    private  static void _getPaths(int[] arr, TreeNode root, int i, List<List<Integer>> list) {
        if (root==null)return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null){
            _addResult(arr,i,list);
        }
        else {
            _getPaths(arr,root.left,i,list);
            _getPaths(arr,root.right,i,list);
        }
    }

    private  static void _addResult(int[] arr, int i, List<List<Integer>> list) {
        List<Integer> integers=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            integers.add(arr[j]);
        }
        list.add(integers);
    }
}

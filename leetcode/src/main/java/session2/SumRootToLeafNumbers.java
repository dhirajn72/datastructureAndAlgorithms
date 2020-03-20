package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(sumNumbers(root));

    }


    public static int sumNumbers(TreeNode_1 root) {
        if (root==null)return 0;
        int[] dp=new int[1000];
        int[] res=new int[1];
        _sumRootToLeaf(root,dp,0,res);
        return res[0];
    }

    private static void _sumRootToLeaf(TreeNode_1 root, int[] dp, int i, int[] res) {
        if (root==null)return;
        dp[i++]=root.val;
        if (root.left==null && root.right==null)
            _sum(dp,i,res);
        else {
            _sumRootToLeaf(root.left,dp,i,res);
            _sumRootToLeaf(root.right,dp,i,res);
        }
    }

    private static void _sum(int[] dp, int i,int[] res) {
        String sum="";
        for (int j = 0; j < i; j++)
            sum+=dp[j];
        res[0]=res[0]+Integer.valueOf(sum);
    }
}

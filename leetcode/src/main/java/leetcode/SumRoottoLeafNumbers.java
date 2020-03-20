package leetcode;

/**
 * @author Dhiraj
 * @date 21/08/19
 */
public class SumRoottoLeafNumbers {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        System.out.println(sumNumbers(null));


    }


    public static int sumNumbers(TreeNode_1 root) {
        int[] arr=new int[500];
        int[] dp=new int[1];
        return _printPaths(arr,0,root,dp);
    }

    private static int _printPaths(int[] arr, int i, TreeNode_1 root, int[] dp) {
        if (root==null)return 0;
        arr[i++]=root.val;
        if (root.left==null && root.right==null)
            _printArray(arr,i,dp);
        else {
            _printPaths(arr,i,root.left,dp);
            _printPaths(arr,i,root.right,dp);
        }
        return dp[0];
    }

    private static void _printArray(int[] arr, int i,int[] dp) {
        String sum="";
        for (int j = 0; j < i; j++) {
            sum+=arr[j];
        }
        dp[0]=dp[0]+Integer.valueOf(sum);
    }
}

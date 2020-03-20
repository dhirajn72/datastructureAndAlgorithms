package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 24/09/19
 */
public class RangeSumBST {
    public static void main(String[] args) {
        TreeNode_1 root = DataUtil.getBinarySearchTreeData();
        System.out.println(rangeSumBST(root, 45, 200));
    }

    public static int rangeSumBST(TreeNode_1 root, int L, int R) {
        if (root==null)return 0;
        List<Integer> integers = new ArrayList<>();
        _rangeSum(root, L, R, integers);
        int sum=0;
        for (int i:integers)
            sum+=i;
        return sum;
    }

    private static void _rangeSum(TreeNode_1 root, int L, int R, List<Integer> sumInts) {
        if (root == null) return;
        if (root.val >= L && root.val <= R) {
            sumInts.add(root.val);
        }
        _rangeSum(root.left, L, R, sumInts);
        _rangeSum(root.right, L, R, sumInts);
    }
}

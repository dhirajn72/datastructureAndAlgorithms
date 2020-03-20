package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 22/02/20
 */
public class MinimumDistanceInBST {
    public static void main(String[] args) {
        TreeNode_1 treeNode= DataUtil.getBinarySearchTreeData();
        minDiffInBST(treeNode);

    }

    public static int minDiffInBST(TreeNode_1 root) {
        if (root==null)
            return 0;
        Stack<TreeNode_1> s=new Stack<>();
        List<Integer> integerList=new ArrayList<>();

        while (!s.isEmpty()||root!=null){
            if (root!=null){
                s.push(root);
                root=root.left;
            }
            else {
                TreeNode_1 temp=s.pop();
                integerList.add(temp.val);
                root=temp.right;
            }
        }
        System.out.println(integerList);
        int min=integerList.get(0);
        for (int i=1;i<integerList.size()-1;i++)
            min=Math.min(min,integerList.get(i)-integerList.get(i-1));
        return min;
    }
}

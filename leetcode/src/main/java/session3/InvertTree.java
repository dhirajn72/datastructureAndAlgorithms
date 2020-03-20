package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 04/01/20
 */


/**
 *
 * Success
 Details
 Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 */
public class InvertTree {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        _levelOrder(root);
        invertTree(root);
        _levelOrder(root);


    }

    private static void _levelOrder(TreeNode_1 root) {
        Queue<TreeNode_1> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> list1=new ArrayList<>();
        while (!q.isEmpty()){
            TreeNode_1 temp=q.poll();
            if (temp!=null){
                list.add(temp.val);
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
            else {
                list1.add(new ArrayList<>(list));
                if (!q.isEmpty())
                    q.offer(null);
                list.clear();
            }
        }
        System.out.println(list1);
    }


    /**
     *
     * Success
     Details
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
     Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
     * @param root
     * @return
     */

    public static TreeNode_1 invertTree(TreeNode_1 root) {
        if (root==null)return root;
        invert(root);
        return root;
    }

    private static void invert(TreeNode_1 root) {
        if (root==null)return;
        if (root.left!=null) {
            TreeNode_1 temp=root.left;
            root.left = root.right;
            root.right=temp;
        }
        else if (root.right!=null) {
            TreeNode_1 temp=root.right;
            root.right = root.left;
            root.left=temp;
        }
        invert(root.left);
        invert(root.right);
    }
}

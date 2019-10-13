package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 02/10/19
 */
public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);//DataUtil.getTreeData();
        root.right=new TreeNode(2);
        System.out.println(root);
        _levelOrder(root);
        System.out.println(invertTree(root));
        _levelOrder(root);

    }

    private static void _levelOrder(TreeNode root) {
        if (root==null)return;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    list.add(new ArrayList<>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
            System.out.println(list);
        }
    }


    public static TreeNode invertTree(TreeNode root) {
        return _invert(root);
    }

    private static TreeNode _invert(TreeNode root) {
        if (root==null)return root;
        _invert(root.left);
        _invert(root.right);
        //if (root.left!=null && root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        //}
        return root;
    }
}

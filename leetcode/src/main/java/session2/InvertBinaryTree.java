package session2;

import leetcode.TreeNode_1;

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
        TreeNode_1 root= new TreeNode_1(1);//DataUtil.getTreeData();
        root.right=new TreeNode_1(2);
        System.out.println(root);
        _levelOrder(root);
        System.out.println(invertTree(root));
        _levelOrder(root);

    }

    private static void _levelOrder(TreeNode_1 root) {
        if (root==null)return;
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
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


    public static TreeNode_1 invertTree(TreeNode_1 root) {
        return _invert(root);
    }

    private static TreeNode_1 _invert(TreeNode_1 root) {
        if (root==null)return root;
        _invert(root.left);
        _invert(root.right);
        //if (root.left!=null && root.right!=null){
            TreeNode_1 temp=root.left;
            root.left=root.right;
            root.right=temp;
        //}
        return root;
    }
}

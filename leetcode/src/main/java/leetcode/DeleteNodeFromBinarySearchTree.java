package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class DeleteNodeFromBinarySearchTree {

    public static void main(String[] args) {
        TreeNode treeNode=DataUtil.getBinarySearchTreeData();
        System.out.println(treeNode);
        _levelOrder(treeNode);
        _deleteNodeFromTree(treeNode,75);
        _levelOrder(treeNode);
        System.out.println(treeNode);
    }

    public static void _levelOrder(TreeNode root) {
        if (root==null)return;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<List<Integer>> list= new ArrayList<>();
            List<Integer> integers= new ArrayList<>();
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

    private static TreeNode _deleteNodeFromTree(TreeNode root, int key) {
        if (root==null)
            return null;
        if (root.val<key)
            root.right=_deleteNodeFromTree(root.right,key);
        else if (root.val>key)
            root.left=_deleteNodeFromTree(root.left,key);
        else {
            if (root.left==null)
                return root.right;
            else if(root.right==null)
                return root.right;

            TreeNode min=findMin(root.right);
            root.val=min.val;
            root.right=_deleteNodeFromTree(min.right,min.val);
        }
        return root;
    }

    private static TreeNode findMin(TreeNode root) {
        if (root==null)return null;
        while (root.left!=null)
            root= root.left;
        return root;
    }
}

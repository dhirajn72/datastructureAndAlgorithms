package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 *
 *
 *
 Leetcode:
 Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a BST.
 Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Delete Node in a BST.


 * @author Dhiraj
 * @date 31/08/19
 */
public class DeleteNodeInBST {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getBinarySearchTreeData();
        _levelOrder(root);
        System.out.println(deleteNode(root,150));
        _levelOrder(root);

    }

    private static void _levelOrder(TreeNode_1 root) {
        if (root==null)return;
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> ints=new ArrayList<>();
            List<List<Integer>> result=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
                if (temp!=null){
                    ints.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    result.add(new ArrayList<>(ints));
                    if (!q.isEmpty())
                        q.offer(null);
                    ints.clear();
                }
            }
            System.out.println(result);
        }

    }


    public static TreeNode_1 deleteNode(TreeNode_1 root, int key) {
        if (root==null){
            return root;
        }
        else if (key<root.val)
            root.left=deleteNode(root.left,key);
        else if (key>root.val)
            root.right=deleteNode(root.right,key);
        else {
            if (root.left==null)
                return root.right;
            else if (root.right==null)
                return root.left;

            TreeNode_1 min=findMin(root.right);
            root.val=min.val;
            root.right=deleteNode(root.right,min.val);
        }
        return root;
    }

    private static TreeNode_1 findMin(TreeNode_1 root) {
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
}

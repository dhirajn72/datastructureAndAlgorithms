package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class TreeOperations {
    public static void main(String[] args) {
        TreeNode root = DataUtil.getTreeData();
        _preOrder(root); // 1, 2, 4, 5, 3, 6, 7
        _postOrder(root); // 4, 5, 2, 6, 7, 3,1
        _levelOrder(root); //[[1], [2, 3], [4, 5, 6, 7]]
        _inOrder(root); // 4, 2, 5, 1, 6, 3, 7
    }
    private static void _inOrder(TreeNode root) {
        if (root==null)return;
        else {
            Stack<TreeNode> s= new Stack<>();
            while (!s.isEmpty() || root!=null){
                if (root!=null){
                    s.push(root);
                    root=root.left;
                }
                else {
                    TreeNode temp=s.pop();
                    System.out.print(temp.val+", ");
                    root=temp.right;
                }
            }
            System.out.println();
        }
    }

    private static void _levelOrder(TreeNode root) {
        if (root==null)
            return;
        else {
            Queue<TreeNode> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            ArrayList<Integer> integers=new ArrayList<>();
            List<List<Integer>> list= new ArrayList<>();
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
                    list.add(new ArrayList<Integer>(integers));
                    integers.clear();;
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            System.out.println(list);
        }
    }

    private static void _postOrder(TreeNode root) {
        if (root == null) return;
        else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.val);
                    if (temp.left != null)
                        s.push(temp.left);
                    if (temp.right != null)
                        s.push(temp.right);
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop()+", ");
        }
        System.out.println();
    }

    private static void _preOrder(TreeNode root) {
        if (root == null) return;
        else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp != null) {
                    System.out.print(temp.val + ", ");
                    if (temp.right != null)
                        s.push(temp.right);
                    if (temp.left != null)
                        s.push(temp.left);
                }
            }
        }
        System.out.println();
    }
}

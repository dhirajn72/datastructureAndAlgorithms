package session3;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 27/12/19
 */
public class NumTree {
    public static void main(String[] args) {
        System.out.println(numTrees(5));
        TreeNode root= DataUtil.getTreeData();
        System.out.println(zigzagLevelOrder(root));
        printPaths(root);
    }


    /**
     *
     * Success
     Details
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
     Memory Usage: 33 MB, less than 5.55% of Java online submissions for Unique Binary Search Trees.
     * @param n
     * @return
     */
    public static int numTrees(int n) {
        if (n==0)return 0;
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                arr[i]=arr[i]+arr[j]*arr[i-j-1];
            }
        }
        return arr[n];
    }

    /**
     *
     * Success
     Details
     Runtime: 1 ms, faster than 84.89% of Java online submissions for Binary Tree Level Order Traversal.
     Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
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
            return list;
        }
    }

    /**
     *
     * Success
     Details
     Runtime: 1 ms, faster than 87.40% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
     Memory Usage: 35.9 MB, less than 99.04% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            boolean flag=true;
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
                    if (flag) {
                        list.add(new ArrayList<>(integers));
                        flag=false;
                    }
                    else {
                        List<Integer> integers1=new ArrayList<>();
                        for (int i = integers.size()-1; i >=0 ; i--) {
                            integers1.add(integers.get(i));
                        }
                        list.add(integers1);
                        flag=true;
                    }
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
            return list;
        }
    }

    /**
     *
     *
     * Success
     Details
     Runtime: 1 ms, faster than 11.49% of Java online submissions for Maximum Depth of Binary Tree.
     Memory Usage: 39.4 MB, less than 89.79% of Java online submissions for Maximum Depth of Binary Tree.
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int count=0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                    count++;
                    if (!q.isEmpty())
                        q.offer(null);
                }

            }
            return count;
        }
    }

    /**
     *
     *
     * Success
     Details
     Runtime: 1 ms, faster than 92.41% of Java online submissions for Binary Tree Level Order Traversal II.
     Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers=new ArrayList<>();
            Stack<List<Integer>> s=new Stack<>();
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
                    s.push(new ArrayList<>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();

                }
            }
            List<List<Integer>> list=new ArrayList<>();
            while (!s.isEmpty())
                list.add(s.pop());
            return list;
        }
    }

    /**
     *
     * Success
     Details
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
     Memory Usage: 39.1 MB, less than 98.44% of Java online submissions for Minimum Depth of Binary Tree.

     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int count=0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.left==null && temp.right==null)
                        break;
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                    count++;
                    if (!q.isEmpty())
                        q.offer(null);
                }

            }
            return count;
        }
    }

    public static void printPaths(TreeNode root){
        if (root==null)return;
        int[] arr=new int[100];
        _printPaths(root,arr,0);

    }

    private static void _printPaths(TreeNode root, int[] arr, int i) {
        if (root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null){
            _print(arr,i);
        }
        else {
            _printPaths(root.left,arr,i);
            _printPaths(root.right,arr,i);
        }
    }

    private static void _print(int[] arr, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]+",");
        }
        System.out.println();
    }

    private static void _printPathsSum(TreeNode root, int[] arr, int i,int sum,List<Boolean> booleans) {
        if (root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null){
            _printSum(arr,i,sum,booleans);
        }
        else {
            _printPathsSum(root.left,arr,i,sum,booleans);
            _printPathsSum(root.right,arr,i,sum,booleans);
        }
    }

    private static void _printSum(int[] arr, int i,int sum,List<Boolean> booleans) {
        int total=0;
        for (int j = 0; j < i; j++) {
            total=total+arr[j];
        }
        if (total==sum)
            booleans.add(true);


    }

    /**
     *
     * Success
     Details
     Runtime: 1 ms, faster than 12.65% of Java online submissions for Path Sum.
     Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Path Sum.
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)return false;
        int[] arr=new int[100];
        List<Boolean> booleans=new ArrayList<>();
        _printPathsSum(root,arr,0,sum,booleans);
        if (!booleans.isEmpty())
            return true;
        return false;
    }


    /**
     *
     * Success
     Details
     Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.
     Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Path Sum II.
     *
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null)return new ArrayList<>();
        int[] arr=new int[100];
        List<List<Integer>> list=new ArrayList<>();
        _getPathsSum(root,arr,0,sum,list);
        return list;
    }

    private static void _getPathsSum(TreeNode root, int[] arr, int i,int sum,List<List<Integer>> list) {
        if (root==null)
            return;
        arr[i++]=root.val;
        if (root.left==null && root.right==null){
            _getSum(arr,i,sum,list);
        }
        else {
            _getPathsSum(root.left,arr,i,sum,list);
            _getPathsSum(root.right,arr,i,sum,list);
        }
    }

    private static void _getSum(int[] arr, int i,int sum,List<List<Integer>> lists) {
        int total=0;
        List<Integer> list=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            total=total+arr[j];
            list.add(arr[j]);
        }
        if (total==sum){
            lists.add(list);
        }
    }
}

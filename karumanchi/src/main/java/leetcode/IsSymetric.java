package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 12/07/19
 */
public class IsSymetric {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);
        p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(4);
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(3);
        System.out.println(p);
        //System.out.println(isSymmetric(p));

        /**
         *
         * Uncomment to test diameter and height
         */
        /*TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);
        p.left.left = new TreeNode(3);
        p.left.left.left = new TreeNode(6);
        p.left.left.left.left = new TreeNode(9);
        p.left.left.left.left.left = new TreeNode(10);

        p.left.right = new TreeNode(5);
        p.left.right.left = new TreeNode(8);
        p.left.right.left.left = new TreeNode(9);
        p.left.right.left.left.left = new TreeNode(10);*/

        System.out.println(isSymmetric(new TreeNode(1)));
        System.out.println(isSymmetric(null));
        System.out.println(levelOrder(null));
        System.out.println(maxDepth(p));
        System.out.println(_diameter(p));
    }

    private static int _diameter(TreeNode root) {
        if (root==null)
            return 0;
        int height= height(root.left)+height(root.right)+1;
        int lDiameter=_diameter(root.left);
        int rDiameter=_diameter(root.right);
        return Math.max(height,Math.max(lDiameter,rDiameter));
    }

    private static int height(TreeNode root) {
        if (root==null)
            return 0;
        else return Math.max(height(root.left),height(root.right))+1;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        if (root.left != null && root.right != null)
            return _areMirror(root.left, root.right);
        return false;
    }

    private static boolean _areMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return _areMirror(root1.left, root2.right) && _areMirror(root1.right, root2.left);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers = new ArrayList<>();
            List<List<Integer>> list = new ArrayList<>();
            int levelCount = 0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    integers.add(temp.val);
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                    //list.add(new ArrayList<>(integers));
                    //integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                    levelCount++;
                }
            }
            System.out.println(levelCount);
            return levelCount;
        }
    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers = new ArrayList<>();
            List<List<Integer>> list = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    integers.add(temp.val);
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                } else {
                    list.add(new ArrayList<>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            System.out.println(list);
            return list;
        }
    }
}

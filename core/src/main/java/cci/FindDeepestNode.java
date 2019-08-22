package cci;

import com.java.core.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 10/07/19
 */
public class FindDeepestNode {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(0);
        root = _insert(root, 1);
        root = _insert(root, 2);
        root = _insert(root, 3);
        root = _insert(root, 4);
        root = _insert(root, 5);
        root = _insert(root, 6);
        root.getRight().getRight().setRight(new BinaryTreeNode(7));
        //root.getRight().getRight().getRight().setRight(new BinaryTreeNode(7));


         /*_insertRecursive(root,1);
         _insertRecursive(root,2);
        _insertRecursive(root,3);*/
        /*root= _insertRecursive(root,4);
        root= _insertRecursive(root,5);
        root= _insertRecursive(root,6);*/
        System.out.println(root);
        System.out.println(_deepestNode(root));
        System.out.println(_levelOrderTraversal(root));
        _levelOrderTraversal(root)
                .stream()
                .forEach(l-> { l.stream().forEach(e -> { System.out.print(e); });
                System.out.println();});
        System.out.println("******");
        for (List<Integer> l:_levelOrderTraversal(root))
            System.out.println(l);

        System.out.println("*******");
        System.out.println(_isBalanced(root));
        System.out.println();


    }

    private static boolean _isBalanced(BinaryTreeNode root) {
        return getHeight(root)!=Integer.MIN_VALUE;

    }

    private static int getHeight(BinaryTreeNode root) {

        if (root==null) return -1;
        int leftHeight=getHeight(root.getLeft());
        if (leftHeight==Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int rightHight= getHeight(root.getRight());
        if (rightHight==Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int height=leftHeight-rightHight;
        if (Math.abs(height)>1)
            return Integer.MIN_VALUE;
        return
                Math.max(leftHeight,rightHight)+1;
    }

    private static List<List<Integer>> _levelOrderTraversal(BinaryTreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        ArrayList<Integer> integers= new ArrayList<>();
        if (root == null)
            return null;
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();

            q.offer(root);
            q.offer(null);
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    integers.add(temp.getData());
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                }
                else {
                    list.add(new ArrayList<>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
        }
        return list;
    }

    private static BinaryTreeNode _deepestNode(BinaryTreeNode root) {
        if (root == null) return root;
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            BinaryTreeNode temp = null;
            while (!q.isEmpty()) {
                temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                }
            }
            return temp;
        }
    }

    private static BinaryTreeNode _insert(BinaryTreeNode root, int data) {
        if (root == null) root = new BinaryTreeNode(data);
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    else {
                        temp.setLeft(new BinaryTreeNode(data));
                        break;
                    }
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                    else {
                        temp.setRight(new BinaryTreeNode(data));
                        break;
                    }
                }
            }
        }
        return root;
    }


}
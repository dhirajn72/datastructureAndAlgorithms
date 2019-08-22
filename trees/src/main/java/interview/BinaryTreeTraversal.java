package interview;

import com.java.ds.client.DataUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 17/06/19
 */
public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = DataUtils.getBinaryTree();
        System.out.println();
        System.out.println("Preorder::");
        preOrder(root);
        System.out.println();
        System.out.println("Postorder::");
        postOrder(root);
        System.out.println();
        System.out.println("Inorder::");
        inOrder(root);
        System.out.println();
        System.out.println("LevelOrder::");
        levelOrder(root);

        /*      12
              /    \
            23      56
          /   \     / \
        22     65  88  99
       /
      45

      */

        //preorder: 12,23,22,45,65,56,88,99
        //postorder: 45,22,65,23,88,99,56,12
        //inorder: 45,22,23,65,12,88,56,99
        //levelorder: [[12],[23,56],[22,65,88,99],[45]]

        System.out.println("LevelOrder::>>");
        //levelOrderTraversal(root);
        printZigZagTraversal(DataUtils.getBinaryOrderedTree());


    }

    private static void levelOrder(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                //System.out.print(temp.getData()+",");
                integers.add(temp.getData());
                if (temp.getLeft() != null)
                    q.offer(temp.getLeft());
                if (temp.getRight() != null)
                    q.offer(temp.getRight());
            } else {
                arrayLists.add(new ArrayList<Integer>(integers));
                integers.clear();
                if (!q.isEmpty()) q.add(null);
            }
        }
        System.out.println(arrayLists);

    }

    public static void preOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            if (temp != null) {
                System.out.print(temp.getData() + ",");
                if (temp.getRight() != null)
                    s.push(temp.getRight());
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
            }
        }
    }

    public static void postOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack<>();
        Stack<Integer> out = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            if (temp != null) {
                out.push(temp.getData());
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
                if (temp.getRight() != null)
                    s.push(temp.getRight());
            }
        }

        while (!out.isEmpty()) {
            System.out.print(out.pop() + ",");
        }

    }

    public static void inOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack<>();
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.getLeft();
            } else {
                BinaryTreeNode temp = s.pop();
                System.out.print(temp.getData() + ",");
                root = temp.getRight();
            }
        }
    }

    public static void levelOrderTraversal(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        boolean flag=true;

        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                //System.out.print(temp.getData()+",");
                integers.add(temp.getData());
                if (temp.getLeft() != null)
                    q.offer(temp.getLeft());
                if (temp.getRight() != null)
                    q.offer(temp.getRight());
            } else {
                arrayLists.add(new ArrayList<Integer>(integers));
                integers.clear();
                if (!q.isEmpty())
                    q.offer(null);

            }
        }
        System.out.println(arrayLists);

    }


    public static void printZigZagTraversal(BinaryTreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        Stack<BinaryTreeNode> currentLevel = new Stack<>();
        Stack<BinaryTreeNode> nextLevel = new Stack<>();

        currentLevel.push(rootNode);
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            BinaryTreeNode node = currentLevel.pop();
            System.out.print(node.data + ":");
            if (leftToRight) {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            } else {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<BinaryTreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }


}




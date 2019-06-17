package interview;

import com.java.ds.client.DataUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class BinaryTreeTraversals {
    public static void main(String[] args) {
        BinaryTreeNode root = DataUtils.getBinaryTree();
        System.out.println(root);

        /*      12
              /    \
            23      56
          /   \     / \
        22     65  88  99
       /
      45

      */

        System.out.println("Preorder:");
        preOrder(root);
        System.out.println();
        preOrderIterative(root);
        System.out.println();
        System.out.println("****");
        System.out.println("Inorder:");
        inOrder(root);
        System.out.println();
        System.out.println("####");
        inOrderWithoutRecursion(root);
        System.out.println("****");
        System.out.println();
        System.out.println("Postorder:");
        postOrder(root);
        System.out.println();
        postorderIterative(root);
        System.out.println();
        System.out.println();
        System.out.println("******");
        System.out.println();
        System.out.println("LevelOrder:");
        levelOrderIterative(root);
        levelOrderIterative(DataUtils.getLeftSkeewedBinaryOrderedTree());


    }

    private static void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.getData() + ",");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    private static void inOrder(BinaryTreeNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + ",");
            inOrder(root.getRight());
        }
    }

    private static void postOrder(BinaryTreeNode root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + ",");
        }
    }

    private static void levelOrderIterative(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                arrayList.add(temp.getData());
                if (temp.getLeft() != null)
                    q.offer(temp.getLeft());
                if (temp.getRight() != null)
                    q.offer(temp.getRight());
            } else {
                arrayLists.add(new ArrayList<>(arrayList));
                arrayList.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        System.out.println(arrayLists);
    }

    private static void preOrderIterative(BinaryTreeNode root) {
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

    public static void inOrderWithoutRecursion(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack<>();
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                BinaryTreeNode node = s.pop();
                System.out.print(node.data + ",");
                root = node.right;
            }

        }
    }

    public static void postorderIterative(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack();
        s.push(root);
        Stack<Integer> out = new Stack();
        while (!s.empty()) {
            BinaryTreeNode curr = s.pop();
            out.push(curr.data);
            if (curr.left != null) {
                s.push(curr.left);
            }
            if (curr.right != null) {
                s.push(curr.right);
            }
        }
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }
}

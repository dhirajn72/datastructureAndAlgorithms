package interview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 24/06/19
 */
public class BinaryTree {
    public static void _insert(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null) {
                        q.offer(temp.getLeft());
                    } else {
                        temp.setLeft(new BinaryTreeNode(data));
                        break;
                    }
                    if (temp.getRight() != null) {
                        q.offer(temp.getRight());
                    } else {
                        temp.setRight(new BinaryTreeNode(data));
                        break;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        _insert(root, 2);
        _insert(root, 3);
        _insert(root, 4);
        _insert(root, 5);
        _insert(root, 6);
        _insert(root, 7);
        System.out.println(root);


    }
}

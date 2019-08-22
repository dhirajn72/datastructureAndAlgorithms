package cci;

import com.java.core.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/06/19
 */
public class BinaryTreeOperations {
    public static void insert(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
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
    }


    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);
        insert(root, 6);
        insert(root, 7);
        System.out.println(root);
        _preOrder(root);
        _inOrder(root);
        _postOrder(root);
    }

    private static void _postOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s =  new Stack<>();
        s.push(root);
        Stack<Integer> out= new Stack<>();
        while (!s.isEmpty()){
            BinaryTreeNode temp=s.pop();
            //out.push(temp.getData());
            System.out.print(temp.getData()+", ");
            if (temp!=null){
                if (temp.getLeft()!=null)
                    s.push(temp.getLeft());
                if (temp.getRight()!=null)
                    s.push(temp.getRight());
            }
        }
        while (!out.isEmpty())
            System.out.print(out.pop()+",");
        System.out.println();
    }

    private static void _inOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s= new Stack<>();
        while (!s.isEmpty() || root!=null){
            if (root!=null){
                s.push(root);
                root=root.getLeft();
            }
            else {
                BinaryTreeNode temp=s.pop();
                System.out.print(temp.getData()+",");
                root=temp.getRight();
            }
        }
        System.out.println();
    }

    private static void _preOrder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            if (temp != null) {
                System.out.print(temp.getData() + ", ");
                if (temp.getRight() != null)
                    s.push(temp.getRight());
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
            }
        }
        System.out.println();
    }
}

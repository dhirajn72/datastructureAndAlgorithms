package com.java.ds.tree.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 10/06/19
 */
public class LevelOrderInsertionBinaryTree {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(7);
        /*insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);
        insert(root, 6);
        insert(root, 7);*/
        /*insert(root, 6);
        insert(root, 5);
        insert(root, 4);
        insert(root, 3);
        insert(root, 2);
        insert(root, 1);*/

        /*insert(root, 4);
        insert(root, 6);
        insert(root, 8);
        insert(root, 3);
        insert(root, 1);
        insert(root, 2);*/

        insertAnotherWay(root, 4);
        insertAnotherWay(root, 6);
        insertAnotherWay(root, 8);
        insertAnotherWay(root, 3);
        insertAnotherWay(root, 1);
        insertAnotherWay(root, 2);
        insertAnotherWay(root, 100);

        System.out.println(root);
        //delete(root, 6);
        System.out.println();
        System.out.println(findDeepestNode(root));

    }

    private static BinaryTree delete(BinaryTree root, int data) {
        if (root == null) {
            System.out.println("No elements to delete !");
        } else if (data < root.getData()) {
            root.setLeft(delete(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(delete(root.getRight(), data));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            BinaryTree min = findMin(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(), min.getData()));
        }
        return root;

    }

    public static BinaryTree findDeepestNode(BinaryTree root){
        if (root==null)
            return null;
        Queue<BinaryTree> q= new LinkedList<>();
        q.offer(root);
        BinaryTree temp=null;
        while (!q.isEmpty()){
            temp=q.poll();
            if (temp.getLeft()!=null)
                q.offer(temp.getLeft());
            if (temp.getRight()!=null)
                q.offer(temp.getRight());
        }
        return temp;
    }

    private static BinaryTree findMin(BinaryTree node) {
        BinaryTree temp = node;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp;
    }

    private static void insert(BinaryTree root, int data) {
        if (root == null) {
            root = new BinaryTree(data);
        } else {
            Queue<BinaryTree> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                BinaryTree node = q.poll();
                if (node.getLeft() != null && node.getRight() != null) {
                    q.add(node.getLeft());
                    q.add(node.getRight());
                } else {
                    if (node.getLeft() == null) {
                        node.setLeft(new BinaryTree(data));
                    } else {
                        node.setRight(new BinaryTree(data));
                    }
                    break;
                }

            }
        }
    }

    private static void insertAnotherWay(BinaryTree root, int data) {
        if (root==null){
            root=new BinaryTree(data);
            return;
        }
        Queue<BinaryTree>  q= new LinkedList<>();
        q.offer(root);
        BinaryTree temp=null;
        while (!q.isEmpty()){
            temp=q.poll();
            if (temp.getLeft()!=null)
                q.offer(temp.getLeft());
            else {
                temp.setLeft(new BinaryTree(data));
                return;
            }
            if (temp.getRight()!=null)
                q.offer(temp.getRight());
            else {
                temp.setRight(new BinaryTree(data));
                return;
            }
        }
    }
}


class BinaryTree {
    private int data;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
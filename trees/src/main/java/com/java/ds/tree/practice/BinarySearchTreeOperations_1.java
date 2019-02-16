package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 16/02/19
 */
public class BinarySearchTreeOperations_1 {

    public static BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
        if (root == null) {
            root = new BinarySearchTreeNode(data);
        } else {
            if (data < root.getData()) {
                root.setLeft(insert(root.getLeft(), data));
            } else if (data > root.getData()) {
                root.setRight(insert(root.getRight(), data));
            }
        }
        return root;
    }

    public static BinarySearchTreeNode delete(BinarySearchTreeNode root,int data){
        if (root==null)
            System.out.println("No elements to delete");

        else if (data<root.getData()){
            root.setLeft(delete(root.getLeft(),data));
        }
        else if (data>root.getData()){
            root.setRight(delete(root.getRight(),data));
        }
        else {
            if (root.getLeft()==null)
                return root.getRight();
            else if (root.getRight()==null)
                return root.getLeft();

            BinarySearchTreeNode min=findMin(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(),min.getData()));
        }
        return root;
    }

    private static BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root==null)return null;
        while (root.getLeft()!=null)
            root=root.getLeft();
        return root;
    }


    public static void main(String[] args) {
        BinarySearchTreeNode root = new BinarySearchTreeNode(40);
        insert(root, 20);
        insert(root, 44);
        insert(root,10);
        insert(root,22);
        insert(root,41);
        insert(root,45);
        insert(root,23);
        insert(root,21);

        /*
                        40
                     /     \
                   20       44
                  /  \     /  \
                10    22  41  45
                     /  \
                    21  23

         */

        System.out.println(root);
        delete(root,20);
        System.out.println(root);
    }


}

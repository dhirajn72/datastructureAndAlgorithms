package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 29/01/19
 */
public class BinarySearchTreeOperations {

    public BinarySearchTreeNode insert(BinarySearchTreeNode root,int data){
        if (root==null){
            root=new BinarySearchTreeNode(data);
        }
        else {
            if (data<root.getData())
                root.setLeft(insert(root.getLeft(),data));
            else if (data>root.getData())
                root.setRight(insert(root.getRight(),data));
        }
        return root;
    }

    public BinarySearchTreeNode delete(BinarySearchTreeNode root,int data){

        if (root==null){
            System.out.println("No Elements are available in tree");
        }
        else if (data<root.getData()){
            root.setLeft(delete(root.getLeft(),data));
        }
        else if (data>root.getData()){
            root.setRight(delete(root.getRight(),data));
        }
        else{
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

    private BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root==null)return null;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }


    public static void main(String[] args) {
        BinarySearchTreeNode root= new BinarySearchTreeNode(50);
        BinarySearchTreeOperations treeOperations= new BinarySearchTreeOperations();
        treeOperations.insert(root,60);
        treeOperations.insert(root,45);
        treeOperations.insert(root,70);
        treeOperations.insert(root,68);
        treeOperations.insert(root,59);
        treeOperations.insert(root,47);
        treeOperations.insert(root,41);

        System.out.println(root);
        treeOperations.delete(root,45);
        System.out.println(root);
        /*
                          50
                       /      \
                    45          60
                  /   \         /   \
                41      47      59     70
                                     /
                                   68
         */






    }
}

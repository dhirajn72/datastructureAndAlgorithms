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

    public static BinarySearchTreeNode delete(BinarySearchTreeNode root,int data){

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

    private static BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root==null)return null;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }


    public static void main(String[] args) {
        //BinarySearchTreeNode root= new BinarySearchTreeNode(50);
        BinarySearchTreeOperations treeOperations= new BinarySearchTreeOperations();
        /*treeOperations.insert(root,60);
        treeOperations.insert(root,45);
        treeOperations.insert(root,70);
        treeOperations.insert(root,68);
        treeOperations.insert(root,59);
        treeOperations.insert(root,47);
        treeOperations.insert(root,41);*/

        BinarySearchTreeNode root= /*new TreeNode_1(10);*/new BinarySearchTreeNode(100);
        root.left=/*new TreeNode_1(5);*/new BinarySearchTreeNode(75);
        root.right=/*new TreeNode_1(15);*/new BinarySearchTreeNode(200);
        root.right.left=/*new TreeNode_1(6);*/new BinarySearchTreeNode(150);
        root.right.right=/*new TreeNode_1(20);*/new BinarySearchTreeNode(300);
        root.left.left=new BinarySearchTreeNode(50);
        root.left.right=new BinarySearchTreeNode(80);
        root.left.right.right=new BinarySearchTreeNode(90);
        root.left.left.left=new BinarySearchTreeNode(45);
        root.left.left.right=new BinarySearchTreeNode(65);

        System.out.println(root);
        LevelOrderIterative.levelOrderIterative(root);
        delete(root,150);
        LevelOrderIterative.levelOrderIterative(root);
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

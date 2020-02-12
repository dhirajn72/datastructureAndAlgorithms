package leetcode;

import session2.PopulateNextRightPointerInEachNode;

import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class DataUtil {
    public static TreeNode getTreeData(){
        /*
                 1
               /  \
             2     3
            / \   / \
           4  5  6   7


         */

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }
    public static TreeNode getUnbalancedTreeData(){
        /*
                 1
               /  \
             2     3
            / \   / \
           4  5  6   7


         */

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(7);
        root.right.right.right.right=new TreeNode(7);

        return root;
    }
    public static TreeNode getTreeDataPreOrdered(){
        /*
                 1
               /  \
             2     5
            / \   / \
           3  4  6   7


         */

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }


    public static TreeNode getBinarySearchTreeData(){
        /*
                        100
                 75                 200
             50     80         150       300
         45    65        90
         */
        TreeNode root= /*new TreeNode(10);*/new TreeNode(100);
        root.left=/*new TreeNode(5);*/new TreeNode(75);
        root.right=/*new TreeNode(15);*/new TreeNode(200);
        root.right.left=/*new TreeNode(6);*/new TreeNode(150);
        root.right.right=/*new TreeNode(20);*/new TreeNode(300);
        root.left.left=new TreeNode(50);
        root.left.right=new TreeNode(80);
        root.left.right.right=new TreeNode(90);
        root.left.left.left=new TreeNode(45);
        root.left.left.right=new TreeNode(65);
        return root;

        //[10,5,15,null,null,6,20]
    }

    public static ListNode getListData() {
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        //node.next.next.next.next=new ListNode(5);
        //node.next.next.next.next.next=new ListNode(6);
        //node.next.next.next.next.next.next=new ListNode(7);
        //node.next.next.next.next.next.next.next=new ListNode(8);
        return node;
    }

    public static ListNode getDuplicatesListData() {
        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(4);
        node.next.next.next.next.next=new ListNode(6);
        node.next.next.next.next.next.next=new ListNode(7);
        node.next.next.next.next.next.next.next=new ListNode(7);
        node.next.next.next.next.next.next.next.next=new ListNode(7);
        node.next.next.next.next.next.next.next.next.next=new ListNode(8);
        return node;
    }
    public static ListNode getDuplicatesList() {
        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
        node.next.next=new ListNode(1);
        node.next.next.next=new ListNode(2);
        node.next.next.next.next=new ListNode(3);
        return node;
    }
    public static ListNode getListDataShuffled() {
        ListNode node=new ListNode(1);
        node.next=new ListNode(9);
        node.next.next=new ListNode(4);
        node.next.next.next=new ListNode(6);
        node.next.next.next.next=new ListNode(8);
        node.next.next.next.next.next=new ListNode(2);
        node.next.next.next.next.next.next=new ListNode(7);
        return node;
    }

    public static PopulateNextRightPointerInEachNode.Node getNode() {
        PopulateNextRightPointerInEachNode.Node root=new PopulateNextRightPointerInEachNode.Node(1,null,null,null);
        root.left=_setData(2);
        root.right=_setData(3);
        root.left.left=_setData(4);
        root.left.right=_setData(5);
        root.right.left=_setData(6);
        root.right.right=_setData(7);
        return root;
    }

    private static PopulateNextRightPointerInEachNode.Node _setData(int data) {
        return new PopulateNextRightPointerInEachNode.Node(data,null,null,null);
    }
}

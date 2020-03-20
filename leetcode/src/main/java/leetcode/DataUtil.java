package leetcode;

import session2.PopulateNextRightPointerInEachNode;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class DataUtil {
    public static TreeNode_1 getTreeData(){
        /*
                 1
               /  \
             2     3
            / \   / \
           4  5  6   7


         */

        TreeNode_1 root=new TreeNode_1(1);
        root.left=new TreeNode_1(2);
        root.right=new TreeNode_1(3);
        root.left.left=new TreeNode_1(4);
        root.left.right=new TreeNode_1(5);
        root.right.left=new TreeNode_1(6);
        root.right.right=new TreeNode_1(7);
        return root;
    }
    public static TreeNode_1 getUnbalancedTreeData(){
        /*
                 1
               /  \
             2     3
            / \   / \
           4  5  6   7
                      \
                       7
                        \
                         7


         */

        TreeNode_1 root=new TreeNode_1(1);
        root.left=new TreeNode_1(2);
        root.right=new TreeNode_1(3);
        root.left.left=new TreeNode_1(4);
        root.left.right=new TreeNode_1(5);
        root.right.left=new TreeNode_1(6);
        root.right.right=new TreeNode_1(7);
        root.right.right.right=new TreeNode_1(7);
        root.right.right.right.right=new TreeNode_1(7);

        return root;
    }
    public static TreeNode_1 getTreeDataPreOrdered(){
        /*
                 1
               /  \
             2     5
            / \   / \
           3  4  6   7


         */

        TreeNode_1 root=new TreeNode_1(1);
        root.left=new TreeNode_1(2);
        root.right=new TreeNode_1(5);
        root.left.left=new TreeNode_1(3);
        root.left.right=new TreeNode_1(4);
        root.right.left=new TreeNode_1(6);
        root.right.right=new TreeNode_1(7);
        return root;
    }


    public static TreeNode_1 getBinarySearchTreeData(){
        /*
                        100
                 75                 200
             50     80         150       300
         45    65        90
         */
        TreeNode_1 root= /*new TreeNode_1(10);*/new TreeNode_1(100);
        root.left=/*new TreeNode_1(5);*/new TreeNode_1(75);
        root.right=/*new TreeNode_1(15);*/new TreeNode_1(200);
        root.right.left=/*new TreeNode_1(6);*/new TreeNode_1(150);
        root.right.right=/*new TreeNode_1(20);*/new TreeNode_1(300);
        root.left.left=new TreeNode_1(50);
        root.left.right=new TreeNode_1(80);
        root.left.right.right=new TreeNode_1(90);
        root.left.left.left=new TreeNode_1(45);
        root.left.left.right=new TreeNode_1(65);
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

package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 08/09/19
 */
public class DeleteNodeInLinkedList {

    /*

    Success
Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
     */
    public static void deleteNode(ListNode node) {
        if (node==null)return;
        ListNode prev=null;
        while (node.next!=null){
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;

    }
}

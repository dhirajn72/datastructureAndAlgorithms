package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head==null)return null;
        ListNode currentNode=head;
        ListNode prev=null;
        while (currentNode!=null){
            ListNode node=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=node;
        }
        return prev;
    }
}

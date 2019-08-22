package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 30/06/19
 */
public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        //ListNode list= DataUtils.getList();
        //System.out.println(list);
        // System.out.println(removeNthFromEnd(list,1));
        ListNode list = new ListNode(1);
        list.setNext(new ListNode(2));
        list.getNext().setNext(new ListNode(3));
        System.out.println(removeNthFromEnd(list, 3));


    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n > size || n < 0 || size == 1) return null;
        size -= n;
        if (size == 0) {
            head=head.next;
            return head;

        } else {
            temp = head;
            ListNode prev = null;
            while (temp != null && size-- > 0) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.next=prev.next.next;
            return head;
        }
    }
}

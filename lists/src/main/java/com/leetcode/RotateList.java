package com.leetcode;

import com.java.linkedlist.ListNode;

import java.time.Instant;

/**
 * @author Dhiraj
 * @date 01/07/19
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        /*list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));*/

        System.out.println(list1);
        System.out.println(Instant.now());
        System.out.println(_rotateRight(list1, 500000000));
        System.out.println(Instant.now());
        System.out.println(2000%3);
    }

    public static ListNode _rotateRight(ListNode head, int k) {
        if (null==head )return head;
        if (head.next==null)return head;
        ListNode temp = head;
        int size=0;
        while (temp!=null){
            temp= temp.getNext();
            size++;
        }
        temp=head;
        int iterations= k > size ? k%size:k;
        while (iterations>0) {
            ListNode prev = null;
            ListNode secondLast = null;
            while (temp != null) {
                secondLast = prev;
                prev = temp;
                temp = temp.getNext();
            }
            secondLast.setNext(null);
            prev.setNext(head);
            head = prev;
            temp=head;
            iterations--;
        }
        return head;
    }
}

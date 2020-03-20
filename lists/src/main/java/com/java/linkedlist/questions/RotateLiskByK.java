package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class RotateLiskByK {
    public static void main(String[] args) {

        //ListNode list = DataUtils.getList(new ListNode(3));
        ListNode list= new ListNode(1);
        list.setNext(new ListNode(2));
        list.getNext().setNext(new ListNode(3));
        list.getNext().getNext().setNext(new ListNode(4));
        list.getNext().getNext().getNext().setNext(new ListNode(5));


        System.out.println(list);

        System.out.println(rotateList(list,3));


    }

    private static ListNode rotateList(ListNode head, int n) {
        if (head == null || head.getNext() == null)
            return head;

        ListNode rotateStart = head;
        ListNode rotateEnd = head;

        while (n-- > 0) {
            rotateEnd = rotateEnd.getNext();
            if (rotateEnd == null)
                rotateEnd = head;
        }
        if (rotateStart == rotateEnd)
            return head;

        while (rotateEnd.getNext() != null) {
            rotateStart = rotateStart.getNext();
            rotateEnd = rotateEnd.getNext();
        }

        ListNode temp = rotateStart.getNext();
        rotateEnd.setNext(head);
        rotateStart.setNext(null);
        return temp;

    }
}

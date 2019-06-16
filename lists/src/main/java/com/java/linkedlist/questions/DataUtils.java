package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class DataUtils {
    public static ListNode getList(ListNode meetingPoint) {

        ListNode list1=  new ListNode(1);
        list1.setNext(new ListNode(2));

        list1.getNext().setNext(meetingPoint);
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        return list1;
    }
}

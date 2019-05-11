package com.java.algorithms;

import com.java.utils.DataUtils;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = DataUtils.getList();
        System.out.println(list);
        System.out.println(reverseListIterative(list.getRoot()));
    }

    public static LinkedList reverseListIterative(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        LinkedList list = new LinkedList();
        list.setRoot(prev);
        return list;
    }
}
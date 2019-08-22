package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 04/07/19
 */
public class DeleteNodeInList {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9) );
        System.out.println(list1);
        System.out.println();

    }

    public static void deleteNode(ListNode node) {
        ListNode temp=node;
        temp.data=temp.getNext().getData();
        temp.next=temp.next.next;

    }
}

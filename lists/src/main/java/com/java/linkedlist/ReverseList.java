package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 10/06/19
 */
public class ReverseList {
    public static void main(String[] args) {
    ListNode listNode= new ListNode(1);
        listNode.setNext(new ListNode(2));
        listNode.getNext().setNext(new ListNode(3));
        listNode.getNext().getNext().setNext(new ListNode(4));
        listNode.getNext().getNext().getNext().setNext(new ListNode(5));
        System.out.println(listNode);
        System.out.println();
        listNode=reverseList(listNode);
        System.out.println(listNode);
        System.out.println();


    }

    private static ListNode reverseList(ListNode root) {
        ListNode current = root;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }
}

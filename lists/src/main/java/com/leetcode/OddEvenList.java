package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 04/07/19
 */
public class OddEvenList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        /*list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9) );*/
        System.out.println(list1);
        System.out.println(oddEvenList(list1));
    }


    public static ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        if (size == 3)
            return _addAndreturn(head);
        temp = head;
        ListNode[] oddListArr = new ListNode[(size / 2) + 1];
        ListNode[] evenListArr = new ListNode[(size / 2) + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        ListNode prev = null;
        while (temp != null && temp.getNext() != null) {
            oddListArr[oddIndex++] = temp;
            prev = temp;
            temp = temp.getNext();
            prev.setNext(null);
            evenListArr[evenIndex++] = temp;
            prev = temp;
            temp = temp.getNext();
            prev.setNext(null);
        }
        oddListArr[oddIndex++] = temp;
        ListNode list = null;
        for (ListNode i : oddListArr)
            list = _addToList(list, i);
        for (ListNode i : evenListArr)
            list = _addToList(list, i);
        return list;
    }

    private static ListNode _addAndreturn(ListNode head) {
        ListNode temp = head;
        ListNode next = head.getNext();
        temp.setNext(temp.getNext().getNext());
        next.setNext(null);
        temp.getNext().setNext(next);
        return temp;
    }

    private static ListNode _addToList(ListNode head, ListNode node) {
        if (head == null)
            head = node;
        else {
            ListNode temp = head;
            ListNode prev = null;
            while (temp != null) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(node);
        }
        return head;
    }
}



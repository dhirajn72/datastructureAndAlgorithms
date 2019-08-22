package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class DeterminePalindrom {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(2));
        list1.getNext().getNext().setNext(new ListNode(1));
        System.out.println(isPalindrome(list1));


    }

    public static boolean isPalindrome(ListNode head) {
        if (head==null)return false;
        ListNode temp=head;
        StringBuilder builder= new StringBuilder();
        while (temp!=null){
            builder.append(temp.getData());
            temp=temp.getNext();
        }
        temp=_reverseList(head);
        StringBuilder builder1= new StringBuilder();
        while (temp!=null){
            builder1.append(temp.getData());
            temp=temp.getNext();
        }
        return builder.toString().equals(builder1.toString());
    }

    private static ListNode _reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode node= current.getNext();
            current.setNext(prev);
            prev=current;
            current=node;
        }
        return prev;
    }
}
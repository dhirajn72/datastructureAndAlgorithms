package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 02/07/19
 */
public class ReverseListMtoN {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9));
        System.out.println(list1);
        System.out.println(reverseBetween(list1, 3, 6));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m > n || m < 0) return head;
        if (m==1) return _reverseHead(head,n);
        ListNode temp = head;
        int count = 1;
        ListNode prev = null;
        m=m-1;
        n=n-1;
        boolean flag = false;
        while (temp != null) {
            prev = temp;
            temp = temp.getNext();
            if (count == m) {
                prev.setNext(null);
                ListNode temp2 = temp;
                ListNode prev2 = null;
                while (temp != null) {
                    prev2 = temp;
                    temp = temp.getNext();
                    if (count == n) {
                        prev2.setNext(null);
                        prev.setNext(_reverse(temp2));
                        flag = true;
                        break;
                    }
                    count++;
                }
                if (flag) {
                    _addToList(prev, temp);
                    break;
                }
            }
            count++;
        }
        return head;
    }

    private static ListNode _reverseHead(ListNode head, int n) {
        int count=1;
        ListNode temp=head;
        ListNode prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.getNext();
            if (count==n)break;
            count++;
        }
        prev.setNext(null);
        head=_reverse(head);
        _addToList(head,temp);
        return head;
    }

    private static ListNode _addToList(ListNode head, ListNode list) {
        ListNode temp = head;
        if (head == null)
            head = list;
        else {
            ListNode prev = null;
            while (temp != null) {
                prev=temp;
                temp = temp.getNext();
            }
            prev.setNext(list);
        }
        return head;
    }

    private static ListNode _reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode node = current.getNext();
            current.setNext(prev);
            prev = current;
            current = node;
        }
        return prev;
    }
}
package com.java.algorithms;

import com.java.utils.DataUtils;

/**
 * @author Dhiraj
 * @date 11/05/19
 */
public class ReverseLinkedList_1 {
    public static void main(String[] args) {
        LinkedList  list=DataUtils.getList();
        System.out.println(list.getRoot());
        System.out.println(reverseList(list.getRoot()));
    }
    private static ListNode reverseList(ListNode list) {
        ListNode curr=list;
        ListNode prev=null;
        while (curr!=null){
            ListNode next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

package com.leetcode;

import com.java.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 02/07/19
 */
public class DeleteDups {
    public static void main(String[] args) {

        // [-3,-1,0,0,0,3,3]
        ListNode list1 = new ListNode(-3);
        list1.setNext(new ListNode(-1));
        list1.getNext().setNext(new ListNode(0));
        list1.getNext().getNext().setNext(new ListNode(0));
        list1.getNext().getNext().getNext().setNext(new ListNode(0));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(3));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(3));
        /*list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(3));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(4));*/

        System.out.println(deleteDuplicates(list1));

        //[-1,0,-3,3]
        //[-3,-1,0,3]


    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        Set<Integer> integers= new HashSet<>();
        while (temp!=null){
            integers.add(temp.getData());
            temp=temp.getNext();
        }
        temp=null;
        for (int element:integers) {
           temp=_addToList(temp,element);

        }
        return temp;
    }

    private static ListNode _addToList(ListNode head, int element) {
        if (head==null)
            head=new ListNode(element);
        else {
            ListNode temp=head;
            ListNode prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(new ListNode(element));
        }
        return head;
    }
}

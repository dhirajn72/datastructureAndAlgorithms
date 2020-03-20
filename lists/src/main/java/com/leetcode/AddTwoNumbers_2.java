package com.leetcode;

import com.java.linkedlist.ListNode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 04/07/19
 */
public class AddTwoNumbers_2 {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        /*list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9) );*/

        ListNode list2 = new ListNode(1);
        list2.setNext(new ListNode(2));
        list2.getNext().setNext(new ListNode(3));
        list2.getNext().getNext().setNext(new ListNode(4));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(addTwoNumbers(list1,list2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        StringBuilder builder= new StringBuilder();
        while (temp1!=null){
            builder.append(temp1.getData());
            temp1=temp1.getNext();
        }
        BigInteger val1=new BigInteger(builder.toString());
        builder= new StringBuilder();
        temp1=l2;
        while (temp1!=null){
            builder.append(temp1.getData());
            temp1=temp1.getNext();
        }
        BigInteger val2= new BigInteger(builder.toString()).add(val1);
        builder=new StringBuilder(String.valueOf(val2));
        temp1=null;
        for (int i=0;i<builder.length();i++)
           temp1= _addToList(temp1,builder.charAt(i));
        return temp1;
    }
    private static ListNode _addToList(ListNode temp1, int c) {
        if (temp1==null)
            temp1= new ListNode(Integer.valueOf(String.valueOf((char)c)));
        else {
            ListNode temp=temp1;
            ListNode prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(new ListNode(Integer.valueOf(String.valueOf((char)c))));
        }
        return temp1;
    }
}

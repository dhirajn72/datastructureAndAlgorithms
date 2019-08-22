package com.leetcode;

import com.java.linkedlist.ListNode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 30/06/19
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
/*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
*/
        ListNode list1= new ListNode(2);
        list1.setNext(new ListNode(4));
        list1.getNext().setNext(new ListNode(3));

        ListNode list2= new ListNode(5);
        list2.setNext(new ListNode(6));
        list2.getNext().setNext(new ListNode(4));
        System.out.println(_reverseAndAdd(list1,list2));
    }

    private static ListNode _reverseAndAdd(ListNode list1, ListNode list2) {
        BigInteger num1=_reverse(list1);
        BigInteger num2=_reverse(list2);
        BigInteger sum=num1.add(num2);
        StringBuilder builder= new StringBuilder(String.valueOf(sum));
        ListNode listNode=null;
        for (int i=builder.length()-1;i>=0;i--){
            if (listNode==null)
                listNode=new ListNode(Integer.valueOf(String.valueOf(builder.charAt(i))));
            else _addAtLast(listNode,Integer.valueOf(String.valueOf(builder.charAt(i))));
        }
        return listNode;
    }
    private static void _addAtLast(ListNode listNode, int c) {
        ListNode temp=listNode;
        ListNode prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(new ListNode(Integer.valueOf(c)));
    }
    /*

    BigInteger has been used because one of the test case was failing on leetcode,for input
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
    [5,6,4]
    otherwise, int will serve the purpose
     */
    private static BigInteger _reverse(ListNode head) {
        ListNode prev=null;
        while (head!=null){
            ListNode node= head.getNext();
            head.setNext(prev);
            prev=head;
            head=node;
        }
        StringBuilder builder= new StringBuilder();
        while (prev!=null){
            builder.append(prev.getData());
            prev=prev.getNext();
        }
    return  new BigInteger(builder.toString());
    }
}

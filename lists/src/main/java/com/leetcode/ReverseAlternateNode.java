package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 01/07/19
 */
public class ReverseAlternateNode {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        System.out.println(list1);
        System.out.println(swapPairs(list1));
       // System.out.println(_addToList(list1,new ListNode(2)));


    }

    public static ListNode swapPairs(ListNode head) {
        ListNode originalList=null;
        ListNode temp=head;
        int count=1;
        while (head!=null){
            head=head.getNext();
            count++;
            ListNode prev=head;
            if (head==null)return temp;
            if (count==2){
                head=prev.getNext();
                prev.setNext(null);
                originalList=_addToList(originalList,_reverseList(temp));
                temp=head;
                count=1;
            }
            if (head!=null && head.next==null) {
                originalList = _addToList(originalList, _reverseList(temp));
                return originalList;
            }

        }
        return originalList;
    }

    private static ListNode _addToList(ListNode list, ListNode listNode) {
        if (list==null)
            list=listNode;
        else {
            ListNode prev=null;
            ListNode temp=list;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(listNode);
          return list;
        }
        return list;
    }

    private static ListNode _reverseList(ListNode temp) {
        ListNode curr=temp;
        ListNode prev=null;
        while (curr!=null){
            ListNode node= curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=node;
        }
        return prev;
    }
}

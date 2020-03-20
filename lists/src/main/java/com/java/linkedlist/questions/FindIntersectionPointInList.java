package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 14/06/19
 */
public class FindIntersectionPointInList {
    public static void main(String[] args) {
        ListNode meetingPoint = new ListNode(3);
        ListNode list1 = DataUtils.getList(meetingPoint);
        /*ListNode list2 = new ListNode(10);
        list2.setNext(new ListNode(11));
        list2.getNext().setNext(new ListNode(12));
        list2.getNext().getNext().setNext(meetingPoint);*/

        System.out.println(list1);
        //System.out.println(list2);
        System.out.println();
        System.out.println();

        //findIntersectionPointInList(list1, list2);

        System.out.println(list1);
        //System.out.println(reverseListAlternateNodes(list1));
        //System.out.println(reverseListGivenNodes(list1,3));
        //System.out.println(reverseList(list1));

        System.out.println("cloned list::"+cloneList(list1));


    }

    public static void findIntersectionPointInList(ListNode list1, ListNode list2) {
        List<ListNode> pointers = new ArrayList<>();
        ListNode current = list1;
        while (current != null) {
            if (!pointers.contains(current)) {
                pointers.add(current);
            }
            current = current.getNext();
        }
        current = list2;
        ListNode prev2=null;
        while (current != null) {
            if (!pointers.contains(current)) {
                pointers.add(current);
            } else {
                int index = pointers.indexOf(current);
                ListNode prev = pointers.get(index - 1);
                System.out.println(prev.getData()+"--->>"+ prev);
                System.out.println(prev2.getData()+"--->>"+prev2);
                break;
            }
            prev2=current;
            current = current.getNext();
        }
    }

    public static ListNode cloneList(ListNode head){
        ListNode current=head;
        ListNode cloned=null;
        while (current!=null){
            ListNode node= new ListNode(current.getData());
            if (cloned==null)
                cloned=node;
            else {
                ListNode p,q;
                for (p=cloned;(q=p.getNext())!=null;p=q);
                p.setNext(node);
            }
            current=current.getNext();
        }
        return cloned;
    }


    private static ListNode reverseListGivenNodes(ListNode head, int k) {
        ListNode current=head;
        ListNode next=null;
        ListNode prev=null;

        int count=k;
        while (current!=null && count>0){
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
            count--;
        }

        if (next!=null ){
            head.setNext(reverseListGivenNodes(next,k));
        }
        return prev;

    }
    public static ListNode reverseListAlternateNodes(ListNode head) {
        ListNode temp1 = null;
        ListNode temp2= null;
        while (head!=null && head.getNext()!=null){
            if (temp1!=null)
                temp1.getNext().setNext(head.getNext());

            temp1=head.getNext();
            head.setNext(head.getNext().getNext());
            temp1.setNext(head);
            if (temp2==null)
                temp2=temp1;
            head=head.getNext();
        }
        return temp2;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode node=current.getNext();
            current.setNext(prev);
            prev=current;
            current=node;
        }
        return prev;
    }
    }


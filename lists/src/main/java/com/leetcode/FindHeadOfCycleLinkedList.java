package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class FindHeadOfCycleLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode node=new ListNode(2);
        list1.setNext(node);
        node.setNext(list1);
        /*ListNode node=new ListNode(3);
        list1.getNext().setNext(new ListNode(3));
        ListNode node1=new ListNode(4);
        list1.getNext().getNext().setNext(node);
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(node );*/
        System.out.println(hasCycle(list1));
    }

    public static ListNode hasCycle(ListNode head) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        boolean flag=false;
        while (fastPtr!=null && fastPtr.getNext()!=null ){
            slowPtr=slowPtr.getNext();
            fastPtr=fastPtr.getNext().getNext();
            if (slowPtr==fastPtr){
                flag=true;
                break;
            }
        }
        ListNode prev=null;
        if (flag){
            fastPtr=head;
            while (slowPtr!=null){
                prev=fastPtr;
                slowPtr=slowPtr.getNext();
                fastPtr=fastPtr.getNext();
                if (slowPtr==fastPtr){
                    break;
                }
            }
        }
        if (!flag)return null;
        return fastPtr;
    }
}

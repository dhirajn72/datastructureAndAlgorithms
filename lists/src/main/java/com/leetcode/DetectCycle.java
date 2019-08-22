package com.leetcode;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 02/07/19
 */
public class DetectCycle {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        ListNode node=new ListNode(3);
        list1.getNext().setNext(new ListNode(3));
        ListNode node1=new ListNode(4);
        list1.getNext().getNext().setNext(node);
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(node );
        System.out.println(hasCycle(list1));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        boolean flag=false;
        while (slowPtr!=null && slowPtr.getNext()!=null && fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
            slowPtr=slowPtr.getNext();
            fastPtr=fastPtr.getNext().getNext();
            if (slowPtr==fastPtr){
                flag=true;
                break;
            }
        }
        return flag;
    }
}

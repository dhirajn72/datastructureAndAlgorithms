package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode root= new ListNode(10);
        root.setNext(new ListNode(11));
        root.getNext().setNext(new ListNode(12));
        root.getNext().getNext().setNext(new ListNode(13));
        root.getNext().getNext().getNext().setNext(new ListNode(14));
        printList(root);
        System.out.println();
        printList(reverseList(root));
    }

    private static ListNode reverseList(ListNode root) {
        ListNode current=root;
        ListNode prev=null;
        while (current!=null){
            ListNode next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }
        return prev;
    }

    private static void printList(ListNode root) {
        ListNode current=root;
        while (current!=null){
            System.out.print(current.getData()+", ");
            current=current.getNext();
        }
    }
}

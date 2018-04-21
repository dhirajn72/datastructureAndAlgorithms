package com.java.linkedlist.clients;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.SinglyLinkedList2;

/**
 * @author Dhiraj
 * @date 24/03/18
 */
public class Client2 {
    public static void main(String[] args) {
        SinglyLinkedList2 list2 =  new SinglyLinkedList2();
        list2.insertAtBeginning(new ListNode(99));
        list2.insertAtBeginning(new ListNode(56));
        list2.insertAtBeginning(new ListNode(23));
        list2.insertAtBeginning(new ListNode(78));
        //list2.print();
        list2.insertAtEnd(888);
        list2.insertAtEnd(9999);
        System.out.println("\nLength:::::::"+list2.getLength());
        //list2.print();
        list2.insert(8899,5);
        //list2.insertAtEnd(9999);
        list2.print();
    }
}

package com.java.linkedlist.clients;

import com.java.linkedlist.CircularLinkedList1;

/**
 * @author Dhiraj
 * @date 08/05/18
 */
public class Client11 {
    public static void main(String[] args) {
        CircularLinkedList1 l= new CircularLinkedList1();
        l.insertAtHead(23);
        l.insertAtHead(33);
        l.insertAtHead(54);
        l.insertAtHead(31);
        System.out.println(l);
        l.insertAtTail(100);
        l.insertAtTail(200);
        l.insertAtTail(300);
        System.out.println(l);



    }
}

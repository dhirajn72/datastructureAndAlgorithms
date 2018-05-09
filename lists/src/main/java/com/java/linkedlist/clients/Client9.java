package com.java.linkedlist.clients;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.practice.SinglyLinkedList2;

/**
 * @author Dhiraj
 * @date 07/05/18
 */
public class Client9 {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList2 l = new SinglyLinkedList2();
        l.insertAtHead(30);
        l.insertAtHead(29);
        l.insertAtHead(56);
        l.insertAtHead(54);
        l.insertAtHead(87);
        l.insertAtHead(12);
        l.insertAtHead(21);
        l.insertAtTail(100);
        l.insertAtTail(200);
        l.getRoot().getNext().getNext().getNext().setNext(l.getRoot());

        //l.insertAtTail(300);
        /*l.insert(1000,3);
        l.insert(2000,5);*/
        /*System.out.println(l);
        l.removeFromHead();
        l.removeFromHead();
        System.out.println(l);
        l.removeFromTail();
        l.removeFromTail();
        System.out.println(l);
        System.out.println("Removed element:::"+l.remove(3));
        System.out.println("Removed element:::"+l.remove(3));
        System.out.println("Removed element:::"+l.remove(3));*/
        //System.out.println(l);
        //System.out.println(l.findNthNodeFromEnd(4));*/

        // Detect loop in List
        System.out.println(l.detectLoop(l.getRoot()));


    }
}
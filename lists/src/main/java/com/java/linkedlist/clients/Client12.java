package com.java.linkedlist.clients;

import com.java.linkedlist.SinglyLinkedList3;
import com.java.linkedlist.practice.SinglyLinkedList;

/**
 * @author Dhiraj
 * @date 20/06/18
 */
public class Client12 {
    public static void main(String[] args) {
        SinglyLinkedList3 list=new SinglyLinkedList3();
        list.insertAtBeginning(56);
        list.insertAtBeginning(45);
        list.insertAtBeginning(74);
        list.insertAtBeginning(23);
        list.insertAtBeginning(70);
        list.print();
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        System.out.println("******");
        list.print();



    }
}

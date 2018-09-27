package com.java.linkedlist.clients;

import com.java.linkedlist.SinglyLinkedList4;

/**
 * @author Dhiraj
 * @date 25/09/18
 */
public class Client13 {
    public static void main(String[] args) {

        SinglyLinkedList4<Integer> listInteger= new SinglyLinkedList4<>();
        listInteger.insertAtBeginning(12);
        listInteger.insertAtBeginning(23);
        listInteger.insertAtBeginning(32);
        listInteger.insertAtBeginning(24);
        listInteger.insertAtBeginning(35);
        listInteger.insertAtBeginning(54);
        listInteger.print();
        System.out.println("******");
        SinglyLinkedList4<String> listString= new SinglyLinkedList4<>();
        listString.insertAtBeginning("apple");
        listString.insertAtBeginning("ball");
        listString.insertAtBeginning("cat");
        listString.insertAtBeginning("dog");
        listString.print();








    }
}

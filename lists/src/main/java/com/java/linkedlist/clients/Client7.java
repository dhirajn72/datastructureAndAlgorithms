package com.java.linkedlist.clients;

import com.java.linkedlist.practice.DoublyLinkedList;

/**
 * @author Dhiraj
 * @date 28/04/18
 */
public class Client7 {
    public static void main(String[] args) throws  Exception{
        DoublyLinkedList l= new DoublyLinkedList();
        l.insertAtHead(10);
        l.insertAtHead(20);
        l.insertAtHead(30);
        l.insertAtTail(100);
        l.insertAtTail(200);
        l.insertAtTail(300);
        //System.out.println(l);
        l.insert(1000,5);
        l.insert(2000,0);
        System.out.println(l);
        System.out.println("Removed:::::"+l.remove(6));
        System.out.println(l);
        System.out.println("Removed:::::"+l.removeHead());
        System.out.println(l);
        System.out.println("Removed:::::"+l.removeTail());
        System.out.println(l);
    }
}

package com.java.linkedlist.clients;

import com.java.linkedlist.DoublyLinkedList1;

/**
 * @author Dhiraj
 * @date 07/05/18
 */
public class Client10 {
    public static void main(String[] args) throws Exception{
        DoublyLinkedList1 l= new DoublyLinkedList1();
        l.insertAtHead(46);
        l.insertAtHead(23);
        l.insertAtHead(90);
        l.insertAtHead(65);
        System.out.println(l);
        l.insertAtTail(100);
        l.insertAtTail(200);
        l.insertAtTail(300);
        System.out.println(l);
        l.insert(1000,4);
        l.insert(1000,7);
        System.out.println(l);
        System.out.println("Removed::"+l.removeHead());
        System.out.println("Removed::"+l.removeHead());
        System.out.println("Removed::"+l.removeHead());
        System.out.println(l);
        System.out.println("Removed::"+l.removeTail());
        System.out.println("Removed::"+l.removeTail());
        System.out.println(l);
        System.out.println("Removed ::::::"+l.remove(2));
        System.out.println(l);
    }
}

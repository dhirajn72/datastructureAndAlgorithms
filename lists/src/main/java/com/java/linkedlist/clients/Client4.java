package com.java.linkedlist.clients;

import com.java.linkedlist.DoublyLinkedList;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class Client4 {
    public static void main(String[] args) {
        DoublyLinkedList l=new DoublyLinkedList();
        l.insertAtBeginning(50);
        l.insertAtBeginning(78);
        l.insertAtBeginning(45);
        l.insertAtBeginning(90);
        //System.out.println(l);
        l.insert(100,0);
        l.insertAtEnd(1000);
        l.insertAtEnd(2000);
        l.insertAtEnd(3000);
        System.out.println(l);
        /*l.remove(1);
        l.remove(2);
        l.remove(3);
        l.remove(4);
        l.remove(5);
        l.remove(6);
        l.remove(7);
        l.remove(8);*/
        //l.remove(0); //returns [] because no elements found in list
        System.out.println(l);
        System.out.println(l.getPosition(100));
        System.out.println(l.getPosition(3000));
        System.out.println(l.getPosition(78));


    }
}

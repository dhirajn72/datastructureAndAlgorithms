package com.java.linkedlist.clients;

import com.java.linkedlist.practice.SinglyLinkedList;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class Client3 {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList list= new SinglyLinkedList();
        list.insertAtBeginning(89);
        list.insertAtBeginning(23);
        list.insertAtBeginning(54);
        list.insertAtBeginning(65);
        //System.out.println(list);
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        //System.out.println(list);
        System.out.println("*****");
        //list.insert(1000,0);
        //list.insert(1000,34);
        list.insert(1000,3);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        //System.out.println(list.removeFirst()); //java.lang.Exception: No elements available

        System.out.println("*****");
        System.out.println(list);

    }
}

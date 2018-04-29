package com.java.linkedlist.clients;

import com.java.linkedlist.practice.CircularLinkedList;

/**
 * @author Dhiraj
 * @date 28/04/18
 */
public class Client8 {
    public static void main(String[] args) throws Exception{
        CircularLinkedList l= new CircularLinkedList();
        l.insertAtHead(23);
        //l.insertAtTail(100);
        /*l.insertAtHead(50);
        l.insertAtHead(34);
        l.insertAtHead(65);
        l.insert(1000,20);*/
        /*System.out.println(l);
        System.out.println("Removed element::::"+l.removeHead());
        System.out.println("Removed element::::"+l.removeHead());
        System.out.println("Removed element::::"+l.removeHead());
        System.out.println("Removed element::::"+l.removeHead());
        System.out.println("Removed element::::"+l.removeHead());
        System.out.println("Removed element::::"+l.removeHead());*/
        //System.out.println(l);
        //System.out.println("Removed tail::::"+l.removeTail());
       /* System.out.println("Removed tail::::"+l.removeTail());
        System.out.println("Removed tail::::"+l.removeTail());
        System.out.println("Removed tail::::"+l.removeTail());
        System.out.println("Removed tail::::"+l.removeTail());*/
        //System.out.println("Removed tail::::"+l.removeTail());
        System.out.println("Removed element::::"+l.remove(6));
        /*System.out.println("Removed element::::"+l.remove(6));
        System.out.println("Removed element::::"+l.remove(6));*/

        System.out.println(l);



    }
}

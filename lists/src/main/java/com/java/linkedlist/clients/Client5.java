package com.java.linkedlist.clients;

import com.java.linkedlist.CircularLinkedList;

/**
 * @author Dhiraj
 * @date 25/04/18
 */
public class Client5 {
    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.add(10);
        l.add(23);
        l.add(45);
        l.add(54);
        l.add(40);
        l.add(70);

        System.out.println(l);
        System.out.println(l.size());
        l.addToTail(100);
        System.out.println(l);
        l.addToHead(111);
        System.out.println(l);
        System.out.println("Removed::::" + l.remove(100));
        System.out.println(l);
        System.out.println(l.contains(40));


    }
}

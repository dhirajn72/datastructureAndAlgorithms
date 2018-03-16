package com.java.karumanchi.linkedlist.clients;

import com.java.karumanchi.linkedlist.LinkedList2;
import com.java.karumanchi.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 16/03/18
 */
public class Client3 {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.insertAtBeginning(new ListNode(99));
        list.insertAtBeginning(new ListNode(34));
        list.insertAtBeginning(new ListNode(45));
        list.insertAtBeginning(new ListNode(12));
        list.insertAtBeginning(new ListNode(78));
        list.insertAtBeginning(new ListNode(38));
        list.print();
        System.out.println("*********");
        System.out.println(list.getLength());
        list.insert(new ListNode(55),23);
        list.print();
        System.out.println("*********");
        System.out.println(list.getLength());
    }
}

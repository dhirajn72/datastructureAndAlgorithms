package com.java.karumanchi.linkedlist.clients;

import com.java.karumanchi.linkedlist.LinkedList;
import com.java.karumanchi.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 02/03/18
 */
public class Client1 {
    public static void main(String[] args) {

        ListNode node1= new ListNode(50);

        LinkedList list= new LinkedList();
        list.insertAtBeginning(node1);
        list.insertAtBeginning(new ListNode(45));
        list.insertAtBeginning(new ListNode(56));
        list.insertAtBeginning(new ListNode(23));
        list.insertAtBeginning(new ListNode(76));
        list.insertAtEnd(new ListNode(89));



        list.print(); // 76,23,56,45,50,89




    }
}

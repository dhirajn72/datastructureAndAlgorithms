package com.java.karumanchi.linkedlist.clients;

import com.java.karumanchi.linkedlist.LinkedList1;
import com.java.karumanchi.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 14/03/18
 */
public class Client2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(45);
        LinkedList1  list1= new LinkedList1();
        list1.insertAtBeginning(node);
        list1.insertAtBeginning(new ListNode(98));
        list1.insertAtBeginning(new ListNode(46));
        list1.insertAtBeginning(new ListNode(67));
        list1.insertAtBeginning(new ListNode(27));
        list1.insertAtBeginning(new ListNode(97));
        list1.insert(23,3);
        list1.print();
        System.out.println(list1.getHead().getData());
    }
}

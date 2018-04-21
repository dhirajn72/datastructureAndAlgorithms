package com.java.linkedlist.clients;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.SinglyLinkedList1;

/**
 * @author Dhiraj
 * @date 17/03/18
 */
public class Client1 {
    public static void main(String[] args) {
        SinglyLinkedList1 list= new SinglyLinkedList1();
        list.insertAtBeginning(new ListNode(12));
        list.insertAtBeginning(new ListNode(45));
        list.insertAtBeginning(new ListNode(47));
        list.insertAtBeginning(new ListNode(43));
        list.insertAtBeginning(new ListNode(41));
        ListNode removeme=new ListNode(88888);
        list.insertAtBeginning(removeme);

        list.insertAtBeginning(new ListNode(23));
        list.insertAtBeginning(new ListNode(67));

        list.print();
        System.out.println("Length:::::::"+list.getLength());
        list.insertAtEnd(new ListNode(88));
        list.insertAtEnd(new ListNode(99));
        list.print();
        list.insert(new ListNode(11),0);
        list.insert(new ListNode(2222),3);
        list.print();
        System.out.println(list.getPosition(11));
        System.out.println(list.removeFirst());
        list.print();
        System.out.println("Removed:::::::"+list.removeLast());
        list.print();
        System.out.println("Removed:::::::"+list.removeMatched(removeme));
        list.print();




    }
}

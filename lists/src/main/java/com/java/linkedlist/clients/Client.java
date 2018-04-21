package com.java.linkedlist.clients;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.SinglyLinkedList;

/**
 * @author Dhiraj
 * @date 17/03/18
 */
public class Client {
    public static void main(String[] args) {
        ListNode remove=new ListNode(45);
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(new ListNode(99));
        list.insertAtBeginning(new ListNode(34));
        //list.insertAtBeginning(new ListNode(45));
        list.insertAtBeginning(remove);
        /*list.insertAtBeginning(new ListNode(12));
        list.insertAtBeginning(new ListNode(45));
        //list.insertAtBeginning(remove); How can you insert same node in the list twice, its circular reference //NOTVALID CASE !

        list.insertAtBeginning(new ListNode(38));
        list.print();
        list.insert(new ListNode(222),1);
        list.print();
        System.out.println("Position::::::::"+list.getPosition(222));
        ListNode removedNode=list.removeFromEnd();
        list.print();
        System.out.println("Removed::::::::"+removedNode);
        list.print();
        ListNode removedFirst=list.removeFromBeginning();
        System.out.println("Removed::::::::"+removedFirst);
        list.print();
        System.out.println("Removed::::::::"+list.removeFromEnd());
        System.out.println("Removed::::::::"+list.removeFromBeginning());
        list.print();

        //Removing matched
        System.out.println(list.removeMatched(remove));*/
        list.print();
        System.out.println(list.remove(6));
        list.print();




    }
}

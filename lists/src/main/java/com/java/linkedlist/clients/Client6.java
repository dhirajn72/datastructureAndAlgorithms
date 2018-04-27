package com.java.linkedlist.clients;

import com.java.linkedlist.practice.SinglyLinkedList1;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class Client6 {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList1 l= new SinglyLinkedList1();
        l.insertAtHead(50);
        l.insertAtHead(50);
        l.insertAtHead(54);
        l.insertAtHead(17);
        l.insertAtHead(17);
        //System.out.println(l);
        l.insertAtTail(100);
        l.insertAtTail(200);
        l.insertAtTail(300);
        //System.out.println(l);
        l.insert(1000,2);
        l.insert(2000,1000);

        System.out.println(l);
        /*System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from head::::"+l.removeHead());
        System.out.println("Remove from tail::::::::"+l.removeTail());*/
        //System.out.println("Remove from tail::::::::"+l.removeTail());
        /*System.out.println(l);
        System.out.println("remove:::::::::"+l.remove(0));
        System.out.println("remove:::::::::"+l.remove(80));*/
        //System.out.println("Elements left::"+l);
        l.removeMatched(17);
        l.removeMatched(17);
        l.removeMatched(2000);




        System.out.println(l);


    }
}

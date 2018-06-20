package com.java.linkedlist.clients;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.practice.SinglyLinkedList2;
import com.java.linkedlist.questions.FindHeadOfLoopInList;
import com.java.linkedlist.questions.FindLengthOfLoopInlist;
import com.java.linkedlist.questions.FindLoopInLinkedList;
import com.java.linkedlist.questions.InsertInSortedList;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 07/05/18
 */
public class Client9 {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList2 l = new SinglyLinkedList2();
        l.insertAtHead(30);
        l.insertAtHead(29);
        l.insertAtHead(56);
        l.insertAtHead(54);
        l.insertAtHead(87);
        l.insertAtHead(12);
        l.insertAtHead(21);
        l.insertAtTail(100);
        l.insertAtTail(200);
        //l.getRoot().getNext().getNext().getNext().setNext(l.getRoot());

        //l.insertAtTail(300);
        /*l.insert(1000,3);
        l.insert(2000,5);*/
        /*System.out.println(l);
        l.removeFromHead();
        l.removeFromHead();
        System.out.println(l);
        l.removeFromTail();
        l.removeFromTail();
        System.out.println(l);
        System.out.println("Removed element:::"+l.remove(3));
        System.out.println("Removed element:::"+l.remove(3));
        System.out.println("Removed element:::"+l.remove(3));*/
        //System.out.println(l);
        //System.out.println(l.findNthNodeFromEnd(4));*/

        // Detect loop in List
        //System.out.println(new FindLoopInLinkedList().loopExists(l.getRoot()));
        /*System.out.println(new FindHeadOfLoopInList().findHeadOfLoop(l.getRoot()));
        System.out.println(new FindHeadOfLoopInList().findHeadOfLoop(l.getRoot()));
        System.out.println(new FindLengthOfLoopInlist().findLengthOfLoop(l.getRoot()));*/

        ListNode root= new ListNode(50);
        root.setNext(new ListNode(60));
        root.getNext().setNext(new ListNode(70));
        root.getNext().getNext().setNext(new ListNode(80));
        root.getNext().getNext().getNext().setNext(new ListNode(90));

        ListNode temp=root;
        while (temp!=null){
            System.out.print(temp.getData()+", ");
            temp=temp.getNext();
        }
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

        ListNode addedNode1 = new InsertInSortedList().insertInSortedList(root,new ListNode(40));
        ListNode temp1=addedNode1;
        while (temp1!=null){
            System.out.print(temp1.getData()+", ");
            temp1=temp1.getNext();
        }

        System.out.println();
        System.out.println("Print in reverse order:::");

        ListNode curr=root;
        int length=0;
        Stack<Integer> s=new Stack<>();
        while(curr!=null){
            length++;
            curr=curr.getNext();
        }
        if(length==0){
            System.out.println(0);
        }else{

            ListNode p=root,q=null;
            while( (q=p.getNext())!=null ){
                s.add(p.getData());
                p=q;
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }






    }
}

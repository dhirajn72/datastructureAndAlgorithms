package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 14/06/19
 */
public class SinglyLinkedList {
    private int size;
    private ListNode head;

    public void add(int item){
        if (head==null){
            head=new ListNode(item);
        }
        else {
            ListNode p,q;
            for (p=head;(q=p.getNext())!=null;p=q);
                p.setNext(new ListNode(item));
        }
        size++;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "size=" + size +
                ", head=" + head +
                '}';
    }

    public ListNode getHead() {
        return head;
    }

    private int getNthNodeFromFront( int nthNode) {
        if (nthNode<0 || nthNode>size)
            throw new IllegalArgumentException("Invalid size");
        ListNode temp=head;
        int count=0;
        ListNode prev=null;
        while (temp!=null && count!=nthNode ){
            prev=temp;
            temp=temp.getNext();
            count++;
        }
        return prev.getData();
    }

    private int getNthNodeFromEnd(int nthNode) {
        if (nthNode<0 || nthNode>size)
            throw new IllegalArgumentException("Invalid size");
        ListNode temp=head;
        int count=0;
        int prevToNthNode=size-nthNode;
        while (temp!=null && count!=prevToNthNode ){
            temp=temp.getNext();
            count++;
        }
        return temp.getData();

    }


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(list.getNthNodeFromFront(8));
        System.out.println(list.getNthNodeFromEnd(3));



    }



}

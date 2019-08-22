package com.java.linkedlist.questions;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class CircularList {
    private int length;
    private ListNode tail;

    public void add(int data){
        addToHead(data);
    }
    public void addToHead(int data){
        ListNode node=new ListNode(data);
        if (tail==null) {
            tail = node;
            tail.setNext(tail);
        }else {
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        length++;
    }
    public void addToTail(int data){
        if (tail==null)
            addToHead(data);
        tail=tail.getNext();
    }
    public int peek(){
        return tail.getNext().getData();
    }
    public int removeFromHead(){
        int data=0;
        if (tail==tail.getNext())
            tail=null;
        else {
            ListNode temp=tail.getNext();
            tail.setNext(temp.getNext());
            temp.setNext(null);
            data=temp.getData();
        }
        return data;
    }
}

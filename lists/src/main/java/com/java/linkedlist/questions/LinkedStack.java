package com.java.linkedlist.questions;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class LinkedStack {
    private int length;
    private ListNode top;
    public void push(int data){
        ListNode node=new ListNode(data);
        if (top==null)
            top=node;
        else {
            node.setNext(top);
            top=node;
        }
        length++;
    }
    public int pop(){
        if (top==null)
            throw new EmptyStackException();
        else {
            ListNode tmep=top;
            top=top.getNext();
            tmep.setNext(null);
            return tmep.getData();
        }
    }

    public int peek(){
        if (top==null)
            throw new EmptyStackException();
        else return top.getData();
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "length=" + length +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        LinkedStack s= new LinkedStack();
        s.push(34);
        s.push(54);
        s.push(12);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);




    }
}



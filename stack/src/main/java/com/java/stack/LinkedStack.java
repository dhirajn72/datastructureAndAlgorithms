package com.java.stack;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class LinkedStack {

    private int length;
    private ListNode top;

    public LinkedStack() {
        length=0;
        top=null;
    }
    public void push(int data){
        ListNode temp= new ListNode(data);
        temp.setNext(top);
        top=temp;
        length++;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int data = top.getData();
        top=top.getNext();
        length--;
        return data;
    }
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return top.getData();
    }
    private boolean isEmpty() {
        return length==0;
    }
    public int size(){
        return length;
    }
    @Override
    public String toString() {
        String result="";
        ListNode current=top;
        while (current!=null){
            result=result+current.getData() +", ";
            current=current.getNext();
        }
        return result.isEmpty()? result:result.substring(0,result.length()-2);
    }
}

package com.java.stack.practice;

import com.java.stack.ListNode;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class LinkedStack {

    private int length;
    private ListNode top;

    public void push(int data){
        ListNode node= new ListNode(data);
        node.setNext(top);
        top=node;
        length++;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int data=top.getData();
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
        return (length==0);
    }
    @Override
    public String toString() {
        String result="";
        ListNode currentNode=top;
        while (currentNode!=null){
            result=result+currentNode.getData()+"\n";
            currentNode=currentNode.getNext();
        }
        return result;
    }
}

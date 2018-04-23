package com.java.stack.practice;

import com.java.stack.ListNode;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 22/04/18
 */
public class LinkedStack1 {
    private int length;
    private ListNode top;
    public  void push(int data){
        ListNode node = new ListNode(data);
        node.setNext(top);
        top=node;
        length++;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int poppedData=top.getData();
        top=top.getNext();
        length--;
        return poppedData;
    }
    private boolean isEmpty() {
        return length==0;
    }
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return top.getData();
    }
    public int size(){
        return length;
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

package com.java.stack.practice;

import com.java.stack.ListNode;

/**
 * @author Dhiraj
 * @date 29/04/18
 */
public class LinkedStack2 {

    private int height;
    private ListNode top;

    public void push(int data){
        ListNode node= new ListNode(data);
        if (isEmpty()){
            top=node;
        }
        else {
            node.setNext(top);
            top=node;
        }
        height++;
    }
    private boolean isEmpty() {
        return height==0;
    }
    public int pop()throws Exception{
        if (isEmpty())
            throw new Exception("Empty stack !!");
        ListNode temp=top;
        top=top.getNext();
        height--;
        if (isEmpty())
            top=null;
        return temp.getData();
    }

    public int peek()throws Exception{
        if (isEmpty())
            throw new Exception("Empty stack !!");
        return top.getData();

    }




}

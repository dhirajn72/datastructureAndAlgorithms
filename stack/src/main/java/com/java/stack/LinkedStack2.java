package com.java.stack;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 20/01/19
 */
public class LinkedStack2 {

    private ListNode top;
    private int length;

    public void push(int data){
        ListNode node= new ListNode(data);
        node.setNext(top);
        top=node;
        length++;
    }

    public int pop(){
        if (length==0)
            throw new EmptyStackException();
        int removed=top.getData();
        top=top.getNext();
        length--;
        return removed;
    }

    public int size(){
        return length;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        ListNode temp=top;
        while (temp!=null){
            builder.append(temp.getData()).append(",");
            temp=temp.getNext();
        }
        return builder.length()==0? "Empty Stack":builder.delete(builder.length()-1,builder.length()).toString();
    }

    public static void main(String[] args) {
        LinkedStack2 stack= new LinkedStack2();
        stack.push(90);
        stack.push(45);
        stack.push(23);
        stack.push(70);
        stack.push(56);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}


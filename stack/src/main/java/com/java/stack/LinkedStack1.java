package com.java.stack;

import java.util.EmptyStackException;
import java.util.Objects;

/**
 * @author Dhiraj
 * @date 15/10/18
 */
public class LinkedStack1 {
    private int length;
    private ListNode top;
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.setNext(top);
        top=temp;
        length++;
    }
    public int pop() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException();
        int removed=top.getData();
        top=top.getNext();
        length--;
        return removed;
    }

    private boolean isEmpty() {
        return length==0;
    }

    public  int peek() throws  EmptyStackException{
        if (isEmpty())throw  new EmptyStackException();
        return top.getData();
    }
    @Override
    public String toString() {
        if (top==null)
            return "[]";
        StringBuilder contents=new StringBuilder("[");
        ListNode current=top;
        while (Objects.nonNull(current)){
            contents.append(current.getData())
                    .append(",");
            current=current.getNext();
        }
        contents.append("]");
        return contents.deleteCharAt(contents.length()-2).toString();
    }

    public static void main(String[] args) {
        LinkedStack1 stack1=new LinkedStack1();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1);
        System.out.println(stack1.peek());
    }
}

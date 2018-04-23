package com.java.stack.clients;

import com.java.stack.practice.LinkedStack1;

/**
 * @author Dhiraj
 * @date 22/04/18
 */
public class Client3 {
    public static void main(String[] args) {
        LinkedStack1 stack = new LinkedStack1();
        //stack.peek(); //java.util.EmptyStackException
        //stack.pop();//java.util.EmptyStackException
        stack.push(12);
        stack.push(34);
        stack.push(54);
        stack.push(23);
        stack.push(65);
        System.out.println(stack.size());
        System.out.println("******");
        System.out.println(stack);
        System.out.println("******");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop()); //java.util.EmptyStackException
    }
}

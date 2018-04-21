package com.java.stack.clients;

import com.java.stack.practice.LinkedStack;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class Client2 {
    public static void main(String[] args) {
        LinkedStack s= new LinkedStack();
        s.push(89);
        s.push(56);
        s.push(23);
        s.push(78);
        s.push(90);
        System.out.println(s);
        System.out.println("****");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        //System.out.println(s.pop());
        //System.out.println(s.pop()); java.util.EmptyStackException
        System.out.println("****");
        System.out.println(s);
        System.out.println("****");
        System.out.println(s.peek());
    }
}

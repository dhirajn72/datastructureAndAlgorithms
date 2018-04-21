package com.java.stack.clients;

import com.java.stack.LinkedStack;


/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class Client1 {
    public static void main(String[] args) {

        LinkedStack s = new LinkedStack();
        s.push(90);
        s.push(50);
        s.push(30);
        s.push(40);
        s.push(67);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println("*****");
        System.out.println(s.pop());
        System.out.println("*****");
        System.out.println(s);
       /* System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());*/
        //System.out.println(s.pop()); //EmptyStackException();
        System.out.println("*****");
        System.out.println(s.peek());
        System.out.println("*****");
        System.out.println(s);
    }
}

package com.java.queue.clients;

import com.java.queue.practice.LinkedQueue;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class Client2 {
    public static void main(String[] args) throws Exception{
        LinkedQueue q = new LinkedQueue();
        q.enque(89);
        q.enque(32);
        q.enque(43);
        q.enque(24);
        q.enque(86);
        q.enque(12);
        System.out.println(q);
        System.out.println("*****");
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        //System.out.println(q.deque());
        //System.out.println(q.deque()); //java.lang.Exception: Empty stack!
        System.out.println("****");
        System.out.println(q);
        System.out.println(q.first());

    }
}

package com.java.queue.clients;

import com.java.queue.LinkedQueue;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class Client1 {
    public static void main(String[] args) throws Exception {

        LinkedQueue q= new LinkedQueue();
        q.enque(90);
        q.enque(30);
        q.enque(20);
        q.enque(80);
        q.enque(98);
        q.enque(78);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println("****");
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        //System.out.println(q.deque());
        //System.out.println(q.deque());
        //System.out.println(q.deque()); // Exception, trying to deque 7th element which doesn't exists
        System.out.println("****");
        System.out.println(q);

        System.out.println(q.first());
        System.out.println(q.last());
    }
}

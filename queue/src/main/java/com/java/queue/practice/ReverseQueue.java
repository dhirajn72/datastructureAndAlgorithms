package com.java.queue.practice;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class ReverseQueue {
    public static void main(String[] args) {
        LinkedQueue_1 q = new LinkedQueue_1();
        Stack<Integer> s = new Stack<>();

        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        System.out.println(q);
        while (!q.isEmpty()) {
            s.push(q.deque());
        }
        while (!s.isEmpty())
            q.enque(s.pop());
        System.out.println(q);

    }
}

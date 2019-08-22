package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack s= new MyStack();
        System.out.println(s.top());

        System.out.println(s);

    }
}


class MyStack {

    /**
     * Initialize your data structure here.
     */
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (q1.isEmpty())
            q2.offer(x);
        else q1.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int i = 0;
        if (q2.isEmpty()) {
            while (i < q1.size() -1) {
                q2.offer(q1.poll());
                i++;
            }
            return q1.poll();
        } else {
            while (i < q2.size() -1) {
                q1.offer(q2.poll());
                i++;
            }
            return q2.poll();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        int i = 0;
        if (q2.isEmpty()) {
            while (i < q1.size()) {
                q2.offer(q1.poll());
                i++;
            }
            return q1.peek();
        } else {
            while (i < q2.size()) {
                q1.offer(q2.poll());
                i++;
            }
            if (q1.size()==1)return q1.peek();
            return q2.peek();
        }

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
package com.karumanchi;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class MaintainMinInStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        MaintainMinInStack q = new MaintainMinInStack();
        q.push(2);
        q.push(6);
        q.push(4);
        q.push(1);
        q.push(5);
        System.out.println(q);
        //System.out.println(q.min());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        //System.out.println(q.pop());
       // System.out.println(q.pop());
        System.out.println("**");
        System.out.println(q.min());
        System.out.println(q);
    }

    public void push(int data) {
        s1.push(data);
        if (s2.isEmpty() || s1.peek() <= s2.peek())
            s2.push(data);
    }

    @Override
    public String toString() {
        return "MaintainMinInStack{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }

    public int pop() {
        if (s1.isEmpty() || s2.isEmpty())
            throw new EmptyStackException();
        int s1Top = s1.peek();
        int s2Top = s2.peek();

        if (s1Top > s2Top && !s1.isEmpty() && !s2.isEmpty())
            return s1.pop();
        if (s1Top == s2Top && !s1.isEmpty() && !s2.isEmpty())
            s2.pop();
        return s1.pop();
    }

    public int min() {
        if (!s2.isEmpty())
            return s2.peek();
        throw new EmptyStackException();
    }

}



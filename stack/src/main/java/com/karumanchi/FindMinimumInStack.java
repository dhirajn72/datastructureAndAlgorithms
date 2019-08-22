package com.karumanchi;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 04/07/19
 */
public class FindMinimumInStack {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(9);
        s.push(3);
        s.push(2);
        s.push(5);
        s.push(7);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("*******");
        System.out.println(s.findMin());
    }
}

class Stack extends java.util.Stack<Integer>{
    java.util.Stack<Integer> s2= new java.util.Stack();


    public void push(int element){
        if (element<=min())
            s2.push(element);
        super.push(element);
    }
    public int findMin(){
        return s2.isEmpty()?-1:s2.peek();
    }

    public Integer pop(){
        if (super.isEmpty() || s2.isEmpty())
            throw new EmptyStackException();
        else{
            int val=super.pop();
            if (val==s2.peek())
                s2.pop();
            return val;
        }
    }

    private int min() {
        if (s2.isEmpty())
            return Integer.MAX_VALUE;
        else
            return s2.peek();
    }
}



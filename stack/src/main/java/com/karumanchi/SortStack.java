package com.karumanchi;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(9);
        s.push(7);
        s.push(8);
        s.push(3);
        s.push(5);
        s.push(1);
        System.out.println(s);
        System.out.println(_sort(s));
    }
    private static Stack _sort(Stack<Integer> s) {
        Stack<Integer> stack= new Stack<>();
        while (!s.isEmpty()){
            int temp=s.pop();
            while (!stack.isEmpty() && stack.peek()>temp){
                s.push(stack.pop());
            }
            stack.push(temp);
        }
        return stack;
    }
}

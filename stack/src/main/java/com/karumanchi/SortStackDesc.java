package com.karumanchi;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class SortStackDesc {
    public static void main(String[] args) {
        Stack<Integer> s1= new Stack<>();
        s1.push(5);
        s1.push(1);
        s1.push(9);

        s1.push(4);
        s1.push(8);

        s1.push(3);
        s1.push(2);


        System.out.println(s1);
        /// System.out.println(_sortStack(s1));
        System.out.println("***");
        Stack<Integer> stack=_sortStack(s1);
        /*while (!stack.isEmpty())
            System.out.println(stack.pop());*/
        System.out.println(stack);
    }

    private static Stack _sortStack(Stack<Integer> s1) {
        Stack<Integer> s2= new Stack<>();
        while (!s1.isEmpty()){
            int temp=s1.pop();
            while (!s2.isEmpty() && s2.peek()<=temp){
                s1.push(s2.pop());
            }
            s2.push(temp);
        }
        return s2;
    }
}

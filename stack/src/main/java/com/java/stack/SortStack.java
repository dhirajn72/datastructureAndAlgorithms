package com.java.stack;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/06/19
 */
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(8);
        stack.push(9);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
      //  _sortStack(stack);
        sortStack(stack);
    }

    private static void _sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            if (stack.peek() > temp) {
                int pop = stack.pop();
                stack.push(temp);
                stack.push(pop);
                _sortStack(stack);
            }
        }
        System.out.println(stack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()){
            int temp=input.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>temp){
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        System.out.println(tempStack);
        return tempStack;
    }
}
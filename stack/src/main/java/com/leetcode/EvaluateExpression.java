package com.leetcode;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 04/07/19
 */
public class EvaluateExpression {
    public static void main(String[] args) {
        System.out.println(_evaluate("[{()(){()}}]"));
    }

    private static boolean _evaluate(String str) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            } else if (!stack.isEmpty() && str.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            } else if (str.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            } else {
                stack.push(str.charAt(i)); // [{(
            }
        }
        return stack.isEmpty();
    }
}

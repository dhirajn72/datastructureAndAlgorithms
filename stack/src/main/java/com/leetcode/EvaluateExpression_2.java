package com.leetcode;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class EvaluateExpression_2 {
    public static void main(String[] args) {
        String exp = "(){}[]";
        System.out.println(isValid(exp));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')' && !s.isEmpty() && s.peek() == '(')
                s.pop();
            else if (str.charAt(i) == ']' && !s.isEmpty() && s.peek() == '[')
                s.pop();

            else if (str.charAt(i) == '}' && !s.isEmpty() && s.peek() == '{')
                return false;
            else
                s.push(str.charAt(i));
        }
        if (s.isEmpty())
            return true;
        return false;
    }
}
package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 03/09/19
 */
public class ValidParenthisis {


    /*
    Success
Details
Runtime: 2 ms, faster than 60.63% of Java online submissions for Valid Parentheses.
Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Valid Parentheses.
     */
    public boolean isValid(String s) {
        if (s==null||s.length()==0)return true;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else if (s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
            else if (s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[')
                stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}

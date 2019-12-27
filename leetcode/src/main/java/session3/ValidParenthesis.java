package session3;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 13/11/19
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }


    public static boolean isValid(String s) {
        if (s==null||s.length()==0)return true;
        if (s.length()==1)return false;
        if (s.length()%2!=0)return false;

        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            switch (c){
                case ')':
                    if (!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                break;
                case '}':
                    if (!stack.isEmpty() && stack.peek()=='{')
                        stack.pop();
                break;
                case ']':
                    if (!stack.isEmpty() && stack.peek()=='[')
                        stack.pop();
                break;
                default: stack.push(c);
            }

        }
        return stack.isEmpty();
    }
}

package session3;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 28/11/19
 */
public class LongestValidParenthesis {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
        System.out.println(longestValidParentheses("()((()()()()(((((())))"));
    }

    public static int longestValidParentheses(String s) {
        if (s==null)return 0;
        if (s.length()==0)return 0;
        Stack<Character> stack=new Stack<>();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            switch (s.charAt(i)){
                case ')': if (!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                    count++;
                }
                break;
                case '}': if (!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                    count++;
                }
                break;

                case ']': if (!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                    count++;
                }
                break;
                default:stack.push(s.charAt(i));
            }
        }
        return count;
    }
}

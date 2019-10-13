package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/09/19
 */
public class LongestValidParenthesis {

    public static void main(String[] args) {
       // System.out.println(longestValidParentheses("(()"));
        //System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses("()(()"));
    }



    public static int longestValidParentheses(String s) {
        if (s==null||s.length()==0)return 0;
        Stack<Character> characters=new Stack<>();
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                characters.push(s.charAt(i));
            }
            else {
                if (!characters.isEmpty() && s.charAt(i)==')')
                    characters.pop();

            }
        }
        return max;
    }
}

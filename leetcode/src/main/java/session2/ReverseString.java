package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if (s==null)return;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        int index=0;
        while (!stack.isEmpty()){
            s[index++]=stack.pop();
        }
    }
}

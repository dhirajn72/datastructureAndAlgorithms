package session3;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 08/12/19
 */
public class ReverseStackUsingRecursion {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }

    private static void reverse(Stack<Integer> s) {
        if(s.size()>0){
            int x=s.peek();// 5,4,3,2,1
            s.pop();
            reverse(s);
            _insert(x,s);
        }

    }

    private static void _insert(int x,Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(x);
        }
        else {
            int y=s.peek();
            s.pop();
            _insert(x,s);
            s.push(y);

        }
    }
}

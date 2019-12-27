package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 07/11/19
 */
public class ReverseStackWithRecursion {
    static Stack<Integer> s=new Stack<>();
    public static void main(String[] args) {

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        _reverseRecursive();
        System.out.println(s);


    }

    private static void _reverseRecursive() {
        if (s==null)return ;
        if (s.size()>0){
            int e=s.peek();
            s.pop();
            _reverseRecursive();
            insertIntoStack(e);
        }
    }

    private static void insertIntoStack( int e) {
        if (s.isEmpty())
            s.push(e);
        else {
            int a = s.peek();
            s.pop();
            insertIntoStack(e);
            s.push(a);
        }
    }
}

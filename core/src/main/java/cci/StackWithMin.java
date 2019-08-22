package cci;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class StackWithMin {
    public static void main(String[] args) {
        StackMin s =  new StackMin();
        s.push(9);
        s.push(4);
        s.push(10);
        s.push(1);
        s.pop();
        System.out.println(s.min());
    }
}

class StackMin extends Stack<Integer> {
    private Stack<Integer> s2;

    public StackMin() {
        super();
        this.s2 = new Stack<>();
    }

    public Integer pop() {
        int value = super.pop();
        if (value == s2.peek())
            s2.pop();
        return value;
    }

    public void push(int value) {
        if (value <= min())
            s2.push(value);
        super.push(value);
    }

    public int min() {
        if (s2.isEmpty())
            return Integer.MAX_VALUE;
        else
            return s2.peek();
    }

}
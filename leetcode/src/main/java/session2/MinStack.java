package session2;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 02/09/19
 */
public class MinStack {

    /*
    Input
["MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"]
[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]
Output
[null,null,null,null,null,null,-1024,null,-1024,null,-1024]
Expected
[null,null,null,null,null,null,-1024,null,-1024,null,512]
     */
    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);

        minStack.pop();
        System.out.println(minStack.getMin());;    //  --> Returns 0.
        minStack.pop();
        System.out.println(minStack.getMin());;  // --> Returns -2.
        minStack.pop();
        System.out.println(minStack.getMin());
    }

    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (stack2.isEmpty() ||stack2.peek()>x ||stack2.peek()==x)
            stack2.push(x);
        stack1.push(x);
    }

    public void pop() {
        if (!stack1.isEmpty() && !stack2.isEmpty()){
            if (stack1.peek()>stack2.peek())
                stack1.pop();
            else if (stack1.peek().intValue()==stack2.peek().intValue()) {
                stack1.pop();
                stack2.pop();
            }
        }
        else throw new EmptyStackException();
    }

    public int top() {
        if (!stack1.isEmpty())
            return stack1.peek();
        else throw new EmptyStackException();
    }

    public int getMin() {
        return stack2.peek();
    }
}

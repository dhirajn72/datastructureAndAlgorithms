package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 04/09/19
 */
public class QueueUsingStack {

    /*
    ["MyQueue","push","push","peek","pop","empty"]
[[],[1],[2],[],[],[]]
     */
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty() && !stack1.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            return stack2.pop();
        }
        else
            return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stack2.isEmpty())
            return stack2.peek();
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.push(1);
        q.push(2);
        q.peek();
        q.pop();
        q.empty();

    }
}

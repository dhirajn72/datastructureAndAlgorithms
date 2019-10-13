package session2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 04/09/19
 */

/*
["MyStack","push","push","top","push","top"]
[[],[1],[2],[],[3],[]]

 */
public class StackUsingQueue {

    public static void main(String[] args) {
        StackUsingQueue s=new StackUsingQueue();
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        s.push(3);
        System.out.println(s.top());
    }

    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public void push(int x) {
        if (q1.isEmpty() && q2.isEmpty())
            q1.offer(x);
        else {
            if (!q1.isEmpty())
                q1.offer(x);
            else
                q2.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (!q1.isEmpty()){
            int size=q1.size();
            while (size-1!=0){
                q2.offer(q1.remove());
                size--;
            }
            return q1.remove();
        }
        else {
            int size=q2.size();
            while (size-1!=0){
                q1.offer(q2.remove());
                size--;
            }
            return q2.remove();
        }
    }

    /** Get the top element. */
    public int top() {
        if (q1.isEmpty() && !q2.isEmpty()){
            int size=q2.size();
            while (size-1!=0){
                q1.offer(q2.remove());
                size--;
            }
            return q2.peek();
        }
        else if (!q1.isEmpty() && q2.isEmpty()){
                int size=q1.size();
                while (size-1!=0){
                    q2.offer(q1.remove());
                    size--;
                }
            return q1.peek();
            }
        else {
            if (!q1.isEmpty()){
                int size=q1.size();
                while (size-1!=0){
                    q2.offer(q1.remove());
                    size--;
                }
            }
            return q1.peek();
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

package questions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class StackWithTwoQueues {

    private Queue<Integer> q1 = new LinkedList();
    private Queue<Integer> q2 = new LinkedList();

    public static void main(String[] args) {
        StackWithTwoQueues s = new StackWithTwoQueues();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);


    }

    public void push(int element) {
        if (q1.isEmpty()) q2.offer(element);
        else q1.offer(element);
    }

    public int pop() {
        int size = 0;
        int i = 0;
        if (q2.isEmpty()) {
            size = q1.size();
            while (i < size - 1) {
                q2.offer(q1.poll());
                i++;
            }
            return q1.poll();
        } else {
            size = q2.size();
            while (i < size - 1) {
                q1.offer(q2.poll());
                i++;
            }
            return q2.poll();
        }
    }

    @Override
    public String toString() {
        if (!q1.isEmpty()) return q1.toString();
        return q2.toString();
    }


}

package com.karumanchi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class SortKLengthOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(80);
        q.offer(23);
        q.offer(68);
        q.offer(25);
        q.offer(43);
        q.offer(64);
        q.offer(13);
        System.out.println(q);
        sortFirstKLengthOfQueue(q,3);
        System.out.println(q);


    }

    public static void sortFirstKLengthOfQueue(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> integers= new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < k; i++)
            stack.push(queue.remove());
        while (!queue.isEmpty())
            integers.offer(queue.remove());
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!s1.isEmpty() && s1.peek() <= temp)
                stack.push(s1.pop());
            s1.push(temp);
        }
        while (!s1.isEmpty())
            queue.offer(s1.pop());
        while (!integers.isEmpty())
            queue.offer(integers.remove());
    }
}

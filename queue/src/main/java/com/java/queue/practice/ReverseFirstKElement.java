package com.java.queue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class ReverseFirstKElement {
    public static Queue reverseKElements(Queue<Integer> q,int k){
        if (q==null || k>q.size())
            throw new IllegalArgumentException();
        Stack<Integer> s= new Stack<>();
        for (int i=0;i<k;i++){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.offer(s.pop());
        }
        for (int i=0;i<q.size()-k;i++)
            q.offer(q.remove());
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);
        System.out.println(q);
        System.out.println(reverseKElements(q,5)); //[5,4,3,2,1,6,7,8,9,10 ]
    }
}

package com.java.core;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 30/04/18
 */
public class Test10 {
    public static void main(String[] args) {
        Queue q= new PriorityQueue();
        q.add("test");
        q.offer("test2");
        System.out.println(q);
    }
}

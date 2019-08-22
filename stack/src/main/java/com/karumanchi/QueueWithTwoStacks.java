package com.karumanchi;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class QueueWithTwoStacks {

    private Stack<Integer> s1= new Stack<>();
    private Stack<Integer> s2= new Stack<>();
    public void add(int data){enqueue(data);}
    public void enqueue(int data){
        s1.push(data);
    }

    public int dequeue(){
        if (s2.isEmpty() && s1.empty())
            throw new EmptyStackException();
        if (!s2.isEmpty())
            return s2.pop();
        else {
            while (!s1.isEmpty())
                s2.push(s1.pop());
            return s2.pop();
        }
    }
    public int remove(){
        return dequeue();
    }

    @Override
    public String toString() {
        return "QueueWithTwoStacks{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }

    public static void main(String[] args) {

        QueueWithTwoStacks q= new QueueWithTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q);
        System.out.println("***");
        System.out.println(q.dequeue()); //1
        System.out.println(q.dequeue()); //2
        System.out.println(q);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q);
    }
}

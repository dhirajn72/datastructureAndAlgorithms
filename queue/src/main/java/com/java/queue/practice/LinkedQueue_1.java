package com.java.queue.practice;

import com.java.queue.ListNode;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class LinkedQueue_1 {
    private int size;
    private ListNode front;
    private ListNode rear;

    public void enque(int data){
        ListNode node= new ListNode(data);
        if (size()==0) {
            front = node;
            rear=front;
        }
        else
            rear.setNext(node);
        rear=node;
        size++;
    }
    public int size(){
        return size;
    }
    public int deque(){
        if (size()==0)return 0;
        int temp=front.getData();
        front=front.getNext();
        size--;
        if (size()==0)
            rear=null;
        return temp;
    }
    @Override
    public String toString() {
        return "LinkedQueue_1{" +
                "size=" + size +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

    public static void main(String[] args) {
        LinkedQueue_1 q= new LinkedQueue_1();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q);

    }

    public boolean isEmpty() {
        return size() == 0;
    }
}

package com.java.queue;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class LinkedQueue1 {

    private int length;
    private ListNode front,rear;


    public LinkedQueue1() {

    }

    public void enque(int data){
        ListNode node= new ListNode(data);
        if (isEmpty())
            front=node;
        else
            rear.setNext(node);
        rear=node;
        length++;
    }



    private boolean isEmpty() {
        return length==0;
    }

}

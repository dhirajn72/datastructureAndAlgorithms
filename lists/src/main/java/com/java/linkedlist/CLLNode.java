package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 24/04/18
 */
public class CLLNode {
    private int data;
    private CLLNode next;


    public CLLNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }
}

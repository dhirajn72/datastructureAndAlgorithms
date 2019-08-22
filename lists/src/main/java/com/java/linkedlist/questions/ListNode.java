package com.java.linkedlist.questions;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

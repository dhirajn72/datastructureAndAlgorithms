package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 02/03/18
 */
public class ListNode {

    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListNode node){
        //System.out.println("****in loop");
        this.next=node;
    }

    public ListNode getNext(){
        return this.next;
    }

    @Override
    public String toString() {
        return data +","+
                next ;
    }
}

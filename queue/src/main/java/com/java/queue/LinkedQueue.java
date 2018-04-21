package com.java.queue;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class LinkedQueue {
    private int length;
    private ListNode front,rear;

    public void enque(int data){
        ListNode node=new ListNode(data);
        if(isEmpty())
            front=node;
        else
            rear.setNext(node);
        rear=node;
        length++;
    }
    public int deque() throws Exception {
        if (isEmpty())
            throw new Exception("Queue");
        int data=front.getData();
        front=front.getNext();
        length--;
        if (isEmpty())
            rear=null;
        return data;
    }
    @Override
    public String toString() {
        String result="";
        ListNode currentNode=front;
        while (currentNode!=null){
            result=result+currentNode.getData()+"\n";
            currentNode=currentNode.getNext();
        }
        return result;
    }
    private boolean isEmpty() {
        return (length==0);
    }
    public int size(){
        return length;
    }
    public int first() throws Exception{
        if (isEmpty())
            throw new Exception("Empty Queue !");
        return front.getData();
    }
    public int last() throws Exception{
        if (isEmpty())
            throw new Exception("Empty Queue !");
        return rear.getData();
    }
}

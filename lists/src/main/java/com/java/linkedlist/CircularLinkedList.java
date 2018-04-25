package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 24/04/18
 */
public class CircularLinkedList {
    private int length;
    private CLLNode tail;


    public void add(int data){
        addToHead(data);
    }

    public void addToHead(int data) {
        CLLNode node=new CLLNode(data);
        if (tail==null){
            tail=node;
            tail.setNext(tail);
        }
        else {
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        length++;
    }

    public int size(){
        return length;
    }
    public void addToTail(int data){
        addToHead(data);
        tail=tail.getNext();
        length++;
    }
    public int removeFromTail(){
        int data=Integer.MIN_VALUE;
        if (isEmpty())
            return data;
        CLLNode finger=tail;
        while (finger.getNext()!=tail){
            finger=finger.getNext();
        }
        if (finger==tail){
            data=tail.getData();
            tail=null;
        }
        else {
            CLLNode temp=tail;
            finger.setNext(tail.getNext());
            tail=finger;
            data=temp.getData();
            temp.setNext(null);
            length--;
        }
        return data;
    }

    private boolean isEmpty() {
        return length==0;
    }

    @Override
    public String toString() {
        String result="[";
        if (tail==null)
            return result+"]";
        result=result+tail.getData();
        CLLNode temp=tail.getNext();
        while (temp!=tail){
            result=result+","+temp.getData();
            temp=temp.getNext();
        }

        return result+"]";
    }

    public int remove(int data){
        if (isEmpty())
            return Integer.MIN_VALUE;
        CLLNode finger=tail.getNext();
        CLLNode previous=tail;
        int compares;
        for(compares=0;compares<length && (!(finger.getData()==data));compares++){
            previous=finger;
            finger=finger.getNext();
        }
        if (finger.getData()==data){
            if (finger==tail.getNext()){
                tail=null;
            }
            else {
                if (finger==tail)
                    tail=previous;
                previous.setNext(previous.getNext().getNext());
            }
            finger.setNext(null);
            length--;
            return finger.getData();
        }
        return Integer.MIN_VALUE;
    }
    public boolean contains(int data){
        if (isEmpty())
            return Boolean.FALSE;
        CLLNode finger=tail.getNext();
        while (finger!=tail && (!(finger.getData()==data))){
            finger=finger.getNext();
        }
        return finger.getData()==data;
    }
}

package com.java.linkedlist.practice;

import com.java.linkedlist.CLLNode;

/**
 * @author Dhiraj
 * @date 28/04/18
 */
public class CircularLinkedList {
    private int length;
    private CLLNode tail;

    public void insertAtHead(int data){
        CLLNode node= new CLLNode(data);
        if (isEmpty()){
            tail=node;
            tail.setNext(tail);
        }
        else {
            CLLNode temp=tail.getNext();
            tail.setNext(node);
            node.setNext(temp);
        }
        length++;
    }
    private boolean isEmpty() {
        return this.length==0;
    }
    public int size(){
        return length;
    }
    @Override
    public String toString() {
        String result="";
        if (isEmpty()){
            return result;
        }
        CLLNode temp=tail.getNext();
        result=temp.getData()+",";
        while (temp!=tail){
            temp=temp.getNext();
            result=result+temp.getData()+",";
        }
        return result.substring(0, ((result.length()-1>0) ? result.length()-1 : 0));
    }
    public void insertAtTail(int data){
        CLLNode node=new CLLNode(data);
        if (isEmpty()){
            tail=node;
            tail.setNext(tail);
        }
        else {
            CLLNode temp=tail;
            while (temp.getNext()!=tail){
                temp=temp.getNext();
            }
            node.setNext(tail);
            tail=node;
            temp.setNext(tail);
        }
        length++;
    }
    public void insert(int data, int position){
        if (position<0)position=0;
        if (position>length)position=length;
        if (isEmpty() || position==0){
            insertAtHead(data);
            return;
        }
        else {
            CLLNode temp=tail.getNext(),prev=tail;
            for (int i=1;i<position;i++){
                prev=temp;
                temp=temp.getNext();
            }
            CLLNode node=new CLLNode(data);
            node.setNext(temp);
            prev.setNext(node);
        }
        length++;
    }
    public int removeHead()throws Exception{
        if (isEmpty())
            throw new Exception("Empty list !!");
        CLLNode temp=tail.getNext();
        if (temp==tail){
            tail=null;
            temp.setNext(null);
        }
        else {
            tail.setNext(temp.getNext());
            temp.setNext(null);
        }
        length--;
        return temp.getData();
    }
    public int removeTail()throws  Exception{
        if (isEmpty())
            throw new Exception("Empty list!!");
        CLLNode temp=tail;
        while (temp.getNext() !=tail){
            temp=temp.getNext();
        }
        temp.setNext(tail.getNext());
        CLLNode removed=tail;
        tail=temp;
        length--;
        if (size()==0)
            tail=null;
        return removed.getData();
    }

    public int remove(int position) throws  Exception{
        if (position<0)position=0;
        if (position>length)position=length;
        if (position==0)
            return removeHead();
        else {
            CLLNode temp=tail.getNext(),prev=tail;
            for (int i=1;i<position;i++){
                prev=temp;
                temp=temp.getNext();
            }
            CLLNode remove=tail;
            prev.setNext(temp.getNext());
            tail=prev;
            remove.setNext(null);
            length--;
            if (size()==0)
                tail=null;
            return remove.getData();
        }
    }
}
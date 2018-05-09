package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 08/05/18
 */
public class CircularLinkedList1 {
    private int length;
    private CLLNode tail;

    public void insertAtHead(int data){
        CLLNode node= new CLLNode(data);
        if (isEmpty()){
            tail=node;
            tail.setNext(tail);
        }
        else {
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        length++;
    }

    private boolean isEmpty() {
        return length==0;
    }

    public void insertAtTail(int data){
        CLLNode node= new CLLNode(data);
        if (isEmpty()){
            tail=node;
            tail.setNext(tail);
        }
        else {
            CLLNode temp=tail.getNext(),p=tail;
            while (temp!=tail){
                p=temp;
                temp=temp.getNext();
            }
            node.setNext(tail);
            tail=node;
            p.setNext(tail);
        }
        length++;
    }

    public void insert(int data,int position){
        if (position<0)position=0;
        if (position>length)position=length;
        if (isEmpty())insertAtHead(data);
        else {
            CLLNode temp=tail.getNext(),p=tail;
            for (int i=0;i<position;i++){
                p=temp;
                temp=temp.getNext();
            }
            CLLNode node= new CLLNode(data);
            p.setNext(node);
            node.setNext(temp);
            length++;
        }
    }

    public int removeHead() throws Exception{
        if (isEmpty())throw new Exception("Empty List!!");
        else {
            CLLNode temp=tail.getNext();
            tail.setNext(tail.getNext().getNext());
            temp.setNext(null);
            length--;
            if (isEmpty())tail=null;
            return temp.getData();
        }
    }

    public int removeTail()throws Exception{
        if (isEmpty())throw new Exception("Empty List!!");
        else {
            CLLNode temp=tail.getNext(),p=tail;
            while (temp!=tail){
                p=temp;
                temp=temp.getNext();
            }
            p.setNext(tail.getNext());
            tail=p;
            temp.setNext(null);
            length--;
            if (isEmpty())tail=null;
            return temp.getData();
        }
    }

    public int remove(int position)throws Exception{
        if (position<0)position=0;
        if (position>length)position=length;
        if (isEmpty())throw new Exception("Empty List!!");
        else {
            CLLNode temp=tail.getNext(),p=tail;
            for (int i=0;i<position;i++){
                p=temp;
                temp=temp.getNext();
            }
            p.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            if (isEmpty())tail=null;
            return temp.getData();
        }
    }

    @Override
    public String toString() {
        String result="";
        String tailData=String.valueOf(tail.getData());
        CLLNode temp=tail.getNext();
        while (temp!=tail){
            result=result+temp.getData()+",";
            temp=temp.getNext();
        }
        return result+tailData;
    }
}

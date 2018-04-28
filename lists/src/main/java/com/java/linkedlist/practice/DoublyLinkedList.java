package com.java.linkedlist.practice;

import com.java.linkedlist.DLLNode;

/**
 * @author Dhiraj
 * @date 28/04/18
 */
public class DoublyLinkedList {
    private int length;
    private DLLNode head;
    private DLLNode tail;

    public DoublyLinkedList() {
        head=new DLLNode(Integer.MIN_VALUE,null,null);
        tail= new DLLNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);
    }
    public void insertAtHead(int data){
        DLLNode node= new DLLNode(data);
        node.setNext(head.getNext());
        node.getNext().setPrev(node);
        node.setPrev(head);
        head.setNext(node);
        length++;
    }
    public void insertAtTail(int data){
        if (length==0){
            insertAtHead(data);
            return;
        }
        DLLNode node= new DLLNode(data);
        node.setPrev(tail.getPrev());
        node.getPrev().setNext(node);
        node.setNext(tail);
        node.getNext().setPrev(node);
        length++;
    }

    @Override
    public String toString() {
        String result="";
        DLLNode temp=head.getNext();
        while (temp!=null && temp!=tail){
            result=result+temp.getData()+",";
            temp=temp.getNext();
        }
        return result.substring(0,(((result.length()-1)>0) ? (result.length()-1) : 0));
    }
    public void insert(int data, int position){
        if (position<0)position=0;
        if (position>0)position=length;
        if (position==0){
            insertAtHead(data);
            return;
        }
        else{
            DLLNode temp=head;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            DLLNode node= new DLLNode(data);
            node.setNext(temp.getNext());
            node.getNext().setPrev(node);
            node.setPrev(temp);
            node.getPrev().setNext(node);
            length++;
        }
    }
    public int size(){
        return length;
    }
    public int removeHead() throws Exception{
        if (size()==0)
            throw new Exception("Empty list !!");
        DLLNode temp=head.getNext();
        head.setNext(temp.getNext());
        head.getNext().setPrev(head);
        temp.setPrev(null);
        temp.setNext(null);
        length--;
        return temp.getData();
    }
    public int removeTail()throws Exception{
        if (size()==0)
            throw new Exception("Empty list !!");
        DLLNode temp= tail.getPrev();
        tail.setPrev(temp.getPrev());
        temp.getPrev().setNext(tail);
        temp.setNext(null);
        temp.setPrev(null);
        length--;
        return temp.getData();
    }
    public int remove( int position) throws  Exception{
        if (size()==0)
            throw new Exception("Empty list !!");
        if (position<0)position=0;
        if (position>length)position=length;
        if (position==0){
            DLLNode temp= head.getNext();
            head.setNext(temp.getNext());
            head.getNext().setPrev(head);
            temp.setNext(null);
            temp.setPrev(null);
            length--;
            return temp.getData();
        }
        else{
            DLLNode temp=head.getNext();
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
            temp.setNext(null);
            temp.setPrev(null);
            length--;
            return temp.getData();
        }
    }
}

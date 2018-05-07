package com.java.linkedlist;


/**
 * @author Dhiraj
 * @date 07/05/18
 */
public class DoublyLinkedList1 {
    private int length;
    private DLLNode head;
    private DLLNode tail;

    public DoublyLinkedList1() {
        this.head = new DLLNode(Integer.MIN_VALUE,null,null);
        this.tail = new DLLNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);
    }

    public void insertAtHead(int data){
        DLLNode node= new DLLNode(data);
        if (isEmpty()){
            node.setPrev(head);
            node.setNext(node.getPrev().getNext());
            node.getPrev().setNext(node);
            node.getNext().setPrev(node);
        }
        else {
            node.setPrev(head);
            node.setNext(node.getPrev().getNext());
            node.getNext().setPrev(node);
            node.getPrev().setNext(node);
        }
        length++;
    }

    private boolean isEmpty() {
        return length==0;
    }

    public void insertAtTail(int data){
        DLLNode node= new DLLNode(data);
        node.setPrev(tail.getPrev());
        node.setNext(tail);
        node.getPrev().setNext(node);
        node.getNext().setPrev(node);
        length++;
    }

    public void insert(int data,int position){
        if (position<0)position=0;
        if (position>length)position=length;
        if (position==0){
            insertAtHead(data);
        }else {
            DLLNode p=head;
            for (int i=0;i<position;i++){
                p=p.getNext();
            }
            DLLNode node= new DLLNode(data);
            node.setPrev(p);
            node.setNext(node.getPrev().getNext());
            node.getPrev().setNext(node);
            node.getNext().setPrev(node);
            length++;
        }
    }

    public int removeHead() throws Exception{
        if (isEmpty())throw new Exception("Empty List!!");
        else {
            DLLNode temp=head.getNext();
            head.setNext(head.getNext().getNext());
            head.getNext().setPrev(head);
            temp.setPrev(null);
            temp.setNext(null);
            length--;
            return temp.getData();
        }
    }

    public int removeTail()throws Exception{
        if (isEmpty())throw new Exception("Empty List !!");
        else {
            DLLNode temp=tail.getPrev();
            tail.setPrev(tail.getPrev().getPrev());
            tail.getPrev().setNext(tail);
            temp.setNext(null);
            temp.setPrev(null);
            length--;
            return temp.getData();
        }
    }
    public int remove(int position) throws Exception{
        if (position<0)position=0;
        if (position>length)position=length;

        if (isEmpty())throw new Exception("Empty List !!");
        if (position==0){
            return removeHead();
        }
        else {
            DLLNode p=head,q=null;
            for (int i=0;i<position;i++){
                p=p.getNext();
            }
            q=p.getNext();
            p.setNext(p.getNext().getNext());
            p.getNext().setPrev(p);
            q.setNext(null);
            q.setPrev(null);
            length--;
            return q.getData();
        }
    }

    @Override
    public String toString() {
        String result="";
        DLLNode temp=head.getNext();
        while (temp!=tail){
            result=result+temp.getData()+",";
            temp=temp.getNext();
        }
        return result;
    }
}

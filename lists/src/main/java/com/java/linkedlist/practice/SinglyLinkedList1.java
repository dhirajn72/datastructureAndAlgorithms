package com.java.linkedlist.practice;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class SinglyLinkedList1 {

    private int length;
    private ListNode head;

    public void insertAtHead(int data){
        ListNode node= new ListNode(data);
        if (isEmpty()){
            head=node;
        }
        else{
            node.setNext(head);
            head=node;
        }
        length++;
    }
    private boolean isEmpty() {
        return length==0;
    }
    @Override
    public String toString() {
        ListNode temp=head;
        String result="";
        while (temp!=null){
            result=result+temp.getData()+",";
            temp=temp.getNext();
        }
        return result.substring(0,(  ( (result.length()-1)>0 ) ? (result.length()-1) : 0 ));
    }
    public void insertAtTail(int data){
        if (isEmpty()){
            head=new ListNode(data);
        }
        else {
            ListNode p,q=null;
            for (p=head;  (q=p.getNext())!=null; p=q );
            p.setNext(new ListNode(data));
        }
        length++;
    }
    public void insert(int data, int position){

        if (position<0)position=0;
        if (position>length)position=length;
        if (head==null) head= new ListNode(data);
        if (position==0){
            ListNode node= new ListNode(data);
            node.setNext(head);
            head=node;
        }
        else {
            //Commented code is my another
            // logic which performs the same
            /*ListNode p=head,q=p.getNext();
            for (int i=1;i<position;i++){
                if (q!=null){
                    p=q;
                    q=p.getNext();
                }
            }
            ListNode node= new ListNode(data);
            node.setNext(q);
            p.setNext(node);*/
            ListNode temp=head;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode node=new ListNode(data);
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        length++;
    }
    public  int removeHead() throws Exception{
        if (isEmpty())
            throw new Exception("Empty List !!");
        ListNode temp=head;
        head=head.getNext();
        length--;
        return temp.getData();
    }
    public int removeTail() throws Exception{
        if (isEmpty())
            throw new Exception("Empty List !!");
        ListNode p=head,q=null,prev=head;
        while (  (q=p.getNext())!=null ){
            prev=p;
            p=q;
        }
        prev.setNext(null);
        length--;
        if (length==0){
            head=null;
        }
        return p.getData();
    }
    public int remove(int position) throws Exception{
        if (isEmpty())
            throw new Exception("Empty list !!!");
        if (position<0)position=0;
        if (position>length)position=length-1;
        if (position==0){
            ListNode temp=head;
            head=head.getNext();
            length--;
            return temp.getData();
        }
        ListNode temp=head,prev=null;
        for (int i=0;i<position;i++){
            prev=temp;
            temp= temp.getNext();
        }
        prev.setNext(null);
        length--;
        return temp.getData();
    }
    public void removeMatched(int data) throws Exception {
        if (isEmpty())
            throw new Exception("Empty list !!!");
        ListNode temp = head, prev = head;
        for (int i = 0; i < length; i++) {
            if (temp!=null) {
                if (temp.getData() == data) {
                    if (temp == head) {
                        head = temp.getNext();
                        temp = prev = head;
                    } else {
                        prev.setNext(temp.getNext());
                        temp.setNext(null);
                        length--;
                        temp = prev.getNext();
                    }
                } else {
                    prev = temp;
                    temp = temp.getNext();
                }
            }
        }
    }
}
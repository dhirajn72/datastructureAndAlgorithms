package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 24/03/18
 */
public class SinglyLinkedList2 {
    private int length;
    private ListNode head;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void insertAtEnd(int data){
        if(head==null){
            head= new ListNode(data);
        }
        else{
            ListNode p,q=null,next;
            for (p=head;(next=p.getNext())!=null;p=next);
            p.setNext(new ListNode(data));
        }
        length++;
    }
    public void insertAtBeginning(ListNode node){
        if (head==null){
            ListNode  newNode= new ListNode(node.getData());
            head=newNode;
        }
        else{
            ListNode newNode= new ListNode(node.getData());
            newNode.setNext(head);
            head=newNode;
        }
        length++;
    }

    public void print(){
        ListNode temp=head;
        while (temp!=null){
            System.out.print (temp.getData()+" ");
            temp=temp.getNext();
        }
    }

    public void insert(int data, int position){
        if(position<0){
            position=0;
        }
        if (position>length){
            position=length;
        }
        if (head==null){
            head= new ListNode(data);
        }
        if (position==0){
            ListNode temp=head;
            ListNode newNode= new ListNode(data);
            newNode.setNext(head);
            head=newNode;
        }
        else{
            ListNode temp=head;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode newNode= new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

}

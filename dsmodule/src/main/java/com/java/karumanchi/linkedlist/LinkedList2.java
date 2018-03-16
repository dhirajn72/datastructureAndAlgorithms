package com.java.karumanchi.linkedlist;

/**
 * @author Dhiraj
 * @date 16/03/18
 */
public class LinkedList2 {
    private int length;
    private  ListNode head;

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
    public void insertAtBeginning(ListNode node){
        if (head==null){
            head=new ListNode(node.getData());
        }
        else {
            ListNode temp=node;
            temp.setNext(head);
            head=temp;
        }
        length++;
    }

    public void print(){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.getData() +" ");
            temp=temp.getNext();
        }
        System.out.println();
    }

    public void insert(ListNode node, int position){

        if(head==null){
            head=new ListNode(node.getData());
        }
        if (position<0){
            position=0;
        }
        if (position>length){
         ListNode p,q;
         for(p=head;(q=p.getNext())!=null;p=q);
         p.setNext(new ListNode(node.getData()));
        }
        else if (position==0){
            ListNode temp=head;
            node.setNext(head);
            head=node;
        }
        else {
            ListNode temp=head,prev=null;
            for(int i=1;i<position;i++){
                prev=temp;
                temp=temp.getNext();
            }
            ListNode newNode=new ListNode(node.getData());
            newNode.setNext(temp);
            temp=newNode;
            prev.setNext(newNode);
        }
        length++;
    }
}

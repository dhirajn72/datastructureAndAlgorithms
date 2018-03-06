package com.java.karumanchi.linkedlist;

/**
 *
 * @author Dhiraj
 * @date 02/03/18
 */

public class LinkedList {

    private int length;
    private ListNode head;

    public LinkedList() {
        length=0;
    }

    public synchronized  void insertAtBeginning(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }

    public ListNode getHead() {
        return this.head;
    }

    public void print(){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+", ");
            if(temp.getNext()==null) {
                break;
            }
            temp=temp.getNext();
        }
    }

    public synchronized void insertAtEnd(ListNode node){
        if(head==null) {
            head=node;
        }
        else{
            ListNode p,q;
            for(p=head;(q=p.getNext())!=null;p=q);
            p.setNext(node);
            length++;
        }
    }

    public synchronized  void insert(int data, int position){
        int pos = ((position<0) ? 0 : ((position>length)? length : position));
        if (head==null){
            head=new ListNode(data);
        }
        else if(pos==0){
            ListNode temp= new ListNode(data);
            temp.setNext(head);
            head=temp;
        }






    }




}

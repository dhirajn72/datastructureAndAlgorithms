package com.java.karumanchi.linkedlist;

/**
 * @author Dhiraj
 * @date 14/03/18
 */
public class LinkedList1 {
    private int length=0;
    private ListNode head;

    public void insertAtBeginning(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }

    public void insertAtEnd(ListNode node){
        if (head==null){
            head=node;
        }
        else{
            ListNode p,q;
            for(p=head;(q=p.getNext())!=null ;p=q);
                p.setNext(node);
        }
        length++;
    }

    public void insert(int data, int position) {

        if (position<0){
            position=0;
        }
        if(position>length){
            position=length;
        }
        if (head==null){
            head= new ListNode(data);
        }
        else if(position==0){
            ListNode newNode = new ListNode(data);
            newNode.setNext(head);
            head=newNode;

        }
        else{
            ListNode temp= head;
            for(int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode newNode= new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    public  void print(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public ListNode getHead(){
        return head;
    }
}

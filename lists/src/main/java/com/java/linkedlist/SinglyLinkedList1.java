package com.java.linkedlist;


/**
 * @author Dhiraj
 * @date 17/03/18
 */
public class SinglyLinkedList1 {
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

    public void insertAtBeginning(ListNode node) {
        if (head==null){
            head=new ListNode(node.getData());
        }
        else{
            ListNode temp=head;
            //ListNode  newNode= new ListNode(node.getData());
            ListNode  newNode= node;
            newNode.setNext(temp);
            head=newNode;
        }
        length++;
    }
    public void insertAtEnd(ListNode node) {
        if (head==null){
            head= new ListNode(node.getData());
        }
        else {
            ListNode p=head,q;
            while ((q=p.getNext())!=null){
                p=q;
            }
            p.setNext(new ListNode(node.getData()));
            length++;
        }
    }
    public void insert(ListNode node,int position) {
        if (position<0){
            position=0;
        }
        if (position>length){
            position=length;
        }
        if (position==0){
            ListNode temp= new ListNode(node.getData());
            temp.setNext(head);
            head=temp;
        }
        else {
            ListNode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(node.getData());
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;

    }

    public void print(){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }

    public int getPosition(int data) {
        if (head==null){
            return 0;
        }
        ListNode temp=head;
        int pos=0;
        while (temp!=null){
            if(temp.getData()==data){
                return pos;
            }
            pos++;
            temp=temp.getNext();

        }
        return Integer.MIN_VALUE;
    }
    public ListNode removeFirst(){
        if (head==null){
            return head;
        }
        ListNode p=head,next=head.getNext();
        if (next==null){
            head=null;
            return p;
        }
        else{
            ListNode temp=head;
            head=temp.getNext();
            temp.setNext(null);
            return temp;
        }
    }

    public ListNode removeLast(){
        if (head==null){
            return head;
        }
        else{
            ListNode p=head,q=null,next=head.getNext();
            while ((next=p.getNext())!=null){
                q=p;
                p=next;
            }
            q.setNext(null);
            return p;
        }
    }public ListNode removeMatched(ListNode node){
        if (head==null || node==null){
            return head;
        }
        else{
            ListNode p=head,q=null;
            while ((q=p.getNext())!=null){
                if (q.equals(node)){
                    p.setNext(q.getNext());
                    q.setNext(null);
                    return q;
                }
                p=q;
            }
        }
        return null;
    }
}

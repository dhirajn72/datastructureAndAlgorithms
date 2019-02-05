package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 17/03/18
 */
public class SinglyLinkedList {
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

    public  void insertAtBeginning(ListNode node){
        if (head==null){
            head= new ListNode(node.getData());
        }
        else{
            ListNode temp=head;
            node.setNext(temp);
            head=node;
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

    public void insert(ListNode node, int position){
        if(head==null){
            head=new ListNode(node.getData());
        }
        if (position<0){
            position=0;
        }
        if(position>length){
            position=length;
        }
        else if(position==0){
            ListNode firstNode= new ListNode(node.getData());
            firstNode.setNext(head);
            head=firstNode;
        }
        else{
            ListNode temp=head;
            for(int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode newNode= new ListNode(node.getData());
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    /**
     *
     *
     * @param data
     * @return
     */
    public int getPosition(int data){
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
    public ListNode removeFromBeginning(){
        if(head==null){
            return  null;
        }
        else{
            ListNode temp=head;
            head=temp.getNext();
            temp.setNext(null);
            return temp;

        }
    }

    /**
     *
     *
     * @return
     */
    public ListNode removeMatched(ListNode node){
        if (head==null){
            return null;
        }
        ListNode p=head,q=null;
        while ((q=p.getNext())!=null){
            if (node.equals(q)){
                p.setNext(q.getNext());
                return q;
            }
            p=q;
        }
        return  null;
    }

    /**
     *
     *
     * @return
     */
    public ListNode removeFromEnd() {
        if(head==null){
            return  null;
        }
        ListNode p=head,q=null,next=head.getNext();
        if (next==null){
            head=null;
            return p;
        }
        while ((next=p.getNext())!=null){
            q=p;
            p=next;
        }
        q.setNext(null);
        return  p;
    }


    public ListNode remove(int position){
        if (position<0)position=0;
        if (position>length)position=length-1;
        if (head==null){
            return null;
        }

        if (position==0){
            ListNode removedNode=head;
            head=head.getNext();
            length--;
            return removedNode;

        }
        else{
            ListNode temp=head;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode removedNode=temp.getNext();
            temp.setNext(temp.getNext().getNext());
            length--;
            return removedNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        list.insertAtBeginning(new ListNode(10));
        list.insertAtBeginning(new ListNode(20));
        list.insertAtBeginning(new ListNode(30));
        list.insertAtBeginning(new ListNode(40));
        list.insertAtBeginning(new ListNode(50));
        list.insertAtBeginning(new ListNode(60));
        list.print();
        list.printInReverseOrder(list.getHead());

    }

    public void printInReverseOrder(ListNode list){
        if (list==null)
            return;
        printInReverseOrder(list.getNext());
        System.out.print(list.getData()+" ");
    }
}

package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class DoublyLinkedList {

    private int length;
    private DLLNode head;
    private DLLNode tail;

    public DoublyLinkedList() {
        head= new DLLNode(Integer.MIN_VALUE,null,null);
        tail= new DLLNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);
        length=0;
    }
    public void insertAtBeginning(int data){
        DLLNode node= new DLLNode(data,head,head.getNext());
        node.getNext().setPrev(node);
        head.setNext(node);
        length++;
    }
    public void insert(int data, int position){
        if (position<0)position=0;
        if (position>length)position=length;
        if (head==null){
            head=new DLLNode(data);
            tail=head;// !TODO  Why this? Because, if there's only one element, tail has to point to head
        }
        else if (position==0){
            DLLNode temp= new DLLNode(data);
            temp.setNext(head.getNext());
            temp.getNext().setPrev(temp);
            temp.setPrev(head);
            head.setNext(temp);
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
            temp.setNext(node);
        }
        length++;
    }
    public void insertAtEnd(int data){
        DLLNode node= new DLLNode(data,tail.getPrev(),tail);
        node.getPrev().setNext(node);
        tail.setPrev(node);
        length++;
    }
    public int remove(int position){
        int removedElement=0;
        if (position<0)position=0;
        if (position>length)position=length;

        if (head==null)return 0;
        if (position==0){
            head=head.getNext();
            if (head==null)
                tail=null;
        }
        else {
            DLLNode temp=head;
            for (int i=0;i<position;i++){
                temp=temp.getNext();
            }
            temp.getNext().setPrev(temp.getPrev());
            temp.getPrev().setNext(temp.getNext());
            removedElement=temp.getData();
            temp.setPrev(null);
            temp.setNext(null);
            length--;
        }
        return removedElement;
    }
    private boolean isEmpty() {
        return length==0;
    }
    @Override
    public String toString() {
        String result="[]";
        if (length==0)
            return result;
        result="["+head.getNext().getData();
        DLLNode temp=head.getNext().getNext();
        while (temp!=tail){
            result+=","+temp.getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
    public int size(){
        return length;
    }

    public int getPosition(int data){
        DLLNode temp= head.getNext();
        int position=0;
        while (temp!=null){
            if (temp.getData()==data)
                return position;
            position++;
            temp=temp.getNext();
        }
        return Integer.MIN_VALUE;

    }
}

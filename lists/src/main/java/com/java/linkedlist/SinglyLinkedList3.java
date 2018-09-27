package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 20/06/18
 */
public class SinglyLinkedList3 {
    private int length;
    private ListNode root;

    public void insertAtBeginning(int data){
        if (length==0)
            root=new ListNode(data);
        else {
            ListNode node= new ListNode(data);
            node.setNext(root);
            root=node;
        }
        length++;
    }
    public void print(){
        ListNode p=root;
        while (p!=null){
            System.out.print(p.getData()+" ");
            p=p.getNext();
        }
    }
    public void insertAtEnd(int data){
        if (length==0)
            root=new ListNode(data);
        else {
            ListNode p=root,q;
            for (int i=0;((q=p.getNext())!=null);p=q);
            p.setNext(new ListNode(data));
            }
        length++;
    }



}

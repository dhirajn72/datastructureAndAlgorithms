package com.java.core;

import com.java.algorithms.ListNode;

/**
 * @author Dhiraj
 * @date 11/05/19
 */
public class LinkedList {
    private ListNode root;
    private int length;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /*list.insertAtHead(10);
        list.insertAtHead(15);
        list.insertAtHead(20);
        list.insertAtHead(25);*/
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(15);
        list.insertAtHead(25);
        list.insertAtTail(100);
        list.insertAtTail(200);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Deleted:: "+list.remove(6));
        System.out.println(list);
        System.out.println(list.size());


    }

    public void insertAtHead(int data) {
        if (root == null)
            root = new ListNode(data);
        else {
            ListNode node = new ListNode(data);
            node.setNext(root);
            root = node;
        }
        length++;
    }

    public void insertAtTail(int data){
        if (root==null)
            root=new ListNode(data);
        add(data);
    }

    public void add(int data) {
        if (root == null)
            root = new ListNode(data);
        else {
            ListNode q, p;
            for (p = root; null != (q = p.getNext()); p = q) ;
            p.setNext(new ListNode(data));
        }
        length++;
    }
    public int size(){
        return length;
    }

    public int remove(int index){
        if (index>length || index==0 || index<0)
            throw new IllegalArgumentException(" Index is not valid !");
        if (root==null) throw new IllegalArgumentException(" No elements to delete from list !");
        if (index==1){
            ListNode removed=root;
            root=root.getNext();
            removed.setNext(null);
            length--;
            return removed.getData();
        }
        else {
            /*ListNode p,q,prev=null;
            int count=1;
            for (p=root;null!=(q=p.getNext()) && count<index;p=q){
                prev=p;
                count++;
            }
            prev.setNext(p.getNext());
            p.setNext(null);
            length--;
            return p.getData();*/

            ListNode p=root;
            for (int i=1;i<index;i++){
                p=p.getNext();
            }
            p.setNext(p.getNext().getNext());
            length--;
            return p.getData();



        }
    }



    @Override
    public String toString() {
        return root.toString();
    }


}

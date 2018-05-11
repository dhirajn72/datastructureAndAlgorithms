package com.java.linkedlist.practice;

import com.java.linkedlist.ListNode;

import java.util.HashSet;

/**
 * @author Dhiraj
 * @date 07/05/18
 */
public class SinglyLinkedList2 {
    private int length;
    private ListNode root;


    public void insertAtHead(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            root = node;
        } else {
            node.setNext(root);
            root = node;
        }
        length++;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public void insertAtTail(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            root = node;
        } else {
            ListNode p = root, q = null;
            while ((q = p.getNext()) != null) {
                p = q;
            }
            p.setNext(node);
        }
        length++;
    }

    public void insert(int data, int position) {
        ListNode node = new ListNode(data);
        if (position < 0) position = 0;
        if (position > length) position = length;
        if (position == 0) {

            node.setNext(root);
            root = node;
        }
        if (isEmpty()) {
            root = node;
        } else {
            ListNode temp = root, q = null;
            for (int i = 0; i < position; i++) {
                q = temp;
                temp = temp.getNext();
            }
            node.setNext(q.getNext());
            q.setNext(node);
        }
        length++;
    }

    public int removeFromHead() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty List !!");
        } else {
            ListNode temp = root;
            root = root.getNext();
            length--;
            return temp.getData();
        }
    }

    public int removeFromTail() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty List !!");
        } else {
            ListNode temp = root, q = null, p = null;
            while ((q = temp.getNext()) != null) {
                p = temp;
                temp = q;
            }
            p.setNext(null);
            length--;
            return temp.getData();
        }
    }

    public ListNode getRoot() {
        return root;
    }

    public int remove(int position) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty List !!");
        }
        if (position < 0) position = 0;
        if (position > length) position = length;
        if (position == 0) {
            ListNode temp = root;
            root = root.getNext();
            temp.setNext(null);
            length--;
            return temp.getData();
        } else {
            ListNode temp = root, q = null;
            for (int i = 1; i < position; i++) {
                q = temp;
                temp = temp.getNext();
            }
            q.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            return temp.getData();
        }
    }

    /*@Override
    public String toString() {
        String result = "";
        ListNode temp = root;
        while (temp != null) {
            result = result + temp.getData() + ",";
            temp = temp.getNext();
            System.out.println("In loop:::::");
        }
        return result;
    }*/

    public int findNthNodeFromEnd(int index) throws Exception{
        if (index<0)throw new Exception("Negative index");
        if (index>length)throw new Exception("Index Not found!");
        else {
            int indexOfElement=length-index;
            ListNode temp= root;
            for (int i=0;i<indexOfElement;i++){
                temp=temp.getNext();
            }
            return temp.getData();
        }
    }

    public boolean detectLoop(ListNode list) {
        ListNode node=list;
        HashSet<ListNode> nodes= new HashSet<>();
        while (node!=null){
            if (nodes.contains(node))
                return true;
            nodes.add(node);
            node=node.getNext();
        }
        return  false;
    }
}

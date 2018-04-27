package com.java.linkedlist.practice;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 21/04/18
 */
public class SinglyLinkedList {
    private int length;
    private ListNode root;

    public void insertAtBeginning(int data){
        ListNode node= new ListNode(data);
        node.setNext(root);
        root=node;
        length++;
    }
    private boolean isEmpty() {
        return length==0;
    }
    public void insertAtEnd(int data){
        if (root==null){
            root=new ListNode(data);
        }
        else {
            //using while loop
            ListNode prev=root,temp;
            while ((temp=prev.getNext())!=null){
                prev=temp;
            }
            prev.setNext(new ListNode(data));

            //using for loop
           /* ListNode prev,temp;
            for (prev=root ; ((temp=prev.getNext())!=null);prev=temp);
            prev.setNext(new ListNode(data));*/
            length++;
        }
    }
    public void insert(int data, int position){
        if (position<0)position=0;
        if (position>length)position=length;
        if (root==null)root=new ListNode(data);
        else if (position==0){
            ListNode node= new ListNode(data);
            node.setNext(root);
            root=node;
        }
        else {
            ListNode temp=root;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNode node= new ListNode(data);
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        length++;
    }
    @Override
    public String toString() {
        String result="";
        ListNode currentNode=root;
        while (currentNode!=null){
            result=result+currentNode.getData()+"\n";
            currentNode=currentNode.getNext();
        }
        return result;
    }
    public int removeFromBeginning() throws Exception{
        if (isEmpty())
            throw new Exception("No elements available");
        ListNode node = root;
        int removedData=node.getData();
        root=node.getNext();
        length--;
        return removedData;
    }
    public int removeFromEnd() throws Exception{
        if (isEmpty())
            throw new Exception("No elements available");
        ListNode p=root,q=null,temp=root.getNext();
        if (temp==null){
            root=null;
            return p.getData();
        }
        while ((temp=p.getNext())!=null ){
            q=p;
            p=temp;
        }
        q.setNext(null);
        return p.getData();
    }
}
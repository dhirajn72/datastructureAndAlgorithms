package com.java.linkedlist;

import java.util.Objects;

/**
 * @author Dhiraj
 * @date 04/10/18
 */
public class SinglyLinkedList5 {
    private int length;
    private ListNode root;

    public void insertAtBeginning(ListNode node) {
        if (Objects.nonNull(root)) {
            node.setNext(root);
            root = node;
        } else {
            root = node;
        }
        length++;
    }

    public void insertAtEnd(ListNode node){
        if (Objects.nonNull(root)){
            ListNode currentNode=root;
            while (currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        else {
            root=node;
        }
        length++;
    }

    @Override
    public String toString() {
        if (root==null)return "[]";
        ListNode currentNode=root;
        StringBuilder builder= new StringBuilder("[");
        while (currentNode!=null){
            builder.append(currentNode.getData()).append(",");
            currentNode=currentNode.getNext();
        }
        builder.append("]").deleteCharAt(builder.length()-2);
        return builder.toString();
    }

    public void insert(int position,ListNode node){
        if (position<0)
            position=0;
        if (position>length)
            position=length;
        if (position==0){
            node.setNext(root);
            root=node;
        }
        else {
            ListNode currentNode=root;
            for (int i=1;i<position;i++){
                currentNode=currentNode.getNext();
            }
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
        }
        length++;
    }

    public ListNode removeFromBeginning(){
        if (root==null)return null;
        else {
            ListNode rem=root;
            root=root.getNext();
            rem.setNext(null);
            length--;
            return rem;
        }
    }

    public ListNode removeFromEnd(){
        if (root==null)return null;
        else {
            ListNode p=root,q,temp=p;
            while ((q=p.getNext())!=null){
                temp=p;
                p=q;
            }
            temp.setNext(null);
            length--;
            return p;
        }
    }

    public ListNode remove(int index){
        if (index<0||index>length)throw new IllegalArgumentException("Size:"+length+" Index:"+index);
        if (index==0)
            return removeFromBeginning();
        else {
            ListNode p=root,q=p;
            for (int i=0;i<index;i++){
                q=p;
                p=p.getNext();
            }
            q.setNext(q.getNext().getNext());
            p.setNext(null);
            length--;
            return p;
        }

    }
    public static void main(String[] args) {
        SinglyLinkedList5 list= new SinglyLinkedList5();
        list.insertAtBeginning(new ListNode(10));
        list.insertAtEnd(new ListNode(20));
        list.insertAtBeginning(new ListNode(40));
        list.insertAtEnd(new ListNode(50));
        System.out.println(list);
        list.insert(2,new ListNode(100));
        System.out.println(list); // 40,10,20,50
        System.out.println(list.removeFromBeginning().getData());
        System.out.println(list);
        System.out.println(list.removeFromEnd().getData());
        System.out.println(list);
        System.out.println(list.remove(2).getData());
        System.out.println(list);
    }


}

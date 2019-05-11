package com.java.algorithms;

import java.util.Objects;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class LinkedList {
    int length = 0;
    private ListNode root;

    public void add(int data) {
        if (Objects.nonNull(root)) {
            ListNode p,q;
            for (p=root; null!=(q=p.getNext());p=q);
            p.setNext(new ListNode(data));
            length++;
        } else {
            root = new ListNode(data);
            length++;
        }
    }

    public int size(){
        return length;
    }

    @Override
    public String toString() {
        if (root==null) return "[]";
        ListNode current=root;
        StringBuilder builder= new StringBuilder("[");
        while (current!=null){
            builder.append(current.getData())
                    .append(",");
            current=current.getNext();
        }
        builder.delete(builder.length()-1,builder.length()).append("]");
        return builder.toString();
    }

    //TODO! Remove me !
    public ListNode getRoot() {
        return root;
    }

    public void setRoot(ListNode root) {
        this.root = root;
    }
}

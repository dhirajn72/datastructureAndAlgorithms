package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class InsertInSortedList {

    public ListNode insertInSortedList(ListNode root,ListNode node){
        if (root==null)
            return root=node;
        else {
            ListNode p=root,q=null;
            while (p!=null&& p.getData()<node.getData()){
                q=p;
                p=p.getNext();
            }
            if (p!=null && node.getData()<p.getData()){
                node.setNext(root);
                root=node;
                return root;
            }
            node.setNext(q.getNext());
            q.setNext(node);
        }
        return root;
    }
}

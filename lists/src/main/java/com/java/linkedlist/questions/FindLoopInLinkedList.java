package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

import java.util.HashSet;

/**
 * @author Dhiraj
 * @date 09/05/18
 */
public class FindLoopInLinkedList {

    public boolean loopExists(ListNode root) {
        ListNode temp = root;
        HashSet<ListNode> nodes = new HashSet<>();
        while (temp != null) {
            if (nodes.contains(temp))
                return true;
            nodes.add(temp);
            temp = temp.getNext();
        }
        return true;
    }
}

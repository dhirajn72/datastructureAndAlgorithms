package com.java.linkedlist.questions;

import java.util.HashSet;

/**
 * @author Dhiraj
 * @date 09/05/18
 */
public class LinkedList {

        static Node head;
        static class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }
        static public void push(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
        static boolean detectLoop(Node h)
        {
            HashSet<Node> s = new HashSet<Node>();
            while (h != null)
            {
                if (s.contains(h))
                    return true;
                s.add(h);
                h = h.next;
            }
            return false;
        }
        public static void main(String[] args)
        {
            LinkedList llist = new LinkedList();
            push(20);
            push(4);
            push(15);
            push(10);

            head.next.next.next.next = head;
            if (detectLoop(head))
                System.out.println("Loop found");
            else
                System.out.println("No Loop");
        }
    }


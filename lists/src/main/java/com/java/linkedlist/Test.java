package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 28/02/18
 */
 class LinkedList{

    private Node head;

    static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+",");
            temp = temp.next;
        }
        System.out.println();
    }

    // This function will find middle element in linkedlist
    public int findMiddleElement(Node head)
    {
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer.value;

    }


}

public class Test{

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Creating a linked list
        LinkedList.Node head=new LinkedList.Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new LinkedList.Node(6));
        list.addToTheLast(new LinkedList.Node(7));
        list.addToTheLast(new LinkedList.Node(1));
        list.addToTheLast(new LinkedList.Node(2));
        list.addToTheLast(new LinkedList.Node(5));
        //list.addToTheLast(new Node(9));



        list.printList();
        // finding middle element
        int middle= list.findMiddleElement(head);
        System.out.println("Middle node will be: "+ middle);

    }
}




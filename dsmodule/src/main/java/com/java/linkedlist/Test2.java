package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 28/02/18
 */
class LinkedList_1{

    private Node head;

    public void addToLast(Node node){
        if (head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=node;
        }
    }
    public void printValues(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
    }
    public int findMiddleElement(){
        Node slowPtr,fastPtr;
        slowPtr=fastPtr=head;

        while (fastPtr!=null){
            fastPtr=fastPtr.next;
            if (fastPtr!=null && fastPtr.next!=null){
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next;
            }
        }
        return slowPtr.value;
    }

    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        LinkedList_1 head=new LinkedList_1();
        head.addToLast(new LinkedList_1.Node(34));
        head.addToLast(new LinkedList_1.Node(12));
        head.addToLast(new LinkedList_1.Node(67));
        head.printValues();
        System.out.println("Middle element is: "+head.findMiddleElement());
    }
}
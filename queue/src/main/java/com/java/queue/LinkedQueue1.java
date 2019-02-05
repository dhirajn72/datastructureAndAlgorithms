package com.java.queue;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class LinkedQueue1 {

    private int length;
    private ListNode front,rear;

    public void enque(int data){
        ListNode node= new ListNode(data);
        if (isEmpty()) {
            front = node;
        }
        else {
            rear.setNext(node);
        }
        rear=node;
        length++;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        ListNode temp=front;
        while (temp!=null){
            builder.append(temp.getData())
                    .append(",");
            temp=temp.getNext();
        }
        return isEmpty()?"Empty Queue": builder.delete(builder.length()-1,builder.length()).toString();
    }

    private boolean isEmpty() {
        return length==0;
    }


    public static void main(String[] args) {
        LinkedQueue1 queue=new LinkedQueue1();
        queue.enque(50);
        queue.enque(60);
        queue.enque(30);

        System.out.println(queue);
    }

}

package cci;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 27/06/19
 */
public class LinkedQueue {
    private int size;
    private ListNode front;
    private ListNode rear;

    public void enqueue(int data){
        if (front==null && rear==null) {
            front =rear= new ListNode(data);
        }
        else {
            ListNode node= new ListNode(data);
            rear.setNext(node);
            rear=node;
        }
        size++;
    }

    public int dequeue(){
        if (size()==0)
            throw  new IllegalArgumentException("Empty stack !");
        else {
            ListNode node= front;
            front=front.getNext();
            node.setNext(null);
            size--;
            if (size==0)front=rear=null;
            return node.getData();
        }
    }

    public boolean isEmpty(){
        return size()==0;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder("[");
        if (size()==0){builder.append("]");return builder.toString();};
        ListNode temp=front;
        while (temp!=null){
            builder.append(temp.getData()).append(",");
            temp=temp.getNext();
        }
        builder.append("]");
        builder.delete(builder.length()-2,builder.length()-1);
        return builder.toString();
    }

    public static void main(String[] args) {
        LinkedQueue queue= new LinkedQueue();
        queue.enqueue(89);
        queue.enqueue(45);
        queue.enqueue(67);
        queue.enqueue(23);
        queue.enqueue(43);
        queue.enqueue(12);
        System.out.println(queue);
        /*System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());*/
        _sort(queue);
        System.out.println(queue);
    }

    private static void _sort(LinkedQueue queue) {
        int[] arr=new int[queue.size()];
        int index=0;
        while (queue!=null && !queue.isEmpty()){
            arr[index++]=queue.dequeue();
        }
        MergeSort._sort(arr);
        for (int data:arr)
            queue.enqueue(data);
    }
}

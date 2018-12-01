package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 06/10/18
 */
public class CircularLinkedList2 {
    private int length;
    private CLLNode tail;
    public void addToHead(int data) {
        CLLNode temp = new CLLNode(data);
        if (tail == null) {
            tail = temp;
            temp.setNext(temp);
        } else {
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
        length++;
    }
    public void addToTail(int data) {
        addToHead(data);
        tail=tail.getNext();

    }

    public  int removeFromHead(){
        CLLNode temp= tail.getNext();
        if (tail==tail.getNext()){
            tail=null;
        }
        else {
            temp=tail.getNext();
            tail.setNext(tail.getNext().getNext());
            temp.setNext(null);
        }
        length--;
        return temp.getData();
    }

    @Override
    public String toString() {
        if (tail == null) return "[]";
        StringBuilder builder = new StringBuilder("[");
        CLLNode temp = tail.getNext();
        builder.append(tail.getData()).append(",");
        while (temp != tail) {
            builder.append(temp.getData()).append(",");
            temp = temp.getNext();
        }
        return builder.deleteCharAt(builder.length() - 1).append("]").toString();
    }
    public static void main(String[] args) {
        CircularLinkedList2 list = new CircularLinkedList2();
        list.addToHead(10); // this is tail s
        list.addToHead(20);
        list.addToHead(30);
        list.addToTail(100);
        list.addToTail(200);
        list.addToTail(300);
        System.out.println(list);
        System.out.println(list.removeFromHead());
        System.out.println(list);

        CLLNode node1=new CLLNode(10);
        CLLNode node2=new CLLNode(10);
        CLLNode node3=new CLLNode(10);
        CLLNode node4=new CLLNode(10);
        CLLNode node5=new CLLNode(10);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);;
        //node5.setNext(node3);
        System.out.println(findLoop(node1));
    }

    public static boolean findLoop(CLLNode cllNode){
        CLLNode slowPtr=cllNode;
        CLLNode fastPtr=cllNode;
        boolean flag=false;
        while (fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr=fastPtr.getNext().getNext();
            slowPtr=slowPtr.getNext();
            if (slowPtr==fastPtr){
                flag=true;
                break;
            }
        }
        return flag;
    }


}

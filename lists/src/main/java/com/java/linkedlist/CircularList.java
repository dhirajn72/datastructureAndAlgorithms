package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 11/08/19
 */
public class CircularList {
    int length;
    CLLNode head;

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.remove(4));
        System.out.println(list);
    }

    public void add(int data) {
        if (head == null) {
            head = new CLLNode(data);
            head.setNext(head);
        } else {
            CLLNode node = new CLLNode(data);
            CLLNode temp = head;
            while (temp.getNext() != head)
                temp = temp.getNext();
            temp.setNext(node);
            node.setNext(head);
        }
        length++;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder("[");
        if (length==0){sb.append("]");return sb.toString();}
        if (length==1) {
            sb.append(head.getData());
            sb.append("]");
        }
        else {
            CLLNode temp = head;
            while (temp.getNext() != head) {
                sb.append(temp.getData()).append(" ");
                temp = temp.getNext();
            }
            sb.append(temp.getData()).append("]");
        }
        return sb.toString();
    }

    public int remove(int index){
        if (length==0) return -1;
        if (index>length)return -1;
        if (index==0){
            CLLNode temp=head;
            head=head.getNext();
            CLLNode curr=head;
            while (curr.getNext()!=temp)
                curr=curr.getNext();
            curr.setNext(head);
            temp.setNext(null);
            length--;
            return temp.getData();
        }
        else {
            CLLNode node= head;
            int i=0;
            CLLNode prev=null;
            while (node!=null && i<index){
                prev=node;
                node=node.getNext();
                i++;
            }
            prev.setNext(prev.getNext().getNext());
            node.setNext(null);
            length--;
            return node.getData();
        }
    }
}

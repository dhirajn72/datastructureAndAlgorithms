package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 25/09/18
 */
public class SinglyLinkedList4<T> {
    private  int length;
    private ListNodeGenerics<T> root;

    public void insertAtBeginning(T data){
        if (length==0)
            root=new ListNodeGenerics<T>(data);
        else {
            ListNodeGenerics<T> node= new ListNodeGenerics<T>(data);
            node.setNext(root);
            root=node;
        }
        length++;
    }

    public ListNodeGenerics<T> remove(int position){
        if (position<0)position=0;
        if (position>length)position=length-1;
        if (root==null){
            return null;
        }

        if (position==0){
            ListNodeGenerics<T> removedNode=root;
            root=root.getNext();
            length--;
            return removedNode;

        }
        else{
            ListNodeGenerics<T> temp=root;
            for (int i=1;i<position;i++){
                temp=temp.getNext();
            }
            ListNodeGenerics<T> removedNode=temp.getNext();
            temp.setNext(temp.getNext().getNext());
            length--;
            return removedNode;
        }
    }

    public void print(){
        ListNodeGenerics<T> temp=root;
        while (temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }

}

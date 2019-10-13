package com.java.algorithms;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 14/08/19
 */
public class Heap {
    Node[] arr;
    int currentSize;
    int maxSize;


    public Heap(int maxSize) {
        this.maxSize = maxSize;
        arr=new Node[maxSize];
    }

    public void insert(int data){
        if (currentSize==maxSize)return;
        Node node=new Node(data);
        arr[currentSize]=node;
        tricleUp(currentSize++);

    }

    private void tricleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while (index>0 && arr[parent].data<bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    public int remove(){
        Node top=arr[0];
        arr[0]=arr[--currentSize];
        arr[currentSize]=null;
        trickleDown(0);
        return top.data;

    }

    private void trickleDown(int index) {
        Node top=arr[index];
        int largeChild=0;
        while (index<currentSize/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<currentSize && arr[largeChild].data<arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if(top.data>=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }

    public int getCurr() {
        return currentSize;
    }

    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Heap{" +
                "arr=" + Arrays.toString(arr) +
                ", currentSize=" + currentSize +
                ", maxSize=" + maxSize +
                '}';
    }

    public static void main(String[] args) {
        Heap heap=new Heap(8);
        heap.insert(8);
        heap.insert(1);
        heap.insert(9);
        heap.insert(3);
        heap.insert(7);
        heap.insert(5);
        heap.insert(2);
        heap.insert(4);
        while (heap.getCurr()!=0)
            System.out.print(heap.remove()+", ");


    }
}

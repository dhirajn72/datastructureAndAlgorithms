package com.java.queue;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class MaxHeap {
    public static void main(String[] args) {
        int[] arr={5,6,4,3,2,7,1,8,6};
        MaxHeap heap=new MaxHeap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (heap.getCurrentSize()!=0){
            System.out.print(heap.remove()+", ");
        }
    }
    private Node[] arr;
    private int currentSize;
    private int maxSize;

    public int getCurrentSize() {
        return currentSize;
    }

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        arr=new Node[maxSize];
    }
    public void insert(int data){
        if (currentSize==maxSize)
            return;
        Node node=new Node(data);
        arr[currentSize]=node;
        trickleUp(currentSize++);
    }

    private void trickleUp(int index) {
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
        tricleDown(0);
        return top.data;

    }

    private void tricleDown(int index) {
        Node top=arr[index];
        int largeChild;
        while (index<currentSize/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<currentSize && arr[leftChild].data<arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.data>=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }


    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

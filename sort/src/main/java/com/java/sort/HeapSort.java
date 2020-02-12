package com.java.sort;

/**
 * @author Dhiraj
 * @date 26/01/20
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,7,5,8,6,9};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (!heap.isEmpty())
            System.out.print(heap.remove()+", ");
    }

}



class Heap{
    private Node[] arr;
    private int max;
    private int curr;

    public Heap(int max) {
        this.max = max;
        arr=new Node[max];
    }
    public void insert(int data){
        if(max==curr)
            return;
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);

    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while (index>0 && arr[parent].data>bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    public int remove(){
        if (curr==0)return -1;
        Node top=arr[0];
        arr[0]=arr[--curr];
        arr[curr]=null;
        trickleDown(0);
        return top.data;
    }

    private void trickleDown(int index) {
        int largeChild=0;
        Node top=arr[index];
        while (index<curr/2){
            int leftChild=(2*index)+1;
            int rightChild=(2*index)+2;
            if (rightChild<curr && arr[leftChild].data>arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.data<=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }
    public boolean isEmpty() {
        return curr==0;
    }
}

class Node{
    int data;

    public Node(int data) {
        this.data = data;
    }
}
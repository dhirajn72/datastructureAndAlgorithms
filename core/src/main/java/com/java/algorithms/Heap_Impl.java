package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 12/10/19
 */
public class Heap_Impl {

    private Node[] arr;
    private int curr;
    private int max;

    public Heap_Impl(int max) {
        this.max = max;
        arr=new Node[max];
    }

    public void insert(int data){
        if (curr==max)return;
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);

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
        arr[0]=arr[--curr];
        arr[curr]=null;
        trickleDown(0);
        return top.data;
    }

    private void trickleDown(int index) {
        Node top=arr[index];
        int largeChild=0;
        while (index<curr/2){
            int left=2*index+1;
            int right=2*index+2;
            if (right<curr && arr[left].data<arr[right].data)
                largeChild=right;
            else
                largeChild=left;
            if (top.data>=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;

    }

    public int getCurr() {
        return curr;
    }

    class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Heap_Impl heap=new Heap_Impl(8);
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

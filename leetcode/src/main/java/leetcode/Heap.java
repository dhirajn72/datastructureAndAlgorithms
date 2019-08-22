package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class Heap {
    private Node[] arr;
    private int currentSize;
    int maxSize;

    public Heap(int maxSize) {
        this.arr = new Node[maxSize];
        this.maxSize = maxSize;
    }

    public void insert(int data){
        if (currentSize==maxSize)
            return;
        Node node= new Node(data);
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
        if (currentSize==0)return -1;
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

    @Override
    public String toString() {
        return "Heap{" +
                "arr=" + Arrays.toString(arr) +
                ", currentSize=" + currentSize +
                ", maxSize=" + maxSize +
                '}';
    }

    public static void main(String[] args) {
        Heap heap= new Heap(5);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);





        System.out.println(heap);

    }
}

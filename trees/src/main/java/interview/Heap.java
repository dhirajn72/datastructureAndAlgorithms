package interview;

import lafore.Node;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class Heap {
    private Node[] arr;
    private int maxSize;
    private int currentSize;

    public Heap(int size) {
        this.maxSize = size;
        arr= new Node[size];
    }

    public void insert(int key){
        if (currentSize==maxSize)
            return;
        Node node= new Node(key);
        arr[currentSize]=node;
        trickleUp(currentSize++);
    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while (index>0 && arr[parent].getData()<bottom.getData()){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "arr=" + Arrays.toString(arr) +
                ", maxSize=" + maxSize +
                ", currentSize=" + currentSize +
                '}';
    }

    public Node remove(){
        Node node=arr[0];
        arr[0]=arr[--currentSize];
        arr[currentSize]=null;
        trickleDown(0);
        return node;
    }

    private void trickleDown(int index) {
        Node top=arr[index];
        int largeChild=0;
        while (index<currentSize/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<currentSize && arr[leftChild].getData()<arr[rightChild].getData())
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.getData()>=arr[largeChild].getData())
                break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }
    public static void main(String[] args) {
        Heap heap= new Heap(7);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);

        System.out.println(heap);
        heap.remove();
        System.out.println(heap);

    }
}

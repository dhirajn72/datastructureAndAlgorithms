package lafore;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 07/07/19
 */
public class Heap_1 {
    private Node[] heapArray;
    private int currentSize;
    private int maxSize;

    public Heap_1(int maxSize) {
        this.maxSize = maxSize;
        heapArray=new Node[maxSize];
    }

    private boolean insert(int element) {
        if (currentSize==maxSize)
            return false;
        Node node= new Node(element);
        heapArray[currentSize]=node;
        trickleUp(currentSize++);
        return true;
    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=heapArray[index];
        while (index>0 && heapArray[parent].getData()<bottom.getData()){
            heapArray[index]=heapArray[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        heapArray[index]=bottom;
    }
    public static void main(String[] args) {
        Heap_1 heap = new Heap_1(6);
        heap.insert(22);
        heap.insert(45);
        heap.insert(39);
        heap.insert(90);
       // heap.remove();
        // heap.change(3,1);
        System.out.println(heap);
    }



    private Node remove() {
        Node bottom=heapArray[0];
        heapArray[0]=heapArray[--currentSize];
        heapArray[currentSize]=null;
        trickleDown(0);
        return bottom;
    }

    private void trickleDown(int index) {

    }

    @Override
    public String toString() {
        return "Heap_1{" +
                "heapArray=" + Arrays.toString(heapArray) +
                ", currentSize=" + currentSize +
                ", maxSize=" + maxSize +
                '}';
    }

}

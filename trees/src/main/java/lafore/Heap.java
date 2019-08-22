package lafore;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        heapArray = new Node[maxSize];
    }

    public static void main(String[] args) {
        Heap heap = new Heap(8);
        heap.insert(22);
        heap.insert(34);
        heap.insert(54);
        heap.insert(75);
        heap.insert(79);
        heap.insert(12);
        heap.insert(62);
        heap.insert(90);

        heap.remove();
       // heap.change(3,1);
        System.out.println(heap);


    }

    public boolean insert(int key) {
        if (currentSize == maxSize)
            return false;
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    private void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heapArray[index];
        while (index > 0 && heapArray[parent].getData() < bottom.getData()) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        heapArray[currentSize]=null;
        trickleDown(0);
        return root;

    }

    private void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (rightChild < currentSize && heapArray[leftChild].getData() < heapArray[rightChild].getData())
                largerChild = rightChild;
             else
                largerChild = leftChild;
            if (top.getData() >= heapArray[largerChild].getData())
                break;
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    /*public boolean change(int index, int newValue) {
        if (index < 0 || index >= currentSize)
            return false;
        int oldValue = heapArray[index].getData();
        heapArray[index].setData(newValue);

        if (oldValue < newValue)
            trickleUp(index);
        else
            trickleDown(index);
        return true;
    }*/

    @Override
    public String toString() {
        return "Heap{" +
                "heapArray=" + Arrays.toString(heapArray) +
                ", maxSize=" + maxSize +
                ", currentSize=" + currentSize +
                '}';
    }
}


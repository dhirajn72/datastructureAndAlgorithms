package leetcode;

/**
 * @author Dhiraj
 * @date 09/08/19
 */


public class Heap_delete1 {
    private Node[] arr;
    private int maxSize;
    private int currentSize;

    public Heap_delete1(int maxSize) {
        this.maxSize = maxSize;
        arr=new Node[maxSize];
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
        Node node=arr[0];
        arr[0]=arr[--currentSize];
        arr[currentSize]=null;
        trickleDown(0);
        return node.data;
    }

    private void trickleDown(int index) {
        Node top=arr[0];
        int largeChild=0;
        while (index<currentSize/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<currentSize && arr[leftChild].data<arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.data>=arr[largeChild].data)
                break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }

    public static void main(String[] args) {
        Heap_delete1 heap= new Heap_delete1(5);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);

        System.out.println(heap);
        heap.remove();
        heap.remove();
        heap.remove();

        System.out.println(heap);
    }
}

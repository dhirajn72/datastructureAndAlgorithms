package gfg;

/**
 * @author Dhiraj
 * @date 21/08/19
 */
public class FindKFrequentlySearchedElements {
    public static void main(String[] args) {
        int[] arr={7,1,2,3,7,9,5,4,6};
        Heap heap=new Heap(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            heap.insert(arr[i]);
        }

        while (heap.getCurrentSize()!=0)
            System.out.print(heap.remove()+",");
    }

    static class Heap{
        private Node[] arr;
        private int currentSize;
        private int maxSize;
        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr=new Node[maxSize];
        }

        public int getCurrentSize() {
            return currentSize;
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
            while (index>0 && arr[parent].data>bottom.data){
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
            int largeChild;
            while (index<currentSize/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<currentSize && arr[leftChild].data>arr[rightChild].data)
                    largeChild=rightChild;
                else
                    largeChild=leftChild;
                if (top.data<=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }
    }
    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }



}

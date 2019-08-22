package leetcode;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class KthSmallestElementinaSortedMatrix {
    public static void main(String[] args) {
        Heap heap= new Heap(10);
        /*heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        heap.insert(9);
        heap.insert(10);*/

        /*heap.insert(1);
        heap.insert(1);
        heap.insert(1);
        heap.insert(1);
        heap.insert(1);
        heap.insert(1);
        heap.insert(1);

        System.out.println(heap);
        while (heap.getCurrentSize()!=0){
            System.out.println(heap.remove());
        }*/

        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        System.out.println(kthSmallest(matrix,k));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int length = matrix.length * matrix[0].length;
        Heap heap= new Heap(length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                heap.insert(matrix[i][j]);
            }
        }
        int kth=0;
        while (k!=0) {
            kth = heap.remove();
            k--;
        }
        return kth;
    }
    static class Heap {
        int maxSize;
        int currentSize;
        private Node[] arr;

        public int getCurrentSize() {
            return currentSize;
        }

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr = new Node[maxSize];
        }

        public void insert(int data) {
            if (currentSize == maxSize)
                return;
            Node node = new Node(data);
            arr[currentSize] = node;
            tricklUp(currentSize++);
        }

        private void tricklUp(int index) {
            int parent = (index - 1) / 2;
            Node bottom = arr[index];
            while (index > 0 && arr[parent].data > bottom.data) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index]=bottom;
        }

        public int remove(){
            if(currentSize==0)return 0;
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

    static class Node {
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

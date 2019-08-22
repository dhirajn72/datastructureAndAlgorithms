package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class KthLargest {

    public KthLargest(int k, int[] arr) {


    }

    public int add(int val) {
        return 0;

    }

    class Heap {
        int maxSize;
        private Node[] arr;
        private int currentSize;

        public Heap(int maxSize) {
            this.arr = new Node[maxSize];
            this.maxSize = maxSize;
        }

        public void insert(int data) {
            if (currentSize == maxSize)
                return;
            Node node = new Node(data);
            arr[currentSize] = node;
            trickleUp(currentSize++);

        }

        private void trickleUp(int index) {
            int parent = (index - 1) / 2;
            Node bottom = arr[index];
            while (index > 0 && arr[parent].data < bottom.data) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index] = bottom;
        }

        public int remove() {
            if (currentSize == 0) return -1;
            Node top = arr[0];
            arr[0] = arr[--currentSize];
            arr[currentSize] = null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < currentSize / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < currentSize && arr[leftChild].data < arr[rightChild].data)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;
                if (top.data >= arr[largeChild].data) break;
                arr[index] = arr[largeChild];
                index = largeChild;
            }
            arr[index] = top;
        }

        @Override
        public String toString() {
            return "Heap{" +
                    "arr=" + Arrays.toString(arr) +
                    ", currentSize=" + currentSize +
                    ", maxSize=" + maxSize +
                    '}';
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

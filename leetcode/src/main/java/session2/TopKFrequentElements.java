package session2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 04/09/19
 */



/*


Success
Details
Runtime: 14 ms, faster than 64.58% of Java online submissions for Top K Frequent Elements.
Memory Usage: 41.1 MB, less than 32.76% of Java online submissions for Top K Frequent Elements.
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(topKFrequent(arr, 2));
    }

    public static List<Integer> topKFrequent(int[] arr, int k) {
        if (arr==null||arr.length<k)return new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], 0);
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        Heap heap = new Heap(map.size());
        for (Map.Entry<Integer, Integer> keys : map.entrySet()) {
            heap.insert(new Node(keys.getKey(), keys.getValue()));
        }
        List<Integer> res = new ArrayList<>();
        while (k-- > 0)
            res.add(heap.remove().data);
        return res;
    }

    static class Heap {
        private Node[] arr;
        private int currentSize;
        private int max;

        public Heap(int max) {
            this.max = max;
            arr = new Node[max];
        }

        public void insert(Node n) {
            if (currentSize == max)
                return;
            arr[currentSize] = n;
            trickleUp(currentSize++);
        }

        private void trickleUp(int index) {
            int parent = (index - 1) / 2;
            Node bottom = arr[index];
            while (index > 0 && arr[parent].count < bottom.count) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index] = bottom;
        }

        public Node remove() {
            Node top = arr[0];
            arr[0] = arr[--currentSize];
            arr[currentSize] = null;
            trickleDown(0);
            return top;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < currentSize / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < currentSize && arr[leftChild].count < arr[rightChild].count)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;

                if (top.count >= arr[largeChild].count) break;
                arr[index] = arr[largeChild];
                index = largeChild;
            }
            arr[index] = top;
        }


        public int getCurrentSize() {
            return currentSize;
        }
    }

    static class Node {
        private int data;
        private int count;

        public Node(int data, int count) {
            this.data = data;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", count=" + count +
                    '}';
        }
    }
}

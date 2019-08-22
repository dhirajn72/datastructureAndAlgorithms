package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        //int[] arr = {1, 1, 1, 2, 2, 3};
        int[] arr = {1};
        topKFrequent(arr, 10);
    }

    public static List<Integer> topKFrequent(int[] arr, int k) {
        if (arr==null||arr.length==0)return null;
        if (arr.length<k)return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            map.putIfAbsent(e, 0);
            map.put(e, map.get(e) + 1);
        }
        Heap heap = new Heap(map.size());
        map.entrySet()
                .stream()
                .forEach(ob -> heap.insert(new Node(ob.getValue(), ob.getKey())));

        List<Integer> integers = new ArrayList<>();
        while (k > 0) {
            Node removed = heap.remove();
            if (removed != null)
                integers.add(removed.count);
            k--;
        }
        System.out.println(integers);
        return integers;
    }

    static class Heap {
        Node[] arr;
        int maxCount;
        int currentSize;

        public Heap(int maxCount) {
            this.maxCount = maxCount;
            arr = new Node[maxCount];
        }

        public void insert(Node n) {
            if (currentSize == maxCount)
                return;
            Node node = n;
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

        private Node remove() {
            if (currentSize == 0) return null;
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
    }

    static class Node {
        int data;
        int count;

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

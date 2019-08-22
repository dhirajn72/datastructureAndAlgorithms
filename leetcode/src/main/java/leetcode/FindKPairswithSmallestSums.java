package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class FindKPairswithSmallestSums {
    public static void main(String[] args) {
        int[] arr1 ={1,1,2} /*{1, 7, 11}*/, arr2 = {1,2,3}/*{2, 4, 6}*/;
        System.out.println(kSmallestPairs(arr1, arr2, 2));

    }

    public static List<List<Integer>> kSmallestPairs(int[] arr1, int[] arr2, int k) {
        Map<Integer, Map<Integer, List<Integer>>> integerMapMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                ArrayList<Integer> integers = new ArrayList<>();
                int sum = arr1[i] + arr2[j];
                integers.add(arr1[i]);
                integers.add(arr2[j]);
                Map<Integer, List<Integer>> integerListMap = new HashMap<>();
                integerListMap.putIfAbsent(sum, integers);
                integerMapMap.putIfAbsent(sum, integerListMap);
            }
        }
        Heap heap = new Heap(integerMapMap.size());
        integerMapMap
                .entrySet()
                .stream()
                .forEach(x -> heap.insert(new Node(x.getKey(), x.getValue())));

        List<List<Integer>> res = new ArrayList<>();
        while (k > 0) {
            Node node = heap.remove();
            if (node != null)
                res.add(new ArrayList<>(node.map.get(node.data)));
            k--;
        }
        return res;
    }


    static class Heap {
        private Node[] arr;
        private int maxCount;
        private int currentSize;

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
            while (index > 0 && arr[parent].data > bottom.data) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index] = bottom;
        }

        public Node remove() {
            if (currentSize == 0) return null;
            Node top = arr[0];
            arr[0] = arr[--currentSize];
            arr[currentSize] = null;
            trickleDown(0);
            return top;
        }

        private void trickleDown(int index) {
            Node top = arr[0];
            int largeChild;
            while (index < currentSize / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < currentSize && arr[leftChild].data > arr[rightChild].data)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;
                if (top.data <= arr[largeChild].data) break;
                arr[index] = arr[largeChild];
                index = largeChild;
            }
            arr[index] = top;
        }

        @Override
        public String toString() {
            return "Heap{" +
                    "arr=" + Arrays.toString(arr) +
                    ", maxCount=" + maxCount +
                    ", currentSize=" + currentSize +
                    '}';
        }
    }

    static class Node {
        int data;
        Map<Integer, List<Integer>> map;

        public Node(int data, Map<Integer, List<Integer>> map) {
            this.data = data;
            this.map = map;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", map=" + map +
                    '}';
        }
    }
}

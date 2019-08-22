package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class FindKPairswithSmallestSums_1 {
    public static void main(String[] args) {
        int[] arr1 =/*{1,1,2}*/ {1, 7, 11}, arr2 = /*{1,2,3}*/{2, 4, 6};
        System.out.println(kSmallestPairs(arr1, arr2, 10));
    }

    public static List<List<Integer>> kSmallestPairs(int[] arr1, int[] arr2, int k) {
        List<List<Integer>> listOfCombinations= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                List<Integer> integers=new ArrayList<>();
                integers.add(arr1[i]);
                integers.add(arr2[j]);
                listOfCombinations.add(integers);
            }
        }
        Heap heap=new Heap(listOfCombinations.size());
        listOfCombinations.stream()
                .forEach(e->{
                    int sum=0;
                    for (int i:e){sum+=i;}
                    heap.insert(new Node(sum,e));
                });

        List<List<Integer>> list= new ArrayList<>();
        while (k-->0){
            Node node=heap.remove();
            if (node!=null)
            list.add(node.integers);
        }
        return list;
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
        List<Integer> integers;
        public Node(int data,List<Integer> integers) {
            this.data = data;
            this.integers=integers;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", integers=" + integers +
                    '}';
        }
    }
}

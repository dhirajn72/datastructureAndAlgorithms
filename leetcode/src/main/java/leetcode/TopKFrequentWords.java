package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] arr = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        /*String[] arr={"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k=4;*/

        System.out.println(topKFrequent(arr, k));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : words) {
            stringIntegerMap.putIfAbsent(s, 0);
            stringIntegerMap.put(s, stringIntegerMap.get(s) + 1);
        }
        Heap heap = new Heap(stringIntegerMap.size());
        stringIntegerMap
                .entrySet()
                .stream()
                .forEach(x -> heap.insert(new Node(x.getValue(), x.getKey())));

        List<String> list = new ArrayList<>();
        while (k != 0) {
            Node node = heap.remove();
            list.add(node.word);
            k--;
        }
        //Collections.sort(list);
        //Collections.reverse(list);
        return list;
    }

    static class Heap {
        private Node[] arr;
        private int maxSize;
        private int currentSize;

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr = new Node[maxSize];
        }

        public void insert(Node n) {
            if (currentSize == maxSize)
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
        }

        public Node remove() {
            if (currentSize == 0)
                return null;
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
        String word;

        public Node(int data, String word) {
            this.data = data;
            this.word = word;
        }
    }
}

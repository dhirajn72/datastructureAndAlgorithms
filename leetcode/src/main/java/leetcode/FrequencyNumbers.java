package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class FrequencyNumbers {

    public static void main(String[] args) {
        //String s = "tree";
        String s="abaccadeeefaafcc";
        System.out.println(frequencySort(s));; // "aaaaacccceeeffdb"
    }

    public static String frequencySort(String s) {
        if (s==null||s.length()==0)return null;
        Map<Character, Integer> integerMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (integerMap.containsKey(c)) {
                integerMap.put(c, integerMap.get(c) + 1);
            } else {
                integerMap.put(c, 1);
            }
        }
        Heap heap= new Heap(integerMap.size());
        integerMap
                .entrySet()
                .stream()
                .forEach(x->heap.insert(new Node(x.getValue(),x.getKey())));
        StringBuilder sb= new StringBuilder();
        int i=integerMap.size();
        while (i>0){
            Node removed=heap.remove();
            if (removed!=null) {
                for (int j = 0; j < removed.data; j++) {
                    sb.append(removed.c);
                }
            }
            i--;
        }
        return sb.toString();
    }

    static class Heap {
        private Node[] arr;
        private int maxSize;
        private int currSize;

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr = new Node[maxSize];
        }

        public void insert(Node node1 ) {
            if (currSize == maxSize)
                return;
            Node node = node1;
            arr[currSize] = node;
            trickleUp(currSize++);
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

        public Node remove() {
            if (currSize==0)return null;
            Node top = arr[0];
            arr[0] = arr[--currSize];
            arr[currSize] = null;
            trickleDown(0);
            return top;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < currSize / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < currSize && arr[leftChild].data < arr[rightChild].data)
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
        char c;

        public Node(int data, char c) {
            this.data = data;
            this.c=c;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", c=" + c +
                    '}';
        }
    }
}

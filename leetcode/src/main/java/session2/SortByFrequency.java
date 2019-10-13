package session2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 13/09/19
 */
public class SortByFrequency {

    public static void main(String[] args) {
        //String s="tree";
        //String s="aaacccc";
        String s="abababababababababababbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababab";
        System.out.println(frequencySort(s));
        /*int[] arr={5,2,6,1,7,9,8};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(new Node(i,(char)i));
        while (heap.getCurrent()!=0)
            System.out.println(heap.remove());*/

    }

    public static String frequencySort(String s) {
        if (s==null)return "";
        if (s.length()==0)return "";
        if (s.length()==1)return s;
        Map<Character,Integer> integerMap=new HashMap<>();
        //for (char c:chars){
        for (int i = 0; i < s.length(); i++) {
            integerMap.putIfAbsent(s.charAt(i),0);
            integerMap.put(s.charAt(i),integerMap.get(s.charAt(i))+1);
        }
        Heap heap=new Heap(s.length());
        for (char key:integerMap.keySet())
            heap.insert(new Node(integerMap.get(key),key));
        String result="";
        while (heap.getCurrent()!=0) {
            Node node=heap.remove();
            System.out.println(node);
            for (int i = 0; i < node.count; i++) {
                result+=node.data;
            }
        }
        return result;
    }

    static class Heap {
        Node[] arr;
        int current;
        int max;

        public Heap(int max) {
            this.max = max;
            arr = new Node[max];
        }

        public void insert(Node node) {
            if (current == max)
                return;
            arr[current] = node;
            trickleUp(current++);
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
            arr[0] = arr[--current];
            arr[current] = null;
            trickleDown(0);
            return top;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < current / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < current && arr[leftChild].count < arr[rightChild].count)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;
                if (top.count >= arr[largeChild].count) break;
                arr[index] = arr[largeChild];
                index = largeChild;
            }
            arr[index] = top;
        }

        public int getCurrent() {
            return current;
        }
    }
    static class Node {
        char data;
        int count;

        public Node(int count,char data) {
            this.data = data;
            this.count=count;
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

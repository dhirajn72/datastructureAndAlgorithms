package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 13/09/19
 */
public class FindKPairsWithSmallestSums {

    public static void main(String[] args) {
        /*
Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
         */
        System.out.println(kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},3));

    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1==null && nums2==null)return new ArrayList<>();
        if (nums1==null && nums2!=null)return new ArrayList<>();
        if (nums1!=null && nums2==null)return new ArrayList<>();
        List<Node> nodes=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                List<Integer> list=new ArrayList<>();
                int sum=nums1[i]+nums2[j];
                list.add(nums1[i]);
                list.add(nums2[j]);
                nodes.add(new Node(sum,list));
            }
        }
        Heap heap=new Heap(nodes.size());
        for (Node e:nodes)
            heap.insert(e);
        List<List<Integer>> result=new ArrayList<>();
        int index=0;
        while (index<k && heap.getCurrent()!=0) {
            result.add(heap.remove().integers);
            index++;
        }
        return result;
    }

    static class Node{
        int data;
        List<Integer> integers;

        public Node(int number, List<Integer> integers) {
            this.data = number;
            this.integers = integers;
        }
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
            while (index > 0 && arr[parent].data > bottom.data) {
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
                if (rightChild < current && arr[leftChild].data > arr[rightChild].data)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;
                if (top.data <= arr[largeChild].data) break;
                arr[index] = arr[largeChild];
                index = largeChild;
            }
            arr[index] = top;
        }

        public int getCurrent() {
            return current;
        }
    }
}

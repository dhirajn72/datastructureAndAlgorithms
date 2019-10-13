package session2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 13/09/19
 */
public class KthLargestElementInArray {

    public static void main(String[] args) {
        //int[] arr={5,3,6,4,8,10,9,1,2,7};
        int[] arr={2,2,3,1};
        System.out.println(findKthLargest(arr,3));

    }

    public static int findKthLargest(int[] nums, int k) {
        if (nums==null||nums.length==0)return 0;
        if (k>nums.length)return 0;
        Set<Integer> uniques=new HashSet<>();
        for (int i:nums)
            uniques.add(i);
        Heap heap=new Heap(uniques.size());
        for (int e:uniques)
            heap.insert(e);
        int kth=Integer.MIN_VALUE;
        while (k-->0)
            kth=heap.remove();
        return kth;
    }

    static class Heap{
        Node[] arr;
        int current;
        int max;

        public Heap(int max) {
            this.max = max;
            arr=new Node[max];
        }
        public void insert(int data){
            if (current==max)
                return;
            Node node=new Node(data);
            arr[current]=node;
            trickleUp(current++);
        }

        private void trickleUp(int index) {
            int parent=(index-1)/2;
            Node bottom=arr[index];
            while (index>0 && arr[parent].data<bottom.data){
                arr[index]=arr[parent];
                index=parent;
                parent=(parent-1)/2;
            }
            arr[index]=bottom;
        }

        public int remove(){
            Node top=arr[0];
            arr[0]=arr[--current];
            arr[current]=null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top=arr[index];
            int largeChild=0;
            while (index<current/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<current && arr[leftChild].data<arr[rightChild].data)
                  largeChild=rightChild;
                else
                    largeChild=leftChild;
                if (top.data>=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }

        public int getCurrent() {
            return current;
        }
    }

    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

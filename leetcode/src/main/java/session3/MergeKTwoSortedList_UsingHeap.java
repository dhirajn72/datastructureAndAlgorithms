package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 13/11/19
 */
public class MergeKTwoSortedList_UsingHeap {

    public static void main(String[] args) {
        ListNode l1 = DataUtil.getListData();
        ListNode l2 = DataUtil.getListData();
        ListNode l3 = DataUtil.getListData();
        ListNode[] listNodes = {l1, l2, l3};
        System.out.println(mergeKLists(listNodes));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        int count = 0;
        for (ListNode l : lists) {
            ListNode temp = l;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        Heap heap = new Heap(count);
        for (ListNode l : lists) {
            while (l!=null) {
                heap.insert(l.val);
                l=l.next;
            }
        }
        ListNode result = null;
        while (heap.getCurrentSize() != 0) {
            result = _addToList(result, heap.remove().data);
        }
        return result;
    }

    private static ListNode _addToList(ListNode head, int data) {
        if (head == null)
            return new ListNode(data);
        else {
            ListNode p, q;
            for (p = head; (q = p.next) != null; p = q) ;
            p.next = new ListNode(data);
            return head;
        }
    }

    static class Heap {
        private Node[] arr;
        private int max;
        private int currentSize;

        public Heap(int max) {
            this.max = max;
            arr = new Node[max];
        }

        public void insert(int data) {
            if (max == currentSize) return;
            Node node = new Node(data);
            arr[currentSize] = node;
            trickleUp(currentSize++);
        }

        public int getCurrentSize() {
            return currentSize;
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
        private int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

package leetcode;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        mergeTwoLists(list1, list2);


    }

    public static ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        int size = 0;
        ListNode temp = temp1;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = temp2;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        Heap heap = new Heap(size);
        while (temp1 != null) {
            heap.insert(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            heap.insert(temp2.val);
            temp2 = temp2.next;
        }

        ListNode result = null;
        while (heap.currentSize != 0) {
            result = _addToList(result, heap.remove());
        }
        return result;
    }

    private static ListNode _addToList(ListNode head, int data) {
        if (head == null) head = new ListNode(data);
        else {
            ListNode p, q;
            for (p = head; ((q = p.next) != null); p = q) ;
            p.next = new ListNode(data);
        }
        return head;

    }

    static class Heap {
        private Node[] arr;
        private int currentSize;
        private int maxSize;

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr = new Node[maxSize];
        }

        public int getCurrentSize() {
            return currentSize;
        }

        public void insert(int data) {
            if (currentSize == maxSize)
                return;
            Node node = new Node(data);
            arr[currentSize] = node;
            trickelUp(currentSize++);
        }

        public void trickelUp(int index) {
            int parent = (index - 1) / 2;
            Node bottom = arr[index];
            while (index > 0 && arr[parent].data > bottom.data) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index] = bottom;
        }

        public int remove() {
            if (currentSize == 0) return 0;

            Node top = arr[0];
            arr[0] = arr[--currentSize];
            arr[currentSize] = null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
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
    }

    static class Node {
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

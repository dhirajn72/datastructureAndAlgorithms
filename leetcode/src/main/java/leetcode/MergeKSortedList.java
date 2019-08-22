package leetcode;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class MergeKSortedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        /*node.next = new ListNode(4);

        ListNode node1 = new ListNode(20);
        node1.next = new ListNode(4);
        ListNode node2 = new ListNode(6);
        node2.next = new ListNode(1);
        node2.next.next = new ListNode(3);*/

        ListNode[] arr = new ListNode[3];
        arr[0] = node;
        /*arr[1] = node1;
        arr[2] = node2;*/

        ListNode list = mergeKLists(arr);
        while (list != null) {
            System.out.print(list.val + ",");
            list = list.next;
        }
        System.out.println();
    }

    public static ListNode mergeKLists(ListNode[] listNodes) {
        int size = 0;
        for (ListNode list : listNodes) {
            while (list != null) {
                list = list.next;
                size++;
            }
        }
        Heap heap = new Heap(size);
        for (ListNode list : listNodes) {
            while (list != null) {
                heap.insert(list.val);
                list = list.next;
            }
        }
        ListNode node = null;
        while (heap.getCurrentCount() != 0) {
            if (node == null)
                node = addToList(node, heap.remove());
            else
                addToList(node, heap.remove());

        }
        return node;
    }

    private static ListNode addToList(ListNode head, int data) {
        if (head == null) return new ListNode(data);
        else {
            ListNode curr = head, prev = head;
            while (curr != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = new ListNode(data);
            return head;
        }
    }

    static class Heap {
        private Node[] arr;
        private int maxCount;
        private int currentCount;

        public Heap(int maxCount) {
            this.maxCount = maxCount;
            arr = new Node[maxCount];
        }

        public int getCurrentCount() {
            return currentCount;
        }

        public void insert(int data) {
            if (currentCount == maxCount)
                return;
            Node node = new Node(data);
            arr[currentCount] = node;
            trickleUp(currentCount++);
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

        public int remove() {
            Node top = arr[0];
            arr[0] = arr[--currentCount];
            arr[currentCount] = null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < currentCount / 2) {
                int leftChild = 2 * index + 1;
                ;
                int rightChild = 2 * index + 2;
                if (rightChild < currentCount && arr[leftChild].data > arr[rightChild].data)
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

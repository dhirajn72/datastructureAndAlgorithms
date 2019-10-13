package session2;

import leetcode.DataUtil;
import leetcode.ListNode;
import leetcode.Node;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1= DataUtil.getListData();
        ListNode head2= DataUtil.getListData();
        System.out.println(mergeTwoLists(head1,head2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null)return null;
        if (l1==null && l2!=null)return l2;
        if (l1!=null && l2==null)return l1;
        ListNode temp=l1;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        temp=l2;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        Heap heap=new Heap(size);
        temp=l1;
        while (temp!=null){
            heap.insert(temp.val);
            temp=temp.next;
        }
        temp=l2;
        while (temp!=null){
            heap.insert(temp.val);
            temp=temp.next;
        }

        ListNode result=null;
        while (heap.getCurrentSize()!=0){
            result=_addToList(result,heap.remove());
        }
        return result;
    }

    private static ListNode _addToList(ListNode result, int remove) {
        if (result==null)return new ListNode(remove);
        else {
            ListNode p,q;
            for(p=result;((q=p.next)!=null) ;p=q);
            p.next=new ListNode(remove);
        }
        return result;
    }

    static class Heap{
        private Node[] arr;
        private int currentSize;
        private int maxSize;


        public int getCurrentSize() {
            return currentSize;
        }

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr=new Node[maxSize];
        }

        public void insert(int data){
            if (currentSize==maxSize)
                return;
            Node node=new Node(data);
            arr[currentSize]=node;
            trickleUp(currentSize++);
        }

        private void trickleUp(int index) {
            int parent=(index-1)/2;
            Node bottom=arr[index];
            while (index>0 && arr[parent].data>bottom.data){
                arr[index]=arr[parent];
                index=parent;
                parent=(parent-1)/2;
            }
            arr[index]=bottom;
        }

        public int remove(){
            Node top=arr[0];
            arr[0]=arr[--currentSize];
            arr[currentSize]=null;
            trickleDown(0);
            return top.data;
        }
        private void trickleDown(int index) {
            Node top=arr[index];
            int largeChild=0;
            while (index<currentSize/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<currentSize && arr[leftChild].data>arr[rightChild].data)
                    largeChild=rightChild;
                else
                    largeChild=leftChild;
                if (top.data<=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }
    }

    static class Node{
        private int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

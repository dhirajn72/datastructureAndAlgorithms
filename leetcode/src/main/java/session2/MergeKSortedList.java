package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class MergeKSortedList {

    public static void main(String[] args) {
        ListNode head1= DataUtil.getListData();
        ListNode head2= DataUtil.getListData();
        ListNode head3= DataUtil.getListData();
        ListNode[] listNodes=new ListNode[3];
        listNodes[0]=head1;
        listNodes[1]=head2;
        listNodes[2]=head3;
        System.out.println(mergeKLists(listNodes));
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null|| lists.length==0)return null;
        int size=0;
        for (ListNode listNode:lists){
            while (listNode!=null){
                listNode=listNode.next;
                size++;
            }
        }
        Heap heap=new Heap(size);
        for (ListNode list:lists){
            while (list!=null){
                heap.insert(list.val);
                list=list.next;
            }
        }

        ListNode result=null;
        while (heap.getCurrentSize()!=0){
            result=_addToList(result,heap.remove());
        }
        return result;
    }

    private static ListNode _addToList(ListNode head, int data) {
        if (head==null)return new ListNode(data);
        else {
            ListNode p,q;
            for (p=head;(q=p.next)!=null;p=q);
            p.next=new ListNode(data);
        }
        return head;
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
            if(currentSize==maxSize)
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
        public  int remove(){
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
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

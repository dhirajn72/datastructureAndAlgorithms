package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 29/08/19
 */
public class MergeKSoertedList {
    public static void main(String[] args) {
        ListNode l1= DataUtil.getListData();
        ListNode l2= new ListNode(3);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(19);
        l2.next.next.next.next=new ListNode(29);
        l2.next.next.next.next.next=new ListNode(39);
        ListNode l3=DataUtil.getListData();


        ListNode[] list=new ListNode[]{l1,l2,l3};
        ListNode result=mergeKLists(list);
        System.out.println(result);

        /*int[] arr={6,1,8,3,5,6,5,4};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (heap.getCurrent()!=0)
            System.out.print(heap.remove()+",");*/


    }

    /**
     *
     * Incomplete
//     * @param l1
//     * @param l2
     * @return
     */

    /*public static ListNode mergeKLists(ListNode[] lists) {
        ListNode res=null;
        for (ListNode listNode:lists)
            res=_mergeLists(res,listNode);

        return res;
    }

    private static ListNode _mergeLists(ListNode l1, ListNode l2) {
        ListNode res=null;
        while (l1!=null && l2!=null){
            ListNode temp=null;
            if (l1.val<l2.val){
                temp=l1;
                l1=l1.next;
                temp.next=null;
                res=_addToList(res,temp);
            }
            else if (l1.val>l2.val){
                temp=l2;
                l2=l2.next;
                temp.next=null;
                res=_addToList(res,temp);
            }
            else {
                temp=l1;
                l1=l1.next;
                temp.next=null;
                res=_addToList(res,temp);
                temp=l2;
                l2=l2.next;
                temp.next=null;
                res=_addToList(res,temp);

            }
        }
        if (l1==null)res=_addToList(res,l2);
        if (l2==null)res=_addToList(res,l1);
        return res;
    }
    */

    public static ListNode mergeKLists(ListNode[] lists) {
        int size=0;
        for (ListNode l:lists){
            while (l!=null){
                l=l.next;
                size++;
            }
        }
        Heap heap=new Heap(size);
        for (ListNode listNode:lists) {
            while (listNode != null) {
                heap.insert(listNode.val);
                listNode=listNode.next;
            }
        }
        ListNode res=null;
        while (heap.getCurrent()!=0)
            res=_addToList(res,new ListNode(heap.remove()));
        return res;
    }

    private static ListNode _addToList(ListNode result, ListNode temp) {
        if (result==null)return temp;
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=temp;
            return result;
        }
    }
    static class Heap{
        Node[] arr;
        int curr;
        int max;

        public Heap(int max) {
            this.max = max;
            arr=new Node[max];
        }
        public void insert(int data){
            if(curr==max)return;
            Node node=new Node(data);
            arr[curr]=node;
            trickleUp(curr++);
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
            arr[0]=arr[--curr];
            arr[curr]=null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top=arr[index];
            int largeChild=0;
            while (index<curr/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<curr && arr[leftChild].data>arr[rightChild].data)
                    largeChild=rightChild;
                else
                    largeChild=leftChild;
                if (top.data<=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }

        public int getCurrent() {
            return curr;
        }
    }
    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

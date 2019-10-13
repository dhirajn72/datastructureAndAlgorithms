package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 02/09/19
 */
public class SortList {
    public static void main(String[] args) {

        int[] arr={5,1,2,7,8,9,3,4,6,7};
        System.out.println(Arrays.toString(arr));
        ListNode head= DataUtil.getListDataShuffled();
        System.out.println(head);
        sortList(head);
        System.out.println(head);
    }

    /*public static ListNode sortList(ListNode head) {
        if (head==null)return null;
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];
        temp=head;
        int index=0;
        while (temp!=null){
            arr[index++]=temp.val;
            temp=temp.next;
        }
        //MergeSort sort=new MergeSort();
        //sort.sort(arr);
        temp=head;
        index=0;
        while (temp!=null && index<arr.length){
            temp.val=arr[index++];
            temp=temp.next;
        }
        return head;
    }

    static class MergeSort{

        public void sort(int[] arr){
            _sort(arr,0,arr.length-1);

        }

        private void _sort(int[] arr,int low,int high) {
            if (low<high){
                int mid=(low+high)/2;
                _sort(arr,low,mid);
                _sort(arr,mid+1,high);
                _merge(arr,low,mid,high);
            }
        }
        private void _merge(int[] arr, int low, int mid, int high) {
            int n1=mid-low+1;
            int n2=high-mid;
            int[] leftArray=new int[n1];
            int[] rightArray=new int[n2];
            for (int i = 0; i < n1; i++) {
                leftArray[i]=arr[low+i];
            }
            for (int i = 0; i < n2; i++) {
                rightArray[i]=arr[mid+1+i];
            }
            int i=0,j=0;
            int k=low;
            while (i<n1 && j<n2){
                if (leftArray[i]<rightArray[j]) {
                    arr[k]=leftArray[i];
                    i++;
                }
                else {
                    arr[k]=rightArray[j];
                    j++;
                }
                k++;
            }
            while (i<n1){
                arr[k]=leftArray[i];
                i++;
                k++;
            }
            while (j<n2){
                arr[k]=rightArray[j];
                j++;
                k++;
            }
        }
    }*/


    public static ListNode sortList(ListNode head) {
        if (head==null)return null;
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        Heap heap=new Heap(size);
        temp=head;
        while (temp!=null){
            heap.insert(temp.val);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null && heap.getCurrent()!=0){
            temp.val=heap.remove();
            temp=temp.next;
        }
        return head;
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
            while (index>0 && arr[parent].data>bottom.data){
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
                if (rightChild<current && arr[leftChild].data>arr[rightChild].data)
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

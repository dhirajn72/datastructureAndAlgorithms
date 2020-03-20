package session2;

import leetcode.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/10/19
 */
public class InsertionSort_1 {
    public static void main(String[] args) {
        int[] arr={4,3,2,9,8,7,6,5,7,6,5};
        _sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void _sort(int[] arr){
        int key=0,j=0;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    /**
     * Success
     Details
     Runtime: 77 ms, faster than 5.11% of Java online submissions for Insertion Sort List.
     Memory Usage: 41.2 MB, less than 5.13% of Java online submissions for Insertion Sort List.
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if (head==null)return head;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        ListNode[] arr=new ListNode[size];
        size=0;
        ListNode prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.next;
            prev.next=null;
            arr[size++]=prev;
        }
        ListNode key=null;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j].val>key.val){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        ListNode res=null;
        for (int i = 0; i < arr.length; i++) {
            res=addToList(res,arr[i]);
        }
        return res;
    }

    private ListNode addToList(ListNode head, ListNode listNode) {
        if (head==null)return listNode;
        ListNode p,q;
        for(p=head;(q=p.next)!=null;p=q);
        p.next=listNode;
        return head;
    }
}

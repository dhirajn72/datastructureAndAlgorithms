package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 18/02/20
 */
public class InsertionSortList {

    public static void main(String[] args) {
        ListNode head= DataUtil.getListDataShuffled();
        insertionSortList(head);


    }

    public static ListNode insertionSortList(ListNode head) {
        if (head==null)
            return null;
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode[] arr=new ListNode[size];
        temp=head;
        ListNode prev=null;
        int index=0;
        while (temp!=null){
            prev=temp;
            arr[index++]=prev;
            temp=temp.next;
            prev.next=null;
        }
        insertionSort(arr);
        head=null;
        for (ListNode node:arr){
            head=addToList(head,node);
        }
        return head;
    }

    private static ListNode addToList(ListNode head, ListNode node) {
        if (head==null)
            return node;
        ListNode p,q;
        for (p=head;(q=p.next)!=null;p=q);
        p.next=node;
        return head;
    }

    private static void insertionSort(ListNode[] arr) {
        ListNode key=null;
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j].val>key.val){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}

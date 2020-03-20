package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class InsertionSort {

    public static void main(String[] args) {
        ListNode head= DataUtil.getListDataShuffled();
        System.out.println(insertionSortList(head));
        List list=new ArrayList();
        list.contains("");

    }

    public static ListNode insertionSortList(ListNode head) {
        if (head==null)return head;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int[] arr=new int[size];
        temp=head;
        int index=0;
        while (temp!=null){
            arr[index++]=temp.val;
            temp=temp.next;
        }
        _insertionSort(arr);
        temp=head;
        for (int i = 0; i < arr.length; i++) {
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }

    private static void _insertionSort(int[] arr) {
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
}

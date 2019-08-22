package com.leetcode;

import com.java.linkedlist.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 02/07/19
 */
public class InsertionSortOnlist {
    public static void main(String[] args) {
        int[] arr={9,1,3,2,4,1,8,7};
        //System.out.println(Arrays.toString(arr));
       // insertionSort(arr);
        //System.out.println(Arrays.toString(arr));

        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(8));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(1));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9) );
        System.out.println(list1);
        System.out.println(insertionSortList(list1));
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp= temp.getNext();
            size++;
        }
        int[] arr=new int[size];
        size=0;
        temp=head;
        while (temp!=null){
            arr[size++]=temp.getData();
            temp=temp.getNext();
        }
        insertionSort(arr);
        temp=null;
        for(int element:arr){
            temp=_addToList(temp,element);
        }
        return temp;
    }

    private static ListNode _addToList(ListNode head, int element) {
        if (head==null)
            head=new ListNode(element);
        else {
            ListNode temp=head;
            ListNode prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(new ListNode(element));
        }
        return head;
    }

    public static void insertionSort(int[] arr){
        int key=0;
        for (int i=1;i<arr.length;i++){
            key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
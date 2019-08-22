package com.leetcode;

import com.java.linkedlist.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/06/19
 */
public class Merge2SortedList {
    public static void main(String[] args) {

        /*
        [1,2,4]
        [1,3,4]

         */
        ListNode list1= new ListNode(1);
        list1.setNext(new ListNode(4));
        list1.getNext().setNext(new ListNode(5));

        ListNode list2= new ListNode(1);
        list2.setNext(new ListNode(3));
        list2.getNext().setNext(new ListNode(4));


        /*ListNode list3= new ListNode(2);
        list3.setNext(new ListNode(3));
        list3.getNext().setNext(new ListNode(5));*/

        ListNode list4= new ListNode(2);
        list4.setNext(new ListNode(6));

        ListNode[] listNodes= new ListNode[5];
        listNodes[0]=list1;
        listNodes[1]=list2;
        //listNodes[2]=list3;
        listNodes[2]=list4;

        System.out.println(list1);
        System.out.println(list2);
      //  System.out.println(list3);
        System.out.println(list4);
        System.out.println("*******");
        System.out.println(mergeKLists(listNodes));




    }
    private static ListNode mergeKLists(ListNode[] listNodes) {
        int size=0;
        ListNode temp=null;
        for (ListNode node:listNodes){
            while (node!=null){
                node=node.getNext();
                size++;
            }
        }
        int[] arr=new int[size];
        int index=0;
        for (ListNode node:listNodes){
            while (node!=null){
                arr[index++]=node.getData();
                node=node.getNext();
            }
        }
        System.out.println(size);
        Arrays.sort(arr);
        temp=null;
        for (int element:arr){
            temp= _addToList(temp,element);
        }
        System.out.println(temp);
        return temp;
    }
    private static ListNode _addToList(ListNode originalList, int i) {
        if (originalList == null) originalList = new ListNode(i);
        else {
            ListNode temp = originalList;
            ListNode prev = null;
            while (temp != null) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(new ListNode(i));
        }
        return originalList;
    }
}

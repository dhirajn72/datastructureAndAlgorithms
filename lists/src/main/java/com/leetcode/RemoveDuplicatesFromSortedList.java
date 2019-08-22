package com.leetcode;

import com.java.linkedlist.ListNode;

import java.util.HashMap;

/**
 * @author Dhiraj
 * @date 01/07/19
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(1));
        list1.getNext().setNext(new ListNode(3));
        list1.getNext().getNext().setNext(new ListNode(4));
        list1.getNext().getNext().getNext().setNext(new ListNode(5));
        list1.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        list1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        list1.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(4));


        System.out.println(deleteDuplicates(list1));




    }

    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=1;
        ListNode temp=head;
        while (temp!=null){
            if (map.containsKey(temp.getData())){
                int increment=map.get(temp.getData());
                map.put(temp.getData(),++increment);
            }else {
                map.put(temp.getData(),count);
            }
            temp= temp.getNext();
        }
        temp=head;
        ListNode originalList=null;
        while (temp!=null){
            int occurence= map.get(temp.getData());
            if(occurence==1){
                originalList=_addToList(originalList,temp.getData());
            }
            temp=temp.getNext();
        }
        return originalList;
    }

    private static ListNode _addToList(ListNode originalList, int data) {
        if (originalList==null)
            originalList= new ListNode(data);
        else {
            ListNode temp=originalList;
            ListNode prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(new ListNode(data));
        }
        return originalList;
    }
}

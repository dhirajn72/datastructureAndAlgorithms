package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class ReOrderList {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);/*
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next.next=new ListNode(5);*/
        reorderList(head);
    }

    public static void reorderList(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        /*if (size==2){
            temp=head;
            head=head.next;
            temp.next=null;
            head.next=temp;
            System.out.println(head);
            return;
        }*/

        ListNode[] arr=new ListNode[size];
        temp=head;
        ListNode prev=temp;
        int index=0;
        while (temp!=null){
            temp=temp.next;
            prev.next=null;
            arr[index++]=prev;
            prev=temp;
        }

        int i=0,j=arr.length-1;
        ListNode result=null;
        while (i<j){
            result=_addToList(result,arr[i]);
            result=_addToList(result,arr[j]);
            i++;
            j--;
        }
        if (i==j)
            result=_addToList(result,arr[j]);
        System.out.println(result);
    }

    private static ListNode _addToList(ListNode result, ListNode listNode) {
        if (result==null)return listNode;
        else {
            ListNode p,q;
            for (p=result;((q=p.next)!=null);p=q);
            p.next=listNode;
        }
        return result;
    }
}

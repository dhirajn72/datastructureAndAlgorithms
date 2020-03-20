package com.java.linkedlist;

import com.java.linkedlist.questions.DataUtils;

/**
 * @author Dhiraj
 * @date 30/06/19
 */
public class ReturnNthNodeFromEnd {
    public static void main(String[] args) {
       ListNode list= DataUtils.getList();
       System.out.println(list);
      // _returnNthNodeFromEnd(list,3);
        System.out.println(_reverseNNodes(list,3));
    }

    private static ListNode _reverseNNodes(ListNode head,int n) {
        ListNode[] listNodes= new ListNode[100];
        int count=0;
        int index=0;
        ListNode temp=head;
        ListNode prev=head;
        while (head!=null){
            prev = head;
            head=head.getNext();
            count++;
            if (count==3) {
                prev.setNext(null);
                listNodes[index++]=temp;
                temp=head;
                count=0;
            }
        }
        listNodes[index++]=temp;
        ListNode originalList=null;
        for (ListNode list:listNodes) {
            if (originalList==null)
            originalList=_reverseList(list);
            else {
                int size=0;
                ListNode l=list;
                while (l!=null){
                    l=l.getNext();
                    size++;
                }
                if (size==3)
                    insertAtEnd(originalList,_reverseList(list));
                else
                    insertAtEnd(originalList,list);
            }
        }
        return originalList;
    }

    private static void insertAtEnd(ListNode originalList, ListNode listNode) {
        ListNode temp=originalList;
        ListNode prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(listNode);
    }

    private static ListNode _reverseList(ListNode current) {
        ListNode prev=null;
        while (current!=null){
            ListNode node= current.getNext();
            current.setNext(prev);
            prev=current;
            current=node;
        }
        return prev;
    }

    private static ListNode _returnNthNodeFromEnd(ListNode list,int n) {
        ListNode temp=list;
        int size=0;
        while (temp!=null){
            temp=temp.getNext();
            size++;
        }
        temp=list;
        int targetNode=size-n;
        while (targetNode>0 && temp!=null){
            temp=temp.getNext();
            targetNode--;
        }
        System.out.println(temp.getData());
        return temp;
    }
}

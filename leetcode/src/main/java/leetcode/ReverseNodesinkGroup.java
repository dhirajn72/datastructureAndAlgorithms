package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class ReverseNodesinkGroup {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);/*
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);
        head.next.next.next.next.next.next.next=new ListNode(8);*/
        System.out.println(reverseKGroup(head,3));

    }



    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head==null)return null;
        if (k==1)return head;
        int size=0;
        size=getSize(head);
        if (k>size)return head;
        Queue<ListNode> q=new LinkedList<>();
        ListNode temp=head;
        ListNode prev=head;
        int count=1;
        while (head!=null){
            head=head.next;
            count++;
            if (count==k){
                prev=head;
                if (head!=null && prev!=null) {
                    head = head.next;
                    prev.next = null;
                }
                q.offer(temp);
                temp=head;
                prev=head;
                count=1;
            }
        }
        size=getSize(temp);
        if (size<k)q.offer(temp);
        ListNode result=null;
        while (!q.isEmpty()) {
            ListNode front=q.remove();
            size=getSize(front);
            if (size==k) {
                ListNode reverse = reverse(front);
                result = _addToList(result,reverse );
            }
            else
                _addToList(result,front );
        }
        return result;
    }

    private static int getSize(ListNode front) {
        int size=0;
        while (front!=null){
            front=front.next;
            size++;
        }
        return size;
    }

    private static ListNode _addToList(ListNode result, ListNode reverse) {
        if (result==null)
            return reverse;
        else {
            ListNode p,q;
            for(p=result; ((q=p.next)!=null);p=q);
            p.next=reverse;
        }
        return result;
    }

    private static ListNode reverse(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode node= current.next;
            current.next=prev;
            prev=current;
            current=node;
        }
        return prev;
    }
}

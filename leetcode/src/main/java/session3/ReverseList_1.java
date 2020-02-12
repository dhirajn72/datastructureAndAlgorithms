package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 25/01/20
 */
public class ReverseList_1 {

    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        head=new ListNode(1);
        head.next=new ListNode(2);
        System.out.println(head);
        System.out.println(reverseBetween(head,1,2));
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null)return head;
        if (m>n || m==0||n==0) return head;
        if (head.next==null)return head;
        if (m==n)return head;
        ListNode temp=head,prev=null;
        int count=0;
        while (temp!=null){
            prev=temp;
            temp= temp.next;
            count++;
            if (count==m)
                break;

        }
        prev.next=null;
        ListNode prev2=null;
        ListNode head1=temp;
        while (temp!=null){
            prev2=temp;
            temp=temp.next;
            if (count==n)
                break;
            count++;
        }
        if (prev2!=null)prev2.next=null;
        //if (temp==null)return head;
        head1=getReversed(head1);
        addToLast(head,head1);
        addToLast(head,temp);
        return head;
    }

    private static void addToLast(ListNode head, ListNode head1) {
        ListNode temp=head;
        ListNode p,q;
        for (p=head;(q=p.next)!=null;p=q);
        p.next=head1;
    }

    private static ListNode getReversed(ListNode head1) {
        ListNode current=head1,prev=null;
        while (current!=null){
            ListNode node=current.next;
            current.next=prev;
            prev=current;
            current=node;
        }
        return prev;
    }
}

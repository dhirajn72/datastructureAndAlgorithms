package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 10/10/19
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(head);
        System.out.println(reverseBetween(head,1,3));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null)return null;
        if (m>n)return head;
        int i=1;

        ListNode temp=head;
        while (++i<m && temp!=null){
            temp=temp.next;
        }
        ListNode p=temp;
        temp=temp.next;
        p.next=null;
        int j=i;
        ListNode temp2=temp;
        while (j++<n && temp!=null){
            temp=temp.next;
        }
        ListNode q=temp;
        temp=temp.next;
        q.next=null;
        ListNode r=_reverse(temp2);
        ListNode temp3=temp2;
        _insertAtEnd(p,r);
        _insertAtEnd(p,temp);
        return p;
    }

    private static void _insertAtEnd(ListNode head, ListNode r) {
        if (head==null)return;
        else {
            ListNode p,q;
            for (p=head;((q=p.next)!=null);p=q);
            p.next=r;
        }
    }

    private static ListNode _reverse(ListNode root) {
        if (root==null)return null;

        ListNode current=root;
        ListNode prev=null;
        while (current!=null){
            ListNode node=current.next;
            current.next=prev;
            prev=current;
            current=node;
        }
        return prev;

    }
}

package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/09/19
 */

/*
Runtime: 1 ms, faster than 24.59% of Java online submissions for Rotate List.
Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Rotate List.
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(head);
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);

        System.out.println(rotateRight(l,3));

    }


    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null)return null;
        if (head.next==null)return head;
        int size=0;
        ListNode temp=head;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        k=k%size;
        while (k-->0){
            ListNode p,q,r=null;
            for (p=head;(q=p.next)!=null;r=p,p=q);
            r.next=null;
            p.next=head;
            head=p;
        }
        return head;
    }
}

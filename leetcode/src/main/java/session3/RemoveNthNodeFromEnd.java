package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 12/11/19
 */
public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(head);
        head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);

        System.out.println(removeNthFromEnd(head,3));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null)return null;
        if (head.next==null)return null;
        ListNode temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        if (count<n){
            head=head.next;
            return head;
        }
        int k=count-n;
        int i=1;
        temp=head;
        while (i<k){
            temp=temp.next;
            i++;
        }
        if (k==0){
            head=head.next;
        }
        if (temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
    }
}

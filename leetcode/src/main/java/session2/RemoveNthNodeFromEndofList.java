package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode node= DataUtil.getListData();
        node=new ListNode(1);
        node.next=new ListNode(2);
        System.out.println(removeNthFromEnd(node,2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if (size==1){
            head=head.next;
            return head;
        }
        if (n>size || size==n){
            head=head.next;
            return head;
        }
        int index=size-n;
        temp=head;
        ListNode prev=head;
        size=0;
        while (temp!=null && size<index){
            prev=temp;
            temp=temp.next;
            size++;
        }
        if (temp!=null && prev.next!=null)
            prev.next=prev.next.next;
        return head;
    }
}

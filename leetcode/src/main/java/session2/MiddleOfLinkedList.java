package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 08/09/19
 */
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);


        System.out.println(middleNode(head));
    }


    public static ListNode middleNode(ListNode head) {
        if (head==null)return null;
        if (head.next==null)return head;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int middle= size/2;
        temp=head;
        int index=1;
        while (index!=middle  && temp!=null){
            temp=temp.next;
            index++;
        }
        return temp.next;
    }
}

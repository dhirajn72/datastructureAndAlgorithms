package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 21/01/20
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode head=DataUtil.getListData();
        System.out.println(head);
        System.out.println(rotateRight(head,2));

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null)return head;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int n=k>size?k%size:k;
        temp=head;
        ListNode lastNode=null,p=null;
        while (n-->0){
            while (temp!=null){
                p=lastNode;
                lastNode=temp;
                temp=temp.next;
            }
            p.next=null;
            lastNode.next=head;
            temp=lastNode;
            head=lastNode;
        }
        return head;
    }
}

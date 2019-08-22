package leetcode;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println(head);
        head=removeNthFromEnd(head,3);
        System.out.println(head);

    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null)return null;
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if (n==size){
            head=head.next;
            return head;
        }
        int pos=size-n;
        int start=1;
        temp=head;
        while (start<pos && temp.next!=null){
            temp=temp.next;
            start++;
        }
        temp.next=temp.next.next;
        return head;
    }
}

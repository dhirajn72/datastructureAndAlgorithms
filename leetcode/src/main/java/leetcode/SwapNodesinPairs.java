package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);

        System.out.println(swapPairs(head));;
    }

    public static ListNode swapPairs(ListNode head) {
        if (head==null)return null;
        Queue<ListNode> q=new LinkedList<>();
        ListNode temp=head;
        ListNode prev=head;
        int count=1;
        while (head!=null){
            head=head.next;
            count++;
            if (count==2){
                prev=head;
                if (head!=null && prev!=null) {
                    head = head.next;
                    prev.next = null;
                }
            }
            q.offer(temp);
            temp=head;
            prev=head;
            count=1;
        }
        ListNode result=null;
        while (!q.isEmpty()) {
            ListNode reverse=reverse(q.remove());
            System.out.println(reverse);
            result = _addToList(result,reverse );
        }
        return result;
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

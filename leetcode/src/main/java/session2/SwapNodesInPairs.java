package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {
        ListNode head = DataUtil.getListData();
        System.out.println(swapPairs(head));;
    }


    public static ListNode swapPairs(ListNode head) {
        Queue<ListNode> q = new LinkedList<>();
        ListNode temp = head;
        ListNode prev = head;
        int count = 1;
        while (head != null) {
            prev = head;
            head = head.next;
            count++;
            if (count == 2) {
                prev = head;
                if (head!= null && prev!=null) {
                    head = head.next;
                    prev.next = null;
                }
                q.offer(temp);
                temp = head;
                prev = temp;
                count = 1;
            }
        }
        ListNode result=null;
        while (!q.isEmpty()){
            ListNode reversed=_reverse(q.poll());
            result=addToResult(result,reversed);
        }
        return result;
    }

    private static ListNode addToResult(ListNode head, ListNode node) {
        if (head==null)return node;
        else {
            ListNode p,q;
            for(p=head;(q=p.next)!=null;p=q);
            p.next=node;
        }
        return head;
    }

    private static ListNode _reverse(ListNode head) {
        ListNode current=head;
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

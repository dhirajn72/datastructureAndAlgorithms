package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/09/19
 */

/*

Success
Details
Runtime: 141 ms, faster than 7.21% of Java online submissions for Odd Even Linked List.
Memory Usage: 37.4 MB, less than 37.50% of Java online submissions for Odd Even Linked List.
 */
public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode head = DataUtil.getListData();
        System.out.println(oddEvenList(head));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        boolean flag = true;
        ListNode oddResult=null;
        ListNode evenResult=null;
        while (temp != null) {
            if (flag) {
                oddResult = _add(oddResult,temp.val);
                System.out.print(temp.val+">>");
                flag=false;
            } else {
                evenResult = _add(evenResult,temp.val);
                System.out.print(temp.val+"->");
                flag=true;
            }
            temp = temp.next;

        }
        return _add(oddResult,evenResult);
    }

    private static ListNode _add(ListNode result, int val) {
        if (result==null)return new ListNode(val);
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=new ListNode(val);
            return result;
        }
    }private static ListNode _add(ListNode result, ListNode result2) {
        if (result==null)return result2;
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=result2;
            return result;
        }
    }
}

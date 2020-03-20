package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/01/20
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = DataUtil.getListData();
        System.out.println(head);
        reorderList(head);
        System.out.println(head);
    }

    /**
     *
     * Success
     Details
     Runtime: 1354 ms, faster than 5.00% of Java online submissions for Reorder List.
     Memory Usage: 44.9 MB, less than 6.82% of Java online submissions for Reorder List.
     * @param head
     */
    public static void reorderList(ListNode head) {
        if (head == null) return;
        ListNode temp = head;
        Queue<ListNode> queue = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        size=size%2==0?size/2-1:size/2;
        temp=head;
        ListNode prev=null;
        while (size>=0 && temp!=null){
            prev=temp;
            temp=temp.next;
            prev.next=null;
            queue.add(prev);
            size--;
        }
        prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.next;
            prev.next=null;
            stack.push(prev);
        }
        ListNode result=null;
        boolean flag=true;
        while (!queue.isEmpty()|| !stack.isEmpty()) {
            if (flag) {
                result = addToList(result, queue.poll());
                flag=false;
            }
            else {
                addToList(result, stack.pop());
                flag=true;
            }
        }
        while (!stack.isEmpty())
            addToList(result, stack.pop());
    }

    private static ListNode addToList(ListNode node, ListNode top) {
        if (node==null)
            return top;
        ListNode p, q;
        for (p = node; (q = p.next) != null; p = q) ;
        p.next = top;
        return node;
    }

    /**
     * Success
     * Details
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
     * Memory Usage: 41.1 MB, less than 5.71% of Java online submissions for Linked List Cycle.
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        boolean result = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Success
     * Details
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
     * Memory Usage: 41 MB, less than 6.32% of Java online submissions for Linked List Cycle II.
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        boolean result = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                result = true;
                break;
            }
        }
        if (result) {
            fastPtr = head;
            while (fastPtr != slowPtr) {
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
        }
        return slowPtr;
    }
}

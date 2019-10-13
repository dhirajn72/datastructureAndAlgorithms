package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head==null)return false;
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        boolean flag=false;
        while (fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if (slowPtr==fastPtr) {
                flag=true;
                break;
            }
        }
        return flag;
    }
}

package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class LinkedListCycle_II {


    public ListNode detectCycle(ListNode head) {
        if (head==null)return null;
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        boolean flag=false;
        while (fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if (slowPtr==fastPtr) {
                flag=true;
                break;
            }
        }
        if (flag){
            slowPtr=head;
            while (slowPtr!=fastPtr){
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next;
            }
        }
        return slowPtr;
    }
}

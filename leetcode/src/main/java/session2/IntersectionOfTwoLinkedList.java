package session2;

import leetcode.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null && headB==null)return null;
        if (headA==null)return headB;
        if (headB==null)return headA;

        Map<ListNode,ListNode> nodes=new HashMap<>();

        ListNode temp=headA;
        while (temp!=null){
            nodes.put(temp,temp);
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null){
            if (nodes.get(temp)!=null)
                return temp;
            else
                temp=temp.next;
        }
        return null;
    }
}

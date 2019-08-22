package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class IntersectionofTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, ListNode> map=new HashMap<>();
        ListNode temp=headA;
        while (temp!=null){
            map.put(temp,temp);
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null){
            if (map.containsKey(temp.val)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}

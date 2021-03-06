package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 25/01/20
 */
public class RemoveDuplicatesFromSortedList_2 {

    public static void main(String[] args) {
        ListNode head = DataUtil.getDuplicatesListData();
        System.out.println(head);
        head=new ListNode(1);
        head.next=new ListNode(1);
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (!map.containsKey(temp.val))
                map.put(temp.val, 1);
            temp=temp.next;
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        temp = head;

        ListNode last=null;
        boolean isEmpty=true;
        for (Map.Entry<Integer, Integer> e : entries) {
                temp.val = e.getKey();
                last=temp;
                temp=temp.next;
                isEmpty=false;
        }
        if (last!=null)last.next=null;
        if (isEmpty)
            return null;
        return head;
    }
}

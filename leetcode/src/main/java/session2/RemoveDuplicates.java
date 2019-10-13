package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head= DataUtil.getDuplicatesListData();
        System.out.println(head);
        System.out.println(deleteDuplicates(head));


    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null)return head;
        Set<Integer> integers=new LinkedHashSet<>();
        ListNode temp=head;
        while (temp!=null) {
            integers.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        ListNode prev=head;
        for (int e:integers) {
            temp.val = e;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return head;
    }
}

package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class RemoveDuplicates_II {
    public static void main(String[] args) {
        ListNode head= DataUtil.getDuplicatesList();
        System.out.println(head);
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null)return head;
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while (temp!=null){
            map.putIfAbsent(temp.val,0);
            map.put(temp.val,map.get(temp.val)+1);
            temp=temp.next;
        }
        ListNode result=null;
        temp=head;
        while (temp!=null){
            int key=temp.val;
            if (map.get(key)<2){
                result=_addToList(result,key);
            }
            temp=temp.next;
        }
        return result;
    }

    private static ListNode _addToList(ListNode result, int key) {
        if (result==null)
            return new ListNode(key);
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=new ListNode(key);
        }
        return result;
    }
}


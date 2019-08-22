package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class RemoveDuplicatesfromSortedListII {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next.next=new ListNode(5);

        System.out.println(deleteDuplicates(head));
    }


    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while (temp!=null){
            if (map.containsKey(temp.val))
                map.put(temp.val,map.get(temp.val)+1);
            else
                map.put(temp.val,1);
            temp=temp.next;
        }
        ListNode result=null;
        for (int i:map.keySet()){
            if (map.get(i)==1){
                result=_addToList(result,i);
            }
        }
        return result;
    }

    private static ListNode _addToList(ListNode head, int data) {
        if (head==null)
            return new ListNode(data);
        else {
            ListNode p,q;
            for (p=head;((q=p.next)!=null);p=q);
            p.next=new ListNode(data);
        }
        return head;
    }
}

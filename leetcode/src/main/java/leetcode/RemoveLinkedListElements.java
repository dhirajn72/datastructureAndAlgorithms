package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next.next=new ListNode(5);
        System.out.println(removeElements(head,1));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        Map<Integer,Integer> map=new LinkedHashMap<>();
        while (temp!=null){
            map.putIfAbsent(temp.val,0);
            map.put(temp.val,map.get(temp.val)+1);
            temp=temp.next;
        }
        ListNode result=null;
        for (int data:map.keySet()){
            if (data!=val){
                result=_addToList(result,data);
            }
        }
        return result;
    }

    private static ListNode _addToList(ListNode result, int data) {
        if (result==null)
            return new ListNode(data);
        else {
            ListNode p,q;
            for (p=result;((q=p.next)!=null);p=q);
            p.next=new ListNode(data);
        }
        return result;
    }
}

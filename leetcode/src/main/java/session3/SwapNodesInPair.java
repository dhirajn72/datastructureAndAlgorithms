package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 19/11/19
 */
public class SwapNodesInPair {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(swapPairs(head));
    }
    public static ListNode swapPairs(ListNode head) {
        if (head==null)return null;
        if (head.next==null)return head;
        List<ListNode> listNodes=new ArrayList<>();
        ListNode temp=head;
        int i=0;
        ListNode q=temp;
        while (temp!=null){
            if (i==1){
                ListNode p=temp;
                temp=temp.next;
                p.next=null;
                listNodes.add(q);
                q=temp;
                i=0;
            }
            else {
                temp = temp.next;
                i++;
            }
        }
        listNodes.add(q);
        ListNode result=null;
        for (ListNode l:listNodes){
            ListNode reversed=reverseList(l);
            result=addToList(result,reversed);
        }
        return result;
    }

    private static ListNode addToList(ListNode result, ListNode reversed) {
        if (result==null)return reversed;
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=reversed;
        }
        return result;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode current=head,prev=null;
        while (current!=null){
            ListNode node=current.next;
            current.next=prev;
            prev=current;
            current=node;
        }
        return prev;
    }
}

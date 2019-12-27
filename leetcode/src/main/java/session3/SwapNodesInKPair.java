package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 19/11/19
 */
public class SwapNodesInKPair {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(reverseKGroup(head,3));
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head==null)return null;
        if (head.next==null)return head;
        List<ListNode> listNodes=new ArrayList<>();
        ListNode temp=head;
        int i=1;
        ListNode q=temp;
        while (temp!=null){
            if (i==k){
                ListNode p=temp;
                temp=temp.next;
                p.next=null;
                listNodes.add(q);
                q=temp;
                i=1;
            }
            else {
                temp = temp.next;
                i++;
            }
        }
        listNodes.add(q);
        System.out.println(listNodes);
        ListNode result=null;
        for (ListNode l:listNodes){
            ListNode reversed=null;
            if (getLength(l)==k) {
                 reversed = reverseList(l);
                 result = addToList(result, reversed);
            }
            else {
                result = addToList(result, l);
            }
        }
        return result;
    }

    private static int getLength(ListNode l) {
        int count=0;
        while (l!=null){
            l=l.next;
            count++;
        }
        return count;
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

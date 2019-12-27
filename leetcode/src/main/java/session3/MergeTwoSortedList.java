package session3;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/11/19
 */
public class MergeTwoSortedList {

    public static void main(String[] args) {
        ListNode l1= DataUtil.getListData();
        ListNode l2=DataUtil.getListData();
        System.out.println(mergeTwoLists(l1,l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null)return null;
        if (l1==null)return l2;
        if (l2==null)return l1;

        ListNode p1=l1;
        ListNode p2=l2;
        List<ListNode> listNodes=new ArrayList<>();
        while (p1!=null && p2!=null){
            ListNode temp=null;
            if (p1.val<p2.val){
                temp=p1;
                p1=p1.next;
                temp.next=null;
                listNodes.add(temp);
            }
            else {
                temp=p2;
                p2=p2.next;
                temp.next=null;
                listNodes.add(temp);
            }
        }
        if (p1==null)
            listNodes.add(p2);
        else
            listNodes.add(p1);
        ListNode result=null;
        for (ListNode l:listNodes){
            result=_addToList(result,l);
        }
        return result;
    }

    private static ListNode _addToList(ListNode head, ListNode l) {
        if (head==null)
            return l;
        else {
            ListNode p,q;
            for (p=head;(q=p.next)!=null;p=q);
            p.next=l;
            return head;
        }
    }
}

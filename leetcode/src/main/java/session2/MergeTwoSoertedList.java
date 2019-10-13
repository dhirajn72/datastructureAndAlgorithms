package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 29/08/19
 */
public class MergeTwoSoertedList {
    public static void main(String[] args) {
        ListNode l1= DataUtil.getListData();
        ListNode l2= new ListNode(3);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(19);
        l2.next.next.next.next=new ListNode(29);
        l2.next.next.next.next.next=new ListNode(39);

        ListNode result=_mergeLists(l1,l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(result);

    }

    /**
     *
     * Incomplete
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode _mergeLists(ListNode l1, ListNode l2) {
        ListNode res=null;
        while (l1!=null && l2!=null){
            ListNode temp=null;
            if (l1.val<l2.val){
                temp=l1;
                l1=l1.next;
                temp.next=null;
                res=_addToList(res,temp);
            }
            else if (l1.val>l2.val){
                temp=l2;
                l2=l2.next;
                temp.next=null;
                res=_addToList(res,temp);
            }
            else {
                temp=l1;
                l1=l1.next;
                temp.next=null;
                res=_addToList(res,temp);
                temp=l2;
                l2=l2.next;
                temp.next=null;
                res=_addToList(res,temp);

            }
        }
        if (l1==null)res=_addToList(res,l2);
        if (l2==null)res=_addToList(res,l1);
        return res;
    }

    private static ListNode _addToList(ListNode result, ListNode temp) {
        if (result==null)return temp;
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=temp;
            return result;
        }
    }
}

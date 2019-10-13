package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class RemoveLinkedListElement {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(6);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        System.out.println(removeElements(head,6));


    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head==null)return null;
        ListNode temp=head;
        int[] arr=new int[1000];
        while (temp!=null){
            arr[temp.val]=temp.val;
            temp=temp.next;
        }
        arr[val]=-1;
        temp=head;
        ListNode result=null;
        while (temp!=null){
            result=_addToList(result,arr[temp.val]);
            temp=temp.next;

        }
        return result;
    }

    private static ListNode _addToList(ListNode result, int e) {
        if (e==-1){}
        else if (result==null)
            return new ListNode(e);
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=new ListNode(e);
        }
        return result;
    }
}

package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(head));

    }

    public static boolean isPalindrome(ListNode head) {
        String s=_getListData(head);
        String s1=_getListDataReversed(head);
        return s.equalsIgnoreCase(s1);
    }

    private static String _getListData(ListNode head) {
        if (head==null)return "";
        else return head.val+""+_getListData(head.next);
    }
    private static String _getListDataReversed(ListNode head) {
        if (head==null)return "";
        else return _getListData(head.next)+""+head.val;
    }

    /*public static boolean isPalindrome(ListNode head) {
        if (head==null)return true;
        String s="";
        ListNode temp=getCopy(head);
        ListNode reversed=_reverseList(head);
        while (temp!=null){
            if (temp.val!=reversed.val)return false;
            else {
                temp=temp.next;
                reversed=reversed.next;
            }
        }
        return true;
    }

    private static ListNode getCopy(ListNode head) {
        if (head==null)return null;
        else {
            ListNode node=null;
            ListNode temp=head;
            while (temp!=null){
                node=_add(node,temp.val);
                temp=temp.next;
            }
            return node;
        }
    }

    private static ListNode _add(ListNode node, int val) {
        if (node==null)return new ListNode(val);
        else {
            ListNode p,q;
            for (p=node;(q=p.next)!=null;p=q);
            p.next=new ListNode(val);
            return node;
        }
    }

    private static ListNode _reverseList(ListNode head) {
        ListNode currentNode=head;
        ListNode prev=null;
        while (currentNode!=null){
            ListNode node=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=node;
        }
        return prev;
    }*/
}

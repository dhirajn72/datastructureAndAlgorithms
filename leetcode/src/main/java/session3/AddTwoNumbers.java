package session3;

import leetcode.ListNode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 09/11/19
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        addTwoNumbers(l1,l2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger res=new BigInteger(_getSum(l1)).add(new BigInteger(_getSum(l2)));
        String r=String.valueOf(res);
        ListNode root=null;
        for (int i = r.length()-1; i >=0 ; i--) {
            root=_addToList(root,r.charAt(i));
        }
        return root;
    }

    private static ListNode _addToList(ListNode root, char c) {
        if (root==null) {
            String val=c+"";
            return new ListNode(Integer.valueOf(val));
        }
        else {
            ListNode p,q;
            for (p=root;(q=p.next)!=null ; p=q) ;
            String val=c+"";
            p.next=new ListNode(Integer.valueOf(val));
            return root;
        }
    }

    private static String _getSum(ListNode l2) {
        if (l2.next==null) {
            return l2.val+"";
        }
        return _getSum(l2.next)+""+l2.val;
    }
}

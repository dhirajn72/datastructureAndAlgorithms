package session2;

import leetcode.ListNode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class AddTwoNumbers_II {
    public static void main(String[] args) {

        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(2);
        l2.next.next=new ListNode(3);
        System.out.println(addTwoNumbers(l1,l2));


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null && l2==null)return null;
        if (l1==null)return l2;
        if (l2==null)return l1;
        ListNode temp=l1;
        String l1Str="";
        while (temp!=null){
            l1Str+=temp.val;
            temp=temp.next;
        }
        temp=l2;
        String l2Str="";
        while (temp!=null){
            l2Str+=temp.val;
            temp=temp.next;
        }
        String add=String.valueOf(new BigInteger(l1Str).add(new BigInteger(l2Str)));
        ListNode result=null;
        for (int i = 0; i <add.length() ; i++) {
            result=_add(result,add.charAt(i)+"");
        }
        return result;
    }

    private static ListNode _add(ListNode result, String s) {
        if (result==null)return new ListNode(Integer.valueOf(s));
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=new ListNode(Integer.valueOf(s));
        }
        return result;
    }
}

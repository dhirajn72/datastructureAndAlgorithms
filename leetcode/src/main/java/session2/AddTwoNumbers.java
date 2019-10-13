package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 22/08/19
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1= DataUtil.getListData();
        ListNode l2= DataUtil.getListData();
        System.out.println(addTwoNumbers(l1,l2));;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String val1=_getNumbers(l1);
        String val2=_getNumbers(l2);
        BigInteger sum=new BigInteger(val1).add(new BigInteger(val2));
        val1=String.valueOf(sum);
        ListNode result=null;
        for (int i = val1.length()-1; i >=0; i--) {
            result=_addToList(result,""+val1.charAt(i));
        }
        return result;
    }

    private static ListNode _addToList(ListNode result, String s) {
        if (result==null)return new ListNode(Integer.valueOf(s));
        else {
            ListNode p,q;
            for (p=result;(q=p.next)!=null;p=q);
            p.next=new ListNode(Integer.valueOf(s));
        }
        return result;
    }

    private static String _getNumbers(ListNode l1) {
        if (l1==null)return "";
        else return _getNumbers(l1.next)+""+l1.val;
    }
}

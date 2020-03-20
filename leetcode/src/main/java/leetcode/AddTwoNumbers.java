package leetcode;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class AddTwoNumbers {

    /*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

[9]
[1,9,9,9,9,9,9,9,9,9]
     */
    public static void main(String[] args) {
        ListNode list1=new ListNode(9);


        ListNode list2=new ListNode(1);
        list2.next=new ListNode(2);
        list2.next.next=new ListNode(3);
        list2.next.next.next=new ListNode(4);
        list2.next.next.next.next=new ListNode(5);
        list2.next.next.next.next.next=new ListNode(6);
        list2.next.next.next.next.next.next=new ListNode(7);
        list2.next.next.next.next.next.next.next=new ListNode(8);
        list2.next.next.next.next.next.next.next.next=new ListNode(9);
        //list2.next.next.next.next.next.next.next.next.next=new ListNode(9);

        addTwoNumbers(list1,list2);

        System.out.println(_recursivelyAdd(list2));

    }


    public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        if (list1==null&& list2==null)return null;
        if (list1==null && list2!=null)return list2;
        if (list1!=null && list2==null)return list1;
        String s1=_recursivelyAdd(list1);
        String s2=_recursivelyAdd(list2);
        String res=String.valueOf(new BigInteger(s1).add(new BigInteger(s2)));
        //System.out.println(res);
        char[] arr=res.toCharArray();
        ListNode result=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            String s=arr[i]+"";
            result = _addToList(result, Integer.valueOf(s));
        }
        System.out.println(result);
        return result;
    }

    public static ListNode  _addToList(ListNode root,int ch){
        if (root==null)
            root=new ListNode(ch);
        else {
            ListNode p,q;
            for (p = root; ((q=p.next)!=null); p=q);
            p.next=new ListNode(ch);
        }
        return root;
    }
    private static String _recursivelyAdd(ListNode root) {
        if (root==null)return "";
        else return _recursivelyAdd(root.next)+""+root.val;
    }

}

package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class SortList {

    public static void main(String[] args) {
        ListNode head=new ListNode(6);
        head.next=new ListNode(3);
        head.next.next=new ListNode(7);
        head.next.next.next=new ListNode(1);
        head.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next=new ListNode(5);
        System.out.println(sortList(head));
    }

    /**
     *
     * Time limit exceeds
     * @param head
     * @return
     */
    /*public static ListNode sortList(ListNode head) {
        ListNode temp=head;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while (temp!=null){
            s1.push(temp.val);
            temp=temp.next;
        }
        while (!s1.isEmpty()){
            int t=s1.pop();
            while (!s2.isEmpty() && s2.peek()<t){
                s1.push(s2.pop());
            }
            s2.push(t);
        }
        ListNode result=null;
        while (!s2.isEmpty())
            result=_addToList(result,s2.pop());
        return result;
    }
    private static ListNode _addToList(ListNode result, int pop) {
        if (result==null)
            return new ListNode(pop);
        else {
            ListNode p,q;
            for (p=result;((q=p.next)!=null);p=q);
            p.next=new ListNode(pop);
        }
        return result;
    }*/

    public static ListNode sortList(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int[] arr=new int[size];
        temp=head;
        int index=0;
        while (temp!=null){
            arr[index++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode result=null;
        for (int i = 0; i <arr.length ; i++)
            result=_addToList(result,arr[i]);
        return result;
    }

    private static ListNode _addToList(ListNode result, int pop) {
        if (result==null)
            return new ListNode(pop);
        else {
            ListNode p,q;
            for (p=result;((q=p.next)!=null);p=q);
            p.next=new ListNode(pop);
        }
        return result;
    }
}

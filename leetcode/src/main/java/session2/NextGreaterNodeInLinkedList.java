package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/09/19
 */
public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListDataShuffled();
        System.out.println(Arrays.toString(nextLargerNodes(head)));
    }

    public static int[] nextLargerNodes(ListNode head) {
        if (head==null)return new int[]{};
        ListNode i;
        ListNode j;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int index=0;
        int[] arr=new int[size];
        for (i=head;i.next!=null;i=i.next) {
            int max=i.val;
            for (j=i;j!=null;j=j.next) {
                if (max<j.val) {
                    max=j.val;
                    break;
                }
            }
            if (i.val<max)
                arr[index++]=max;
            else arr[index++]=0;

        }
        return arr;
    }
}

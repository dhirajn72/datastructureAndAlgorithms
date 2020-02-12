package session3;

import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/01/20
 */
public class PartitionList {


    public static ListNode partition(ListNode head, int x) {
        if (head==null)return head;
        List<Integer> leftList=new ArrayList<>();
        List<Integer> rightList=new ArrayList<>();
        ListNode temp=head;
        boolean foundGreater=false;
        while (temp!=null ){
            if (temp.val<x) {
                leftList.add(temp.val);
            }
            else {
                rightList.add(temp.val);
            }
            temp=temp.next;
        }
        temp=head;
        for(int i:leftList){
            temp.val=i;
            temp=temp.next;
        }
        for(int i:rightList){
            temp.val=i;
            temp=temp.next;
        }
        return head;
    }
}

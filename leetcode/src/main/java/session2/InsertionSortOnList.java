package session2;

import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 07/10/19
 */
public class InsertionSortOnList {

    public ListNode insertionSortList(ListNode head) {
        if (head==null)return null;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int[] ints=new int[size];
        int index=0;
        temp=head;
        while (temp!=null){
            ints[index++]=temp.val;
            temp=temp.next;
        }
        _insertionSort(ints);
        temp=head;
        for (int i:ints){
            temp.val=i;
            temp=temp.next;
        }
        return head;
    }

    private void _insertionSort(int[] ints) {
        int key=0,j=0;
        for (int i = 1; i < ints.length; i++) {
            key=ints[i];
            j=i-1;
            while (j>=0 && ints[j]>key){
                ints[j+1]=ints[j];
                j=j-1;
            }
            ints[j+1]=key;
        }
    }
}

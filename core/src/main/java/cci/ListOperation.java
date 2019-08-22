package cci;

import com.java.algorithms.ListNode;
import com.java.utils.DataUtils;

import java.util.ArrayList;

/**
 * @author Dhiraj
 * @date 24/06/19
 */
public class ListOperation {
    public static void main(String[] args) {
        ListNode list = DataUtils.getList().getRoot();
        System.out.println(list);
        System.out.println( _returnKthToLast(list, 3));// [12,13,14]
        _deleteMiddleNode(list);
        _palindromList(list);

        ListNode listNode = DataUtils._getLoopedList();
        _detectLoop(listNode);
        _removeDuplicates(list);
        System.out.println(list);

    }

    private static void _removeDuplicates(ListNode list) {
        ListNode temp=list;
        boolean[] booleans= new boolean[128];
        ListNode prev=null;
        while (temp!=null){
            if (booleans[temp.getData()]){
                prev.setNext(prev.getNext().getNext());
            }
            else booleans[temp.getData()]=true;
            prev=temp;
            temp=temp.getNext();
        }
    }

    private static void _detectLoop(ListNode list) {
        ListNode slowPtr=list;
        ListNode fastPtr=list;
        boolean flag=false;
        while (slowPtr!=null && fastPtr.getNext()!=null){
            slowPtr=slowPtr.getNext();
            fastPtr=fastPtr.getNext().getNext();
            if (slowPtr==fastPtr){
                System.out.println("Loop exists!");
                slowPtr=list;
                flag=true;
                break;
            }
        }
        if (flag){
            while (slowPtr!=fastPtr){
                slowPtr=slowPtr.getNext();
                fastPtr=fastPtr.getNext();
            }
            System.out.println("Loop exists at>>"+slowPtr.getData());
        }
    }

    private static void _palindromList(ListNode list) {
        ListNode temp=list;
        ListNode reversed=_reverseList(list);
        while (temp!=null){
            if (temp.getData()!=reversed.getData()){
                System.out.println("Not Palindrome");
                return;
            }
            temp=temp.getNext();
            reversed=reversed.getNext();
        }
        System.out.println("Palindrome");
    }

    private static ListNode _reverseList(ListNode list) {
        ListNode current=list;
        ListNode prev=null;
        while (current!=null){
            ListNode node= current.getNext();
            current.setNext(prev);
            prev=current;
            current=node;
        }
        return prev;
    }

    private static void _deleteMiddleNode(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.getNext();
            size++;
        }
        temp=head;
        ListNode prev=null;
        int count=0;
        while (temp!=null && count<size/2){
            prev=temp;
            temp=temp.getNext();
            count++;
        }
        ListNode deleted=prev.getNext();
        prev.setNext(deleted.getNext());
        deleted.setNext(null);
        System.out.println("Deleted elemet is::"+deleted.getData());
        System.out.println(head);

    }

    private static ArrayList<Integer> _returnKthToLast(ListNode list, int k) {
        ListNode temp = list;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i < k; i++)
            temp = temp.getNext();
        while (temp != null) {
            integerArrayList.add(temp.getData());
            temp = temp.getNext();
        }
        return integerArrayList;
    }
}

package com.java.linkedlist.practice;

import com.java.linkedlist.ListNode;
import com.java.linkedlist.questions.DataUtils;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class ListOperations {
    public static void main(String[] args) {
        ListNode head = DataUtils.getList();
        System.out.println(head);
        //System.out.println(_findKthNodeFromEnd(head, 30));
        ListNode cyclic = DataUtils.getCyclicList();
        /*System.out.println(_isCyclic(cyclic));
        System.out.println(_findHeadOfCycle(cyclic));
        System.out.println(_findLenthOfCycle(cyclic));
        System.out.println(head);
        //System.out.println(_reverseList(head));
        System.out.println(_getMiddleNodeOfList(head));
        System.out.println(_printReverse(head));
        System.out.println("****");
        //System.out.println(_reverseWithK(head, 3));
        //TODO! Convert this 1->2->3->4->5->6->7->8->null  to 1->8->2->7->3->6->4->5->null
        ListNode l=new ListNode(1);
        l.setNext(new ListNode(2));
        l.getNext().setNext(new ListNode(3));

        System.out.println(_exchangeAlternateNodeFromLast(l));// use head here

        System.out.println(head);
        System.out.println("Rotated::");
        System.out.println(_rotateListByK(head, 400));*/

        // TODO! Delete me!
        ListNode n= new ListNode(1);
        //ListNode n2=new ListNode(2);
        //n.setNext(n2);
        //n.getNext().setNext(n);
        /*n.getNext().setNext(new ListNode(3));
        n.getNext().getNext().setNext(new ListNode(4));
        n.getNext().getNext().getNext().setNext(n2);*/

        ListNode node=_findHeadOfCycle(n);
        System.out.println(node);


    }

    private static ListNode _rotateListByK(ListNode head, int k) {
        if (head==null)return null;
        else {
            while (k>0) {
                ListNode prev1=null,prev2=null;
                ListNode temp=head;
                while (temp != null) {
                    prev1 = prev2;
                    prev2 = temp;
                    temp = temp.getNext();
                }
                prev1.setNext(null);
                prev2.setNext(head);
                System.out.println(prev2);
                k--;
                head=prev2;
            }
        }
        return null;
    }

    private static ListNode _exchangeAlternateNodeFromLast(ListNode head) {
        if (head==null)return null;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        if (size==1)return head;
        temp = head;
        ListNode prev = null, q;
        int count = 0;
        while (temp != null && count < size / 2) {
            prev = temp;
            temp = temp.getNext();
            count++;
        }
        prev.setNext(null);
        Stack<ListNode> headStack = new Stack<>();
        Stack<ListNode> tempStack = new Stack<>();
        while (temp != null) {
            q = temp;
            temp = temp.getNext();
            q.setNext(null);
            tempStack.push(q);
        }
        head = _reverseList(head);
        while (head != null) {
            q = head;
            head = head.getNext();
            q.setNext(null);
            headStack.push(q);
        }
        while (!headStack.isEmpty()) {
            head = _addToList(head, headStack.pop());
            if (!tempStack.isEmpty()) {
                head = _addToList(head, tempStack.pop());
            }
        }
        if (!tempStack.isEmpty())
            head = _addToList(head, tempStack.pop());
        return head;
    }

    private static ListNode _reverseWithK(ListNode head, int k) {
        ListNode temp = head;
        ListNode originalList = null;
        int count = 1;
        while (head != null) {
            head = head.getNext();
            count++;
            if (count == k && head != null) {
                ListNode last = head;
                head = head.getNext();
                last.setNext(null);
                originalList = _reverseAndAdd(originalList, temp);
                temp = head;
                count = 1;
            }
        }
        originalList = _addToList(originalList, temp);
        return originalList;
    }

    private static ListNode _reverseAndAdd(ListNode originalList, ListNode temp) {
        if (originalList == null)
            return _reverseList(temp);
        else {
            ListNode node = _reverseList(temp);
            return _addToList(originalList, node);
        }
    }

    private static ListNode _addToList(ListNode head, ListNode temp) {
        if (head == null)
            return temp;
        else {
            ListNode p, q;
            for (p = head; (q = p.getNext()) != null; p = q) ;
            p.setNext(temp);
            return head;
        }
    }

    private static ListNode _printReverse(ListNode head) {
        if (head == null)
            return null;
        else {
            System.out.print(head.getData() + ", ");
            return _printReverse(head.getNext());
        }
    }

    private static ListNode _getMiddleNodeOfList(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        temp = head;
        int count = 1;
        while (temp != null && count < size / 2) {
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    private static ListNode _reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode node = current.getNext();
            current.setNext(prev);
            prev = current;
            current = node;
        }
        return prev;
    }

    private static int _findLenthOfCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean flag = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                flag = true;
                break;
            }
        }
        if (flag) {
            fastPtr = head;
            while (fastPtr != slowPtr) {
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
            }
        }
        int count = 0;
        do {
            fastPtr = fastPtr.getNext();
            count++;
        } while (fastPtr != slowPtr);
        return count;
    }

    /*private static int _findHeadOfCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean flag = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                flag = true;
                break;
            }
        }
        if (flag) {
            fastPtr = head;
            while (fastPtr != slowPtr) {
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
            }
            return slowPtr.getData();
        }
        return 0;
    }*/
    private static ListNode _findHeadOfCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean flag = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                flag = true;
                break;
            }
        }
        if (flag) {
            fastPtr = head;
            while (fastPtr != slowPtr) {
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
            }
            return slowPtr;
        }
        if (!flag)return null;
        return head;
    }

    private static boolean _isCyclic(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean flag = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static int _findKthNodeFromEnd(ListNode head, int k) {
        if (head == null) throw new ArrayIndexOutOfBoundsException();
        else {
            int count = 0;
            ListNode temp = head;
            while (temp != null) {
                temp = temp.getNext();
                count++;
            }
            temp = head;
            for (int i = 0; i < count - k; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }
}

package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 19/06/19
 */
public class ReverseListKNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        System.out.println(head);
        //reversNodes(head, 3);// Bug, reverses last 2 nodes as well
        _reversNodesAnotherWay(head, 3);// Bug, reverses last 2 nodes as well

        //reverseList(head);
        // printReverse(head);


    }

    private static void _reversNodesAnotherWay(ListNode head, int n) {
        ListNode[] listArr = new ListNode[100];
        ListNode temp = head;
        int count = 1;
        ListNode prev = null;
        int index = 0;
        while (head != null) {
            if (count < n) {
                head = head.getNext();
                count++;
            } else {
                prev = head;
                head = head.getNext();
                prev.setNext(null);
                listArr[index++] = temp;
                count = 1;
                temp = head;
            }
        }
        listArr[index++] = temp;
        ListNode reversedList = null;
        ListNode originalList = null;

        for (int i = 0; i < listArr.length; i++) {
            reversedList = _reverse(listArr[i]);
            if (originalList == null) {
                originalList = reversedList;
            } else {
                _insert(originalList, reversedList);
            }
        }
        System.out.println(originalList);
    }

    private static void _insert(ListNode originalList, ListNode reversedList) {
        ListNode listNode = originalList;
        ListNode prev = null;
        while (listNode != null) {
            prev = listNode;
            listNode = listNode.getNext();
        }
        prev.setNext(reversedList);
    }

    private static ListNode _reverse(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.getNext();
            count++;
        }
        if (count == 3) {
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
        return head;
    }

    private static void printReverse(ListNode head) {
        if (head.getNext() != null)
            printReverse(head.getNext());
        System.out.print(head.getData() + ",");
    }

    private static void reversNodes(ListNode head, int k) {
        ListNode originalList = null;
        while (head != null) {
            ListNode temp = head;
            int count = 0;

            while (++count < 3 && head.getNext() != null) {
                head = head.getNext();
            }

            ListNode temp2 = head.getNext();
            head.setNext(null);
            if (originalList == null)
                originalList = reverseList(temp);
            else {
                originalList = addListAtEnd(originalList, reverseList(temp));
            }
            head = temp2;
            count = 0;
        }
        System.out.println(originalList);
    }

    private static ListNode addListAtEnd(ListNode originalList, ListNode node) {
        ListNode current = originalList;
        ListNode prev = null;
        while (current != null) {
            prev = current;
            current = current.getNext();
        }
        prev.setNext(node);
        return originalList;
    }

    private static ListNode reverseList(ListNode root) {
        ListNode current = root;
        ListNode prev = null;
        while (current != null) {
            ListNode node = current.getNext();
            current.setNext(prev);
            prev = current;
            current = node;
        }
        // System.out.println(prev);
        return prev;
    }
}

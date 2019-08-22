package com.karumanchi;

import com.java.stack.ListNode;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class CheckPalindrom {
    public static void main(String[] args) {
        String str = "abcXcba";
        ListNode list= new ListNode(1);
        list.setNext(new ListNode(2));
        list.getNext().setNext(new ListNode(3));
        list.getNext().getNext().setNext(new ListNode(2));
        list.getNext().getNext().getNext().setNext(new ListNode(1));

        System.out.println(_isPalindrom(str));
        System.out.println(_isPalindrom(list));
    }

    private static boolean _isPalindrom(ListNode head) {
        StringBuilder builder= new StringBuilder();
        java.util.Stack<Integer> integers= new java.util.Stack();
        while (head!=null){
            builder.append(head.getData());
            integers.push(head.getData());
            head=head.getNext();
        }
        StringBuilder builder1= new StringBuilder();
        for (int i:integers)
            builder1.append(String.valueOf(i));
        return builder.toString().equals(builder1.toString());
    }

    private static boolean _isPalindrom(String str) {
        int i = 0, j = str.length() - 1;
        while (i<j && str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        if (i==j)
            return true;
        return false;
    }
}

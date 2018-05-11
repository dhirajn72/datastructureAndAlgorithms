package com.java.linkedlist.questions;


import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 09/05/18
 */
public class FindHeadOfLoopInList {
    public ListNode findHeadOfLoop(ListNode root){

        ListNode fastPtr=root;
        ListNode slowPtr=root;
        boolean loopExists=false;

        while (fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr=fastPtr.getNext().getNext();
            slowPtr=slowPtr.getNext();
            if (slowPtr==fastPtr){
                loopExists=true;
                break;
            }
        }
        if (loopExists){
            slowPtr=root;
            while (slowPtr!=fastPtr){
                fastPtr=fastPtr.getNext();
                slowPtr=slowPtr.getNext();

            }
            return fastPtr;
        }else
            return null;
    }
}

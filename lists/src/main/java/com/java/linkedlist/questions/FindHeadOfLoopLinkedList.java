package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class FindHeadOfLoopLinkedList {

    public ListNode getHeadOfLoopInList(ListNode root){

        ListNode slowPtr=root;
        ListNode fastPtr=root;
        boolean loopExist=false;

        while (fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr= fastPtr.getNext().getNext();
            slowPtr=slowPtr.getNext();
            if (slowPtr==fastPtr){
                loopExist=true;
                break;
            }
        }
        if (loopExist){
            slowPtr=root;
            while (slowPtr!=fastPtr){
                slowPtr=slowPtr.getNext();
                fastPtr=fastPtr.getNext();
            }
            return fastPtr;
        }
        return  null;
    }

}

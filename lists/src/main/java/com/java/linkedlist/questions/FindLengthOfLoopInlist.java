package com.java.linkedlist.questions;

import com.java.linkedlist.ListNode;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class FindLengthOfLoopInlist {

    public int findLengthOfLoop(ListNode root){
        ListNode slowPtr=root;
        ListNode fastPtr=root;
        boolean loopExists=false;

        while (fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr=fastPtr.getNext().getNext();
            slowPtr=slowPtr.getNext();
            if (slowPtr==fastPtr){
                loopExists=true;
                break;
            }
        }
        int length=0;
        if (loopExists){
            do {
                slowPtr=slowPtr.getNext();
                length++;
            }while (slowPtr!=fastPtr);
        }
        return length;
    }

}

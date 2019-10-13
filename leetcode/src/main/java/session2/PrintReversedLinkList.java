package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class PrintReversedLinkList {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(_reverseRecursive(head));;
    }

    private static String _reverseRecursive(ListNode head) {
        if (head==null)return "";
        else return /*_reverseRecursive(head.next)+""+head.val;*/head.val+""+_reverseRecursive(head.next);
    }
}

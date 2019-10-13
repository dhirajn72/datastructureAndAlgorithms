package session2;

import leetcode.DataUtil;
import leetcode.ListNode;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ListReverse {
    public static void main(String[] args) {
        ListNode head= DataUtil.getListData();
        System.out.println(head);
        System.out.println(_reverse(head));
    }
    private static String _reverse(ListNode head) {
        if (head==null)
            return "";
        else
            return //_reverse(head.next)+""+head.val;
                    head.val+""+_reverse(head.next);
    }
}

package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class ConvertSortedListtoBinarySearchTree {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        TreeNode_1 result=_sortedArrayToBST(arr,0,arr.length-1);
        System.out.println(isBST(result));
    }


    public static TreeNode_1 sortedListToBST(ListNode head) {
        if (head==null)return null;
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int[] arr=new int[size];
        temp=head;
        int index=0;
        while (temp!=null){
            arr[index++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        TreeNode_1 result=_sortedArrayToBST(arr,0,arr.length-1);
        System.out.println(isBST(result));
        return result;
    }

    private static boolean isBST(TreeNode_1 root) {
        return _isBST(root);
    }

    private static boolean _isBST(TreeNode_1 root) {
        if (root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;
        if (root.val>root.left.val && root.val<root.right.val)
            return true;
        return _isBST(root.left) && _isBST(root.right);

    }

    private static TreeNode_1 _sortedArrayToBST(int[] arr, int start, int end) {
        if (start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode_1 root=new TreeNode_1(arr[mid]);
        root.left=_sortedArrayToBST(arr,start,mid-1);
        root.right=_sortedArrayToBST(arr,mid+1,end);
        return root;
    }
}

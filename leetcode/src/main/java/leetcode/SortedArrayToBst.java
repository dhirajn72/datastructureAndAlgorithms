package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/08/19
 */
public class SortedArrayToBst {
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
        System.out.println(Arrays.toString(arr));

        TreeNode_1 tree=_sortedArrayToBST(arr,0,arr.length-1);
        DeleteNodeFromBinarySearchTree._levelOrder(tree);
        System.out.println(tree);


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

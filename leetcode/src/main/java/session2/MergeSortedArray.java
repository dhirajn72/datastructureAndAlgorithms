package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 05/09/19
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1==null || nums2==null)return;
        int[] arr=new int[m+n];
        int index=0;
        for (int i = 0; i < m; i++) {
            arr[index++]=nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[index++]=nums2[i];
        }
        Arrays.sort(arr);
        index=0;
        for (int i:arr)
            nums1[index++]=i;
    }
}

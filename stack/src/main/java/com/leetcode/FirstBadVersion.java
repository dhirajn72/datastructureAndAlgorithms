package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));

    }

    public static int firstBadVersion(int n) {
        int i = 0;
        int[] arr = new int[n];
        while (i != n)
            arr[i] = ++i;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high-low) / 2;
            boolean res = isBadVersion(mid);
            if (res == false) {
                low = mid + 1;
            }
            if (res==true){
                high=mid-1;
            }
        }
        return low;
    }

    private static boolean isBadVersion(int mid) {
        if (mid == 7) {
            System.out.println("Found!!");
            return true;
        }
        return false;
    }
}

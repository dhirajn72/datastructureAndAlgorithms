package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class Median {

    public static void main(String[] args) {
        //System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));

    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] largeArr=new int[arr1.length+arr2.length];
        int index=0;
        for (int i:arr1)
            largeArr[index++]=i;
        for (int i:arr2)
            largeArr[index++]=i;
        Arrays.sort(largeArr);
        double median=0;
        System.out.println(Arrays.toString(largeArr));
        if (largeArr.length%2==0){
            int mid=largeArr.length/2;
            --mid;
            median=(double) (largeArr[mid]+largeArr[mid+1])/2;
        }
        else {
            median=largeArr[(largeArr.length/2)];
            System.out.println(median);
        }
        return median;
    }
}

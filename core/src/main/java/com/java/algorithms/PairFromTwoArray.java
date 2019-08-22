package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 28/06/19
 */
public class PairFromTwoArray {
    public static void main(String[] args) {
        int[] arr1={4,3,7,5,1,9};
        int[] arr2={4,6,2,9,1,6};
        int target =18;
        findPairFromTwoArray(arr1,arr2,target);
    }

    private static void findPairFromTwoArray(int[] arr1, int[] arr2, int target) {
        int[] ints=new int[100];
        for (int item:arr1)
            ints[item]=item;
        for (int item:arr2) {
            int find=target-item;
            if (ints[find]+item==target){
                System.out.println("arr1[]:"+find +",arr2[]:"+item +"="+target);
                break;
            }
        }
    }
}

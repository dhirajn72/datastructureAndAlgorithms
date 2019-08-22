package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 28/06/19
 */
public class ArrayTwoSum {
    public static void main(String[] args) {

        // Given nums = [2, 7, 11, 15], target = 9,
        // Because nums[0] + nums[1] = 2 + 7 = 9,
        // return [0, 1].
        int[] nums = {2, 7, 11, 15};
        findSums(nums,9);



    }

    private static void findSums(int[] arr,int target) {
        int[] ints=new int[100];
        for (int i=0;i<arr.length;i++)
            ints[arr[i]]=arr[i];

        for (int i=0;i<arr.length;i++){
            int index=target-arr[i];
            if (ints[index]+arr[i]==target){
                System.out.println(i+":"+index);
                break;
            }
        }
    }
}

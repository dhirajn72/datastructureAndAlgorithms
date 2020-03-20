package session3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 24/11/19
 */
public class PermutationsOfArray {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        if (nums==null)return new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        _permute(nums,0,list);
        return list;

    }

    private static void _permute(int[] nums, int i, List<List<Integer>> list) {
        if (i==nums.length){
            List<Integer> integers=new ArrayList<>();
            for (int e:nums)
                integers.add(e);
            list.add(integers);
        }
        else {
            for (int j = i; j < nums.length; j++) {
                _swap(nums,i,j);
                _permute(nums,i+1,list);
                _swap(nums,i,j);
            }
        }
    }

    private static void _swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

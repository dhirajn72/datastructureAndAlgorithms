package session2;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        _permute(nums, 0,res);
        return res;
    }

    private static void _permute(int[] nums, int i,List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> integers = new ArrayList<>();
            for (int e : nums)
                integers.add(e);
            res.add(integers);
            return;
        } else {
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                _permute(nums, i + 1,res);
                swap(nums, i, j);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

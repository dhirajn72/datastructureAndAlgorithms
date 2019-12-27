package session3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 30/11/19
 */

/*

Success
Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Permutations.
Memory Usage: 36.9 MB, less than 97.16% of Java online submissions for Permutations.
 */
public class PosibblePermutationsOfArray {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        if (nums==null)return new ArrayList<>();
        if (nums.length==0)return new ArrayList<>(nums[0]);

        List<List<Integer>> result=new ArrayList<>();
        _permute(nums,0,result);

        return result;
    }

    private static void _permute(int[] nums,int i, List<List<Integer>> result) {
        if (nums.length==i){
            ArrayList<Integer> ints=new ArrayList<>();
            for (int e:nums)
                ints.add(e);
            result.add(ints);
        }
        else {
            for (int j = i; j < nums.length; j++) {
                _swap(nums,i,j);
                _permute(nums,i+1,result);
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

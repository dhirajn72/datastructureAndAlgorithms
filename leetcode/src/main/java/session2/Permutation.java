package session2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class Permutation {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
        System.out.println("\0");

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        _permute(nums,0,result);
        return result;
    }

    private static void _permute(int[] nums,int i,List<List<Integer>> result) {
        if (i==nums.length){
            List<Integer> res=new ArrayList<>();
            for (int e:nums)
                res.add(e);
            result.add(res);
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

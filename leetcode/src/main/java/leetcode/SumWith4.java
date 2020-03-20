package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/08/19
 */
public class SumWith4 {
    public static void main(String[] args) {
        //int[] arr={1, 0, -1, 0, -2, 2};
        int[] arr={-3,-2,-1,0,0,1,2,3};


        System.out.println(fourSum(arr,0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums==null||nums.length==0)return new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> integers=new ArrayList<>();
        for (int i=0;i<nums.length;i++)
            integers.add(nums[i]);
        List<List<Integer>> result= new ArrayList<>();
        getSum(integers,target,new ArrayList<>(),result);
        List<List<Integer>> list= new ArrayList<>();
        result.stream().flatMap(x-> Stream.of(x)).forEach(x-> System.out.print(new HashSet<>(x)));
        return list;
    }

    private static void getSum(List<Integer> integers, int target, ArrayList<Integer> partial,List<List<Integer>> res) {
        int sum=0;
        for(int i:partial)
            sum+=i;
        if (sum==target && partial.size()==4) {
            res.add(new ArrayList<>(partial));
        }
        for (int i = 0; i < integers.size(); i++) {
            ArrayList<Integer> remainings= new ArrayList<>();
            int n=integers.get(i);
            for (int j = i+1; j < integers.size(); j++) {
                remainings.add(integers.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(n);
            getSum(remainings,target,partial_res,res);
        }
    }
}

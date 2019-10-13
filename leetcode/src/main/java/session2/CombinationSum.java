package session2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 10/09/19
 */

/*


Success
Details
Runtime: 43 ms, faster than 5.02% of Java online submissions for Combination Sum.
Memory Usage: 41.5 MB, less than 5.19% of Java online submissions for Combination Sum.
 */
public class CombinationSum {

    public static void main(String[] args) {
        int[] arr={2,3,5};
        System.out.println(combinationSum(null,8));
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        if (nums==null)return new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        for (int e:nums)
            integers.add(new Integer(e));
        List<List<Integer>> result=new ArrayList<>();
        _maxSubArray(integers,target,new ArrayList<Integer>(),result);
        return result;
    }
    private static void _maxSubArray(List<Integer> numbers,int target, ArrayList<Integer> partial,List<List<Integer>> result) {
        int sum=0;
        for (int x:partial)
            sum+=x;
        if (sum==target) {
            result.add(new ArrayList<>(partial));
            return;
        }
        if (sum>target) {
           return;
        }
        for (int i=0;i<numbers.size();i++){
            ArrayList<Integer> remaining= new ArrayList<>();
            int n=numbers.get(i);
            for (int j=i;j<numbers.size();j++){
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_rec= new ArrayList<>(partial);
            partial_rec.add(n);
            _maxSubArray(remaining,target,partial_rec,result);
        }
    }
}

package session3;

import java.util.*;

/**
 * @author Dhiraj
 * @date 30/11/19
 */


/**
 *
 Runtime: 213 ms, faster than 5.15% of Java online submissions for Combination Sum II.
 Memory Usage: 54.5 MB, less than 5.27% of Java online submissions for Combination Sum II.
 */
public class CombinationSum2 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{10,1,2,7,6,1,5},  1000));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates==null)return new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        for (int i:candidates)
            integers.add(i);

        Set<List<Integer>> resList=new HashSet<>();
        _combination(integers,target,resList,new ArrayList<>(),new ArrayList<>());
        return new ArrayList<>(resList);
    }

    private static void _combination(List<Integer> integers, int target, Set<List<Integer>> resList, ArrayList<Integer> partial,List<String> checker) {
        int sum=0;
        for (int i:partial)
            sum+=i;
        if (sum==target){
            Collections.sort(partial);
            if (!checker.contains(partial.toString())) {
                checker.add(partial.toString());
                resList.add(new ArrayList<>(partial));
            }
            return;
        }
        if (sum>target)
            return;
        for (int i = 0; i < integers.size(); i++) {
            ArrayList<Integer> remaining=new ArrayList<>();
            int first=integers.get(i);
            for (int j = i+1; j < integers.size(); j++) {
                remaining.add(integers.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(first);
            _combination(remaining,target,resList,partial_res,checker);
        }
    }
}

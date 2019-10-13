package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));

    }

    /*public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        for (int e:nums)
            integers.add(e);

        List<List<Integer>> result=new ArrayList<>();
        _getResult(integers,0,new ArrayList<>());
        return null;
    }

    private static void _getResult(List<Integer> integers, int target, ArrayList<Integer> partial) {
        int sum=0;
        for (int e:partial)
            sum+=e;
        if (sum>target)
            return;
        if (sum==target && partial.size()==3)
            System.out.println(partial);
        for (int i = 0; i < integers.size(); i++) {
            ArrayList<Integer> numbers=new ArrayList<>();
            int n=integers.get(i);
            for (int j = i+1; j < integers.size(); j++) {
                numbers.add(integers.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(n);
            _getResult(numbers,target,partial_res);
        }
    }*/
    /*
    sort(S);
 for i=0 to n-2 do
    a = S[i];
    start = i+1;
    end = n-1;
    while (start < end) do
       b = S[start]
       c = S[end];
       if (a+b+c == 0) then
          output a, b, c;
          // Continue search for all triplet combinations summing to zero.
          // We need to update both end and start together since the array values are distinct.
          start = start + 1;
          end = end - 1;
       else if (a+b+c > 0) then
          end = end - 1;
       else
          start = start + 1;
    end
 end
     */

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null|| nums.length==0)return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        int target=0;
        for (int i = 0; i < nums.length-2; i++) {
            int a=nums[i];
            int start=i+1;
            int end=nums.length-1;
            while (start<end){
                int b=nums[start];
                int c=nums[end];
                if (a+b+c==target) {
                    List<Integer> integers=new ArrayList<>();
                    start = start + 1;
                    end = end - 1;
                    integers.add(a);
                    integers.add(b);
                    integers.add(c);
                    result.add(integers);
                }
                else if (a+b+c>target){
                    end=end-1;
                }
                else
                    start=start+1;
            }
        }
        return new ArrayList<>(result);
    }
}

package session3;

import java.util.*;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null)return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            int first=nums[i];
            int start=i+1;
            int end=nums.length-1;
            while (start<end){
                int second=nums[start];
                int last=nums[end];
                if (first+second+last==0){
                    List<Integer> integers=new ArrayList<>();
                    integers.add(first);
                    integers.add(second);
                    integers.add(last);
                    set.add(integers);
                }
                if (first+second+last>0)
                    end--;
                else
                    start++;
            }
        }
        return new ArrayList<>(set);
    }
}

package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class FourSum {

    //1, 0, -1, 0, -2, 2

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2},0));

        /*
-2,-1,1,2
-1,0,0,1
-2,0,0,2

         */
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums==null||nums.length==0)return new ArrayList<>();
        Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int a=nums[i];
            int start=i+1;
            int end=nums.length-1;
            while (start<end){
                int b=nums[start];
                int c=nums[start+1];
                int d=nums[end];
                if (a+b+c+d==target){
                    List<Integer> integers= new ArrayList<>();
                    integers.add(a);
                    integers.add(b);
                    integers.add(c);
                    integers.add(d);
                    result.add(integers);
                    start=start+1;
                    end=end-1;
                }
                else if (a+b+c+d>target)
                    end=end-1;
                else
                    start=start+1;
            }

        }
        return new ArrayList<>(result);
    }
}

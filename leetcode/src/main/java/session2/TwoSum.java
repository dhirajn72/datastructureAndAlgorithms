package session2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 22/08/19
 */
public class TwoSum {
    public static void main(String[] args) {
        /*int[] arr={3,2,95,4,-3};
        int n=92;
        */
        int[] arr= {-1,-2,-3,-4,-5}; /*{0,4,3,0};*/ /*{6};*/ /*{3,2,4};*//*{3,3};*/
        int n=-8;

        System.out.println(Arrays.toString(twoSum(arr,n)));

    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums==null||nums.length==0)return nums;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++)
            map.put(nums[i],i);
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (target>=nums[i] || nums[i]>=target){
                int look=target-nums[i];
                if (map.get(look)!=null){
                    if (i==map.get(look))continue;
                    result[0]=i;
                    result[1]=map.get(look);
                    break;
                }
            }
        }
        return result;
    }
}

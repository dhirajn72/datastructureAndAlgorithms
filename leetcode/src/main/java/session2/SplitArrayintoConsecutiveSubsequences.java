package session2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class SplitArrayintoConsecutiveSubsequences   {

    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,5};//{1,2,3,3,4,5};
        System.out.println(isPossible(arr));
    }

    public static boolean isPossible(int[] nums) {
        if (nums==null||nums.length==0)return false;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],nums[i]);
            }
            else map2.put(nums[i],nums[i]);
        }
        int[] firstArray=new int[map.size()];
        int[] secondArray=new int[map2.size()];
        int index=0;
        for (int i:map.values())
            firstArray[index++]=i;
        index=0;
        for (int i:map2.values())
            secondArray[index++]=i;
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        return firstArray.length>=3 && secondArray.length>=3;
    }
}

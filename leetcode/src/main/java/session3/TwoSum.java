package session3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 09/11/19
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{0, 4, 3, 0}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, -2, -3, -4, -5}, -8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (map.containsKey(find) && i != map.get(find))
                return new int[]{i, map.get(find)};
        }
        return null;
    }
}

/*
[0, 1]
[1, 2]
[0, 3]
null
 */

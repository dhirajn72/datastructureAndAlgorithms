package session2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class TwoSum_SortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers==null||numbers.length==0)return null;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i],i+1);
        }
        for (int i = 0; i <numbers.length ; i++) {
            if (target>numbers[i]){
                if (map.get(target-numbers[i])!=null)
                    return new int[]{i+1,map.get(target-numbers[i])};
            }
        }
        return null;
    }
}

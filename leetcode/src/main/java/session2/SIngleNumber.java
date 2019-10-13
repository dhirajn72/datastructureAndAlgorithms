package session2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class SIngleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));

    }


    public static int singleNumber(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.putIfAbsent(nums[i],0);
            map.put(nums[i],map.get(nums[i])+1);
        }
        int result=map.entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .mapToInt(e->e).findFirst().getAsInt();
        return result;
    }
}

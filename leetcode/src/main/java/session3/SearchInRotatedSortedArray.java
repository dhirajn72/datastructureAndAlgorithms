package session3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 17/11/19
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums==null||nums.length==0)return 0;
        Map<Integer,Integer> table=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!table.containsKey(nums[i])){
                table.put(nums[i],i);
            }
        }
        return table.get(target)==null?-1:table.get(target);
    }
}

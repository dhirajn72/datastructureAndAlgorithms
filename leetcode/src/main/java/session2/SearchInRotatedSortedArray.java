package session2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class SearchInRotatedSortedArray {


    public int search(int[] nums, int target) {
        if (nums==null||nums.length==0)return -1;
        Map<Integer,Integer> mapWithIndex=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapWithIndex.put(nums[i],i);
        }
        return mapWithIndex.get(target)!=null? mapWithIndex.get(target):-1;
    }

    public boolean search_II(int[] nums, int target) {
        if (nums==null||nums.length==0)return false;
        Map<Integer,Integer> mapWithIndex=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapWithIndex.put(nums[i],i);
        }
        return mapWithIndex.get(target) != null;
    }
}

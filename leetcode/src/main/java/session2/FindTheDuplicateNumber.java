package session2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        Set<Integer> integers=new HashSet<>();
        for (int i:nums){
            if (!integers.contains(i))
                integers.add(i);
            else
                return i;
        }
        return 0;
    }
}

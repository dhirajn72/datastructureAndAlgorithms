package session2;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        Set<Integer> set=new TreeSet<>();
        for (int i:nums)
            set.add(i);
        int[] result=new int[set.size()];
        int index=0;
        for (int i:set)
            result[index++]=i;
        return result.length;
    }
}

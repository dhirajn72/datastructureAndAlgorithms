package session3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 17/11/19
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }


    public static int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        Map<Integer,Integer> table=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!table.containsKey(nums[i])){
                table.put(nums[i],nums[i]);
            }
        }
        Set<Integer> keys=table.keySet();
        int[] res=new int[keys.size()];
        int index=0;
        for (int i:keys) {
            res[index++]=i;
        }
        Arrays.sort(res);
        index=0;
        for (int i:res) {
            nums[index++]=i;
        }
        return keys.size();
    }
}

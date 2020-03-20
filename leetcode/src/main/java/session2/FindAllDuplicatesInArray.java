package session2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        if (nums==null||nums.length==0)return new ArrayList<>();
        Map<Integer,Integer> counts=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            counts.putIfAbsent(nums[i],0);
            counts.put(nums[i],counts.get(nums[i])+1);

        }
        List<Integer> res=counts.entrySet()
                .stream()
                .filter(e->e.getValue()==2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return res;
    }
}

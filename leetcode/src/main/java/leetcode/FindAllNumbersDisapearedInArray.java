package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 05/08/19
 */
public class FindAllNumbersDisapearedInArray {

    public static void main(String[] args) {
       // System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,7,2,3}));

    }

    /**
     *
     *
     Runtime: 29 ms, faster than 10.69% of Java online submissions for Find All Numbers Disappeared in an Array.
     Memory Usage: 50.9 MB, less than 29.87% of Java online submissions for Find All Numbers Disappeared in an Array.
     * @param arr
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        if (arr==null||arr.length==0)return new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
            map.put(arr[i],arr[i]);
        }
        if (integers.size()==0){
            int len=arr.length;
            if (max==len){
                for (int i=1;i<len;i++){
                    if (!map.containsKey(i))
                        integers.add(i);
                }
            }
            else if (max<len){
                for (int i=1;i<=len;i++){
                    if (!map.containsKey(i)) {
                        integers.add(i);
                    }
                }
            }
        }
        return integers;
    }
}

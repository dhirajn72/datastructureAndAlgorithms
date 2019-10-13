package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class IntersectionOfTwoArrays_II {

    public static void main(String[] args) {
        /*
         [1,2,2,1]
        [2,2]
         */
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5},new int[]{9,4,9,8,4})));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1==null||nums2==null)return new int[]{};
        List<Integer> reList=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : nums1) {
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        for (int i : nums2) {
            if (map.containsKey(i)){
                if (map.get(i)>1){
                    map.put(i,map.get(i)-1);
                }
                else map.remove(i);
                reList.add(i);
            }
        }
        int index=0;
        int[] res=new int[reList.size()];
        for (int i:reList)
            res[index++]=i;
        return res;
    }
}

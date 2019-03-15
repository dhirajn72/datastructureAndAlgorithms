package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class FindNumberOfDuplicates {
    public static void main(String[] args) {
        int[] arr={5,4,6,3,7,2,8,1,9,0,8};
        System.out.println(findNumberOfDuplicatesInArray(arr));
    }
    private static Map<Integer,Integer> findNumberOfDuplicatesInArray(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<arr.length-1;i++){
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    count++;
            }
            map.put(arr[i],count);
        }
        return map;
    }
}

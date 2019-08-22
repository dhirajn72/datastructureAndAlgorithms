package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dhiraj
 * @date 12/08/19
 */
public class MaximumProductOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{ 5,7,9,8,-9,6,8,4};//     #2520
        //int[] numbers = new int[]{ 5,7,-5,0,6,7,-4,0,2,-2,-3,1};  // #42
        //System.out.println(_findMaxProduct(numbers));
        Map<Long,String> map= new HashMap<>();
        System.out.println(map.get(null));

    }

    private static int _findMaxProduct(int[] arr) {
        int length=arr.length;
        int max=1;

        int[] dp=new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <i ; j++) {
                dp[i]=dp[j]*dp[i]*max;
            }
        }
        System.out.println(max);
        return 0;
    }
}

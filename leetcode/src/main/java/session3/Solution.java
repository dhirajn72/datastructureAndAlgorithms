package session3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 27/11/19
 */
public class Solution {

    /*public int solution(int N) {
        // write your code in Java SE 8

        String number=String.valueOf(N);
        System.out.println("this is a debug message"+number);
        return _returnLargest(number);
    }

    private int _returnLargest(String number) {
        List<Integer> integers=new ArrayList<>();
        _returnLargest("",number,integers);
         int max=Integer.MIN_VALUE;
         for (int i:integers)
             max=Math.max(max,i);
        return max;
    }

    private static void _returnLargest(String prefix, String str, List<Integer> result) {
        if (str.length() == 0) {
            result.add(Integer.valueOf(prefix));
        } else
            for (int i = 0; i < str.length(); i++)
                _returnLargest(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()),result);
    }*/


    static int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }

    public static void main(String[] args) {
        System.out.println(">>>>>"+solution(new int[]{1,1,0,1,0,0}));
        System.out.println(">>>>>"+solution(new int[]{1,0,0,0,0,0}));
        System.out.println(">>>>>"+solution(new int[]{1,1,0,0,0,0}));
        System.out.println(">>>>>"+solution(new int[]{1,1,0,0,1,1}));
        System.out.println(">>>>>"+solution(new int[]{1,1,0,1,0,1,1,1,0}));

    }
}

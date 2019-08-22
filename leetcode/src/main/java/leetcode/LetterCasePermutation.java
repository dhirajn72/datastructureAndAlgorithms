package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
        int x=-1563847412;
        System.out.println(reverse(x));
    }

    public static List<String> letterCasePermutation(String str) {
        List<String> res= new ArrayList<>();
        char[] arr= str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])){
                if (Character.isLowerCase(arr[i])) {
                    arr[i] = Character.toUpperCase(arr[i]);
                    StringBuilder sb=new StringBuilder();
                    for (int j = 0; j < arr.length; j++)
                        sb.append(arr[j]);
                    res.add(sb.toString());
                    i=0;
                }
                else if (Character.isUpperCase(arr[i])){
                    arr[i]=Character.toLowerCase(arr[i]);
                    StringBuilder sb= new StringBuilder();
                    for (int j = 0; j < arr.length; j++)
                        sb.append(arr[j]);
                    res.add(sb.toString());
                }

            }
        }
        return res;
    }

    public static int reverse(int x) {
        if(Integer.MIN_VALUE==x)return 0;
        int k = x;
        int result = 0;
        while(k != 0){
            result = result * 10;
            result =result+ k % 10;
            k =  k/10;
        }
        return result;
    }
}

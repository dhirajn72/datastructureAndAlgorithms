package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/07/19
 */
public class Permutation {
    public static void main(String[] args) {

        //permutation("123");
        permutation(new int[]{0,1,1});
    }

    private static void permutation(int[] arr) {
        String s="";
        for (int i:arr) {
            if (i<0)
            s += i;
        }

        List<List<Integer>> list= new ArrayList<>();
        _permutation("",s,list);
        System.out.println(list);
    }

    private static void _permutation(String prefix, String str, List<List<Integer>> ints) {
        if (str.length()==0) {
            char[] arr=prefix.toCharArray();
            List<Integer> integers= new ArrayList<>();
            for (char c:arr){
                integers.add(Integer.valueOf(c+""));
            }
            ints.add(integers);
        }
        else
            for (int i = 0; i < str.length(); i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),ints);

    }
}

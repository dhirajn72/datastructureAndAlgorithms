package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class PermutationOfArrayUnique {

    public static void main(String[] args) {
        List<List<Integer>>  result=permuteUnique(new int[]{});
        System.out.println(result);
    }
    public static List<List<Integer>> permuteUnique(int[] arr) {
        Set<List<Integer>> integers=new HashSet<>();
        if (arr==null||arr.length==0)return new ArrayList<>(integers);
        if (arr.length==1){
            List<Integer> ints=new ArrayList<>();
            ints.add(arr[0]);
            integers.add(ints);
            return new ArrayList<>(integers);
        }
        _permute(arr,0,integers);
        return new ArrayList<>(integers);
    }

    private static void  _permute(int[] arr, int i,Set<List<Integer>> result) {
        if (i==arr.length){
            List<Integer> integers= new ArrayList<>();
            for (int k:arr)
                integers.add(k);
            result.add(integers);
            return;
        }
        else {
            for (int j = i; j < arr.length; j++) {
                swap(arr,i,j);
                _permute(arr,i+1,result);
                swap(arr,i,j);
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 26/07/19
 */
public class Permutation {
    public static void main(String[] args) {
        permute(new int[]{1,2,3}).stream().forEach(System.out::println);

    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper( arr,list, new ArrayList<Integer>());
        return list;
    }

    private static void permuteHelper(int[] arr,List<List<Integer>> list, List<Integer> resultList) {
        if (resultList.size() == arr.length) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i = 0; i < arr.length; i++) {
                /*if (resultList.contains(arr[i]))
                    continue;*/
                resultList.add(arr[i]);
                permuteHelper(arr,list, resultList);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}
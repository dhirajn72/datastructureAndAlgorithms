package dynamicprogramming;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class PermutationOfArray {
    public static void main(String[] args) {

        //System.out.println(permute(new int[]{1,1,3}));
        permute(new int[]{1, 2, 3}, 0);
        //permuteAgain(new int[]{1, 2, 3}, 0);
    }

    private static void permuteAgain(int[] ints, int i) {
        if (i==ints.length){
            System.out.println(Arrays.toString(ints));
            return;
        }
        else {
            for (int j = i; j < ints.length; j++) {
                swapAgain(ints,i,j);
                permuteAgain(ints,i+1);
                swapAgain(ints,i,j);
            }
        }

    }

    private static void swapAgain(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void permute(int[] arr, int i) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            permute(arr, i + 1);  // recurse call
            swap(arr, i, j);      // backtracking
        }
    }
}

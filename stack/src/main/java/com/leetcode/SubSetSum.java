package com.leetcode;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class SubSetSum {
    public static void find(int[] A, int currSum, int index, int sum, int[] solution) {
        if (currSum == sum) {
            System.out.println("\nSum found");
            for (int i = 0; i < solution.length; i++) {
                if (solution[i] == 1) {
                    System.out.print("  " + A[i]);
                }
            }

        } else if (index == A.length) {
            return;
        } else {
            solution[index] = 1;// select the element
            currSum = currSum+A[index];
            find(A, currSum, index + 1, sum, solution);
            currSum = currSum-A[index];
            solution[index] = 0;// do not select the element
            find(A, currSum, index + 1, sum, solution);
        }
        return;
    }

    public static void main(String[] args) {
        int[] A ={3, 1,4,5,1,2};  //{3, 2, 7, 1};
        int[] solution = new int[A.length];
        find(A, 0, 0, 5, solution);
    }
}

package dynamicprogramming;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/07/19
 */
public class LongestCommonSubSequenseArrays {
    public static void main(String[] args) {

        System.out.println(_longestCommonSubSequense(new int[]{1, 2, 3, 4, 1},new int[]{3 ,4 ,1, 2, 1, 3}));

    }

    private static String _longestCommonSubSequense(int[] int1, int[] int2) {
        int[][] matrix= new int[int1.length+1][int2.length+1];
        for (int i = 0; i <int1.length ; i++) {
            for (int j = 0; j < int2.length; j++) {
                if (int1[i]==int2[j]){
                    matrix[i+1][j+1]=1+matrix[i][j];
                }
                else {
                    matrix[i+1][j+1]=Math.max(matrix[i+1][j],matrix[i][j+1]);
                }
            }
        }
        StringBuilder builder=new StringBuilder();
        for (int i = int1.length,j=int2.length; i !=0 && j!=0;) {
            if (matrix[i][j] == matrix[i - 1][j])
                i--;
            else if (matrix[i][j] == matrix[i][j - 1])
                j--;
            else {
                if (int1[i-1] == int2[j-1])
                    builder.append(int1[i-1]);
                i--;
                j--;
            }
        }
        return builder.reverse().toString();
    }
}

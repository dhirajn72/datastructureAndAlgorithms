package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/09/19
 */
public class RotateMatrixInPlace {

    public static void main(String[] args) {
       // int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix={{1,2,3},{5,6,7},{9,10,11}};

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
       // System.out.println(Arrays.toString(matrix[3]));

        rotate(matrix);
        System.out.println("*********");
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
       // System.out.println(Arrays.toString(matrix[3]));




    }

    public static void rotate(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            double x=Math.ceil(((double)n));

            for (int j = 0; j <(n+1)/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-1-i];
                matrix[j][n-1-i]= matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[n-1-j][i];
                matrix[n-1-j][i]  = temp;
            }
        }
    }

    private static double get(double x) {
        System.out.println(x/2);
        return x/2;
    }
}

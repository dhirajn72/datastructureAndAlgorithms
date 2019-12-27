package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/10/19
 */
public class RotateM {
    public static void main(String[] args) {

        int[][] matrix={{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        rotateMatrix(matrix);

        System.out.println("*******");
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
    }

    public static void rotateMatrix(int[][] matrix){
        int n=matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <(n+1)/2 ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;

            }
        }
    }
}

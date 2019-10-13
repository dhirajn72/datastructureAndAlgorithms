package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/09/19
 */
public class CeilTest {
    public static void main(String[] args) {

        int[][] matrix={{1,2,3},{5,6,7},{9,10,11}};

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        //System.out.println(Arrays.toString(matrix[3]));

        System.out.println("*********");


        int n=matrix.length;

        for (int i = 0; i < n / 2; i++) {
            double y=((double) n) / 2;
            System.out.println(y);
            double x=Math.ceil(y);
            System.out.println(x);
            for (int j = 0; j < Math.ceil(((double) n) / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        //System.out.println(Arrays.toString(matrix[3]));
    }
}

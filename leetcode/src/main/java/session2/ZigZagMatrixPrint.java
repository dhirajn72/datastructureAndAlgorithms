package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 04/09/19
 */
public class ZigZagMatrixPrint {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        zigZagPrint(matrix);
    }

    private static void zigZagPrint(int[][] matrix) {
        if (matrix==null)return;
        if (matrix.length!=matrix[0].length)return;
        for (int i = 0; i < matrix.length; i++) {
            int j=0;
            for (; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+",");
            }
            int k=i;
            --j;
            System.out.println();
            for (; k <matrix.length && j>=0 ; k++,j--) {
                System.out.print(matrix[k][j]+",");
            }
            --k;
            ++j;
            System.out.println();
            for (;k<matrix.length && j<matrix.length;j++)
                System.out.print(matrix[k][j]+",");
            break;
        }
    }
}

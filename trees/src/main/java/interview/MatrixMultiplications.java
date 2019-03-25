package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 20/03/19
 */
public class MatrixMultiplications {

    public static void main(String[] args) {
        int[][] arrA={{1,2},{3,4}};
        int[][] arrB={{5,6},{7,8}};

        /*
        1 2  * 5 6  =   1*5+2*7    1*6+2*8    =         19 24
        3 4    7 8      3*5+4*7    3*6+4*8              43 50

        19 24

        43 50




        arr[0][0]*arrB[0][0] + arr[0][1]*arrB[1][0]           arr[0][0]*arrB[0][1] + arr[0][1]*arrB[1][1]

        arr[1][0]*arrB[0][0] + arr[1][1]*arrB[1][0]           arr[1][0]*arrB[0][1] + arr[1][1]*arrB[1][1]

         */

        matrixMul(arrA,arrB);
    }

    private static void matrixMul(int[][] arrA, int[][] arrB) {
        int[][] arrC=new int[arrA.length][arrB.length];

        for (int i=0;i<arrA.length;i++){
            for (int j=0; j<arrA[i].length;j++){
                for (int k=1;k<arrA.length;k++){
                    System.out.print(arrA[i][j]*arrB[j][i]+arrA[i][k]*arrB[k][i]);
                }
                System.out.println();
            }
        }

        System.out.println(Arrays.deepToString(arrC));


    }
}

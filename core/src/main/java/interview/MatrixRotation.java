package interview;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 26/01/19
 */
public class MatrixRotation {

    public static void rotate(int[][] matrix){
        int size=matrix.length;
        for (int i=0;i<size;i++){
            if(matrix[i].length!=size)
                throw new IllegalArgumentException("Matrix is not N*N");
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=matrix.length-1;j>=0;j--){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        System.out.println(Arrays.deepToString(arr));

        /*
        1 2 3           7 4 1
        4 5 6   --->    8 5 2
        7 8 9           9 6 3

                [2,0]
                [1,0]
                [0,0]
                [2,1]
                [1,1]
                [0,1]
                [2,2]
                [1,2]
                [0,2]


         */

        rotate(arr);
    }

}

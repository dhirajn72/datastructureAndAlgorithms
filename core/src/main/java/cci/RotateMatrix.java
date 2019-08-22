package cci;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class RotateMatrix {
    public static void main(String[] args) {
        /*int[][] arr = {{11, 12, 13,14,}, {15, 16,17,18}, { 19,20,21,22},{23,24,25,26}};
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        // int[][] rotated=_rotateMatrixClockWise(arr);
*/
        int[][] matrix={{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        //int[][] rotated=_rotateMatrixAntiClockWise(matrix);
        int[][] rotated=_rotateMatrixClockWise(matrix);

        System.out.println("*******");
        System.out.println(Arrays.toString(rotated[0]));
        System.out.println(Arrays.toString(rotated[1]));
        System.out.println(Arrays.toString(rotated[2]));
        System.out.println(Arrays.toString(rotated[3]));

    }

    private static int[][] _rotateMatrixClockWise(int[][] arr) {
        if (arr.length==0 || arr.length!=arr[0].length)return null;
        int[][] matrix=new int[arr.length][arr[0].length];
        int second=0;
        for (int i=matrix.length-1;i>=0;i--){
            int first=0;
            for (int j=0;j<matrix.length;j++){
                matrix[first++][second]=arr[i][j];
            }
            second++;
        }
        return matrix;
    }

    private static int[][] _rotateMatrixAntiClockWise(int[][] arr) {
        if (arr.length==0 || arr.length!=arr[0].length)return null;
        int[][] matrix=new int[arr.length][arr[0].length];
        int second=0;
        for (int i=0;i<matrix.length;i++){
            int first=0;
            for (int j=matrix.length-1;j>=0;j--){
                matrix[first++][second]=arr[i][j];
            }
            second++;
        }
        return matrix;
    }
}

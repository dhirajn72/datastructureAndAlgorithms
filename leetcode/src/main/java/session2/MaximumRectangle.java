package session2;

/**
 * @author Dhiraj
 * @date 01/09/19
 */
public class MaximumRectangle {

    public static void main(String[] args) {
        char[][] arr = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        /*char[][] arr = {{'0', '1'},
                        {'1', '0'},};*/

        System.out.println(maximalRectangle(arr));
    }


    public static int maximalRectangle(char[][] matrix) {
        if (matrix==null||matrix.length==0)return 0;
        int max=Integer.MIN_VALUE;

        int[][] originalMatrix=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //originalMatrix[i][j]=Integer.valueOf(matrix[i][j]+"");
                if (matrix[i][j] == '0') {
                    originalMatrix[i][j] = 0;
                } else {
                    originalMatrix[i][j] = ( i==0?1:originalMatrix[i - 1][j] +1);
                }
            }
        }

        int[] dp=new int[matrix[0].length];
        for (int[] arr:originalMatrix){
            max=Math.max(max,maxAreaHistogram(arr));
        }
        return max;
    }

    public static int maxAreaHistogram(int[] arr){
        if (arr==null||arr.length==0)return 0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]>=arr[i])count++;
                else break;
            }
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j]>=arr[i])count++;
                else break;
            }
            max=Math.max(max,arr[i]*count);
            count=0;
        }
        return max;
    }
}

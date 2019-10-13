package session2;

/**
 * @author Dhiraj
 * @date 01/09/19
 */
public class MaximalSquare {
    public static void main(String[] args) {

        char[][] arr = {{'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}};

        //[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
        System.out.println(maximalSquare(arr));


    }

    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0')
                    dp[i][j] = 0;
                else {
                    dp[i][j] = i == 0 ? 1 : Integer.valueOf(dp[i - 1][j]+"") + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int[] arr : dp)
            max = Math.max(max,_maxHistogram(arr));
        return max;
    }

    private static int _maxHistogram(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int count = 0;
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] >= arr[i])
                    count++;
                else break;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    count++;
                else break;
            }
            count=count>=arr[i]?arr[i]:0;
            area = Math.max(area, arr[i] * count);
            count=0;
        }
        return area;
    }
}

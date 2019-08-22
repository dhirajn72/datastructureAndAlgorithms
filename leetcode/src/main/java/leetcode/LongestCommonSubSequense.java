package leetcode;

/**
 * @author Dhiraj
 * @date 06/08/19
 */
public class LongestCommonSubSequense {
    public static void main(String[] args) {
        System.out.println(longestCommonSubSequence("ABCBDAB", "BDCABA"));// BCBA
    }
    private static String longestCommonSubSequence(String str1, String str2) {
        int[][] matrix = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    matrix[i + 1][j + 1] = 1 + matrix[i][j];
                } else {
                    matrix[i + 1][j + 1] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
                }
            }
        }

        StringBuilder sb= new StringBuilder();
        for (int i=str1.length(),j=str2.length();i!=0 && j!=0;) {
            if (matrix[i][j]==matrix[i-1][j])
                i--;
            else if (matrix[i][j]==matrix[i][j-1])
                j--;
            else {
                if (str1.charAt(i-1)==str2.charAt(j-1))
                    sb.append(str1.charAt(i-1));
                i--;
                j--;
            }

        }
        return sb.reverse().toString();
    }

}

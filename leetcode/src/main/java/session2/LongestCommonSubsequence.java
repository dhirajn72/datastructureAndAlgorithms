package session2;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde","ace"));

    }

    public static int longestCommonSubsequence(String s1, String s2) {
        int[][] matrix=new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i)==s2.charAt(j)){
                    matrix[i+1][j+1]=1+matrix[i][j];
                }
                else {
                    matrix[i+1][j+1]=Math.max(matrix[i+1][j],matrix[i][j+1]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = s1.length(),j=s2.length(); i!=0 && j!=0;) {
            if (matrix[i][j]==matrix[i-1][j])
                i--;
            else if (matrix[i][j]==matrix[i][j-1])
                j--;
            else {
                if (s1.charAt(i-1)==s2.charAt(j-1))
                    sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
        }
        return sb.length();
    }
}

package session2;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LongestPalindromicSubSequence {
    /*static int lps(String s) {
        int matrix[][] = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++)
            matrix[i][i] = 1;


        for (int l = 2; l <= s.length(); l++) {
            for (int i = 0; i < s.length() - l + 1; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && l == 2)
                    matrix[i][j] = 2;
                else if (s.charAt(i) == s.charAt(j))
                    matrix[i][j] = matrix[i + 1][j - 1] + 2;
                else
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i + 1][j]);
            }
        }

        return matrix[0][s.length() - 1];
    }*/
    public static int longestPalindrmicSubSequence(String str){
        int[][] matrix=new int[str.length()][str.length()];
        for (int i = 0; i < str.length(); i++) {
            matrix[i][i]=1;
        }

        for (int l = 2; l <=str.length() ; l++) {
            for (int i = 0; i < str.length()-l + 1; i++) {
                int j=i+l-1;
                if (str.charAt(i)==str.charAt(j) && l==2)
                    matrix[i][j]=2;
                else if (str.charAt(i)==str.charAt(j))
                    matrix[i][j]=matrix[i+1][j-1]+2;
                else
                    matrix[i][j]=Math.max(matrix[i][j-1],matrix[i+1][j]);
            }
        }
        return matrix[0][str.length()-1];
    }


    /* Driver program to test above functions */
    public static void main(String args[]) {
        //String s = "GEEKSFORGEEKS";
       // String s="BABCBAB";
       // String s="aabdba";
        String s="aabdbacd";


        int n = s.length();
       // System.out.println("The lnegth of the lps is " + lps(s));
        System.out.println(longestPalindrmicSubSequence(s));
    }
}

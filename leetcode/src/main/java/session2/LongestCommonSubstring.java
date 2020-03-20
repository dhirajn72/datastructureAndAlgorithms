package session2;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
        System.out.println(longestCommonSubString("abcdef","bcdf"));



    }

    public static int longestCommonSubString(String str1,String str2){
        int[][] matrix=new int[str1.length()+1][str2.length()+1];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    matrix[i+1][j+1]=1+matrix[i][j];
                    max=Math.max(max,matrix[i+1][j+1]);
                }
            }
        }
        return max;
        /*int T[][] = new int[str1.length()+1][str2.length()+1];
        int max = 0;
        for(int i=1; i <= str1.length(); i++){
            for(int j=1; j <= str2.length(); j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;*/
    }

}

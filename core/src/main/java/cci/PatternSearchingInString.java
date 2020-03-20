package cci;

/**
 * @author Dhiraj
 * @date 25/06/19
 */
public class PatternSearchingInString {
    public static void main(String[] args) {
        String str="Hi this is Bangalore";
        String pattern="Ban";
        _patterSearching(str,pattern);
    }
    private static void _patterSearching(String str, String pattern) {
        int patternLength=pattern.length();
        for (int i=0;i<str.length();i++){
            if (str.substring(i, patternLength).equals(pattern)){
                System.out.println("Found");
            }
        }
    }
}

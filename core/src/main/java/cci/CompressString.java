package cci;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class CompressString {
    public static void main(String[] args) {
        String s = "aabccbbddeeeaa";
        //String s = "aabccbbddeeeaa";
        _compressString(s);
        _compressStringAnotherWay(s);
    }
    private static void _compressStringAnotherWay(String str) {
        StringBuilder s=new StringBuilder();
        int count=1;
        char c=' ';
        for (int i=0;i<str.length()-1;i++){
             c=str.charAt(i);
            if (c==str.charAt(i+1)){
                count++;
            }
            else {
                s.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        s.append(c).append(count);
        System.out.println(s);
    }
    private static void _compressString(String str) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for (int i=0;i<str.length();i++){
            count++;
            if (i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                s.append(str.charAt(i)).append(count);
                count=0;
            }
        }
        System.out.println(s);
    }
}

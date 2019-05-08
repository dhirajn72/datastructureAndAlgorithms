package interview;

import java.util.StringTokenizer;

/**
 * @author Dhiraj
 * @date 16/12/18
 */
public class CamelCase {
    public static void main(String[] args) {
        String str="I am in bangalore";
        System.out.println(getCamelCase(str));;
    }

    private static String getCamelCase(String str) {
        StringTokenizer token= new StringTokenizer(str," ");
        String result="";
        while (token.hasMoreTokens()){
            StringBuilder s=new StringBuilder(token.nextToken());
            String first=String.valueOf(s.charAt(0)).toUpperCase();
            result+=s.delete(0,1).insert(0,first).toString()+" ";
        }
        return result;
    }
}

package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 17/12/18
 */
public class StringPermutations {
    public static void main(String[] args) {
        String str="ABC";
        //List<String> list= new ArrayList<>();
        //permutation("",str,list);
        permutation("",str);
        //System.out.println(list);
    }
    /*private static void permutation(String prefix,String str,List<String> list) {
        if (str.length()==0) {
            //System.out.println(prefix);
            list.add(prefix);
        }
        else {
            for (int i=0;i<str.length();i++)
                permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),list);
        }
    }*/

    private static void permutation(String prefix,String str) {
        if (str.length()==0) {
            System.out.println(prefix);
        }
        else {
            for (int i=0;i<str.length();i++)
                permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
        }
    }
}

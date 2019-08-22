package leetcode;

/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class Permutations {
    public static void main(String[] args) {
        generatePermutations("ABC");
    }

    public static void generatePermutations(String str){
        _permute("",str);
    }
    private static void _permute(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++)
                _permute(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
    }


    public void generatePermutations(int[] arr){


    }
}

package cci;

/**
 * @author Dhiraj
 * @date 24/06/19
 */
public class StringRotation {
    public static void main(String[] args) {
        String s1="waterbottel";
        String s2="erbottelwat";
        _checkRotaion(s1,s2);

    }

    private static void _checkRotaion(String s1, String s2) {
        if (s1.length()!=s2.length())throw  new IllegalArgumentException("String not valid");
        if (s1.length()==s2.length() ){
            String s1s1=s1+s1;
            System.out.println(s1s1.contains(s2));
        }
    }
}

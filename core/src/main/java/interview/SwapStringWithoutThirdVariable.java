package interview;

/**
 * @author Dhiraj
 * @date 28/01/19
 */
public class SwapStringWithoutThirdVariable {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hai";

        System.out.println("Original Strings are::");
        System.out.println(s1);
        System.out.println(s2);

        s1=s1+s2; // hellohai
        //s2=s1.substring(0,s1.length()-s2.length());
        //s1=s1.substring(s2.length());

        s2=s1.replaceAll(s2,"");
        s1=s1.replaceAll(s2,"");
        System.out.println("After swapping:");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("******");



    }
}

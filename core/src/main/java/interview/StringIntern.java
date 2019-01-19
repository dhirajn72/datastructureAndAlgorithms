package interview;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class StringIntern {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");

        System.out.println(s1==s2.intern());
        System.out.println(s2.intern());
        System.out.println(s2==s2.intern());
    }
}

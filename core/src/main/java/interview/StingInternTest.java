package interview;

/**
 * @author Dhiraj
 * @date 17/01/19
 */
public class StingInternTest {
    public static void main(String[] args) {
        String s= new String("ABC");
        String s1="ABC";
        String s2=s.intern();

        System.out.println(s2==s.intern());
        System.out.println(s1==s.intern());

    }
}

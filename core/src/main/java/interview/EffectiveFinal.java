package interview;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class EffectiveFinal {
    public static void main(String args[]) {
        String nonFinal = "I am non final local variable";
        //nonFinal="test";
        Runnable r = () ->{
                System.out.println("Value of non-final variable is : " + nonFinal);
                // compile time error - must be final or effective final
                // nonFinal = "Can I change non-final variable inside anonymous class";
            };
        Thread t = new Thread(r);
        t.start();
    }
}


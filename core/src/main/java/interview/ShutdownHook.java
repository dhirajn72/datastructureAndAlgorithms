package interview;

/**
 * @author Dhiraj
 * @date 17/01/19
 */
public class ShutdownHook {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(()-> System.out.println("Shutdown hook is running !!")));
        System.out.println("Application Terminating ...");
        //System.exit(1);
        //Runtime.getRuntime().halt(1);
    }
}
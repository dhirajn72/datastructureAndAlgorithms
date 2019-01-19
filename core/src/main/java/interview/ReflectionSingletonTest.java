package interview;

import java.lang.reflect.Constructor;

/**
 * @author Dhiraj
 * @date 17/01/19
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        //EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EnumSingleton instanceOne=EnumSingleton.INSTANCE;
        //EagerInitializedSingleton instanceTwo = null;
        EnumSingleton instanceTwo=null;
        try {
            //Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                //instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                instanceTwo = (EnumSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}


class EagerInitializedSingleton{
    private static final EagerInitializedSingleton EAGER_INITIALIZED_SINGLETON= new EagerInitializedSingleton();
    public  static EagerInitializedSingleton getInstance(){
        return EAGER_INITIALIZED_SINGLETON;
    }
}
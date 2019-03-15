package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 24/01/19
 */
public class Test {
    public static void main(String[] args) {
        List list= new ArrayList(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Integer i=new Integer(10);
        System.out.println(incrementAndGet(i));
    }

    private static Integer incrementAndGet(Integer i) {
        i++;
        return ++i;
    }
}

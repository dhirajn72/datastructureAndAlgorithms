package multithreading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 26/12/19
 */
public class TestFinal {
    public static void main(String[] args) {

        List<String> list= Arrays.asList(new String[]{"a","b","c","d"});
        list.add("r");
        System.out.println(list);

    }
}

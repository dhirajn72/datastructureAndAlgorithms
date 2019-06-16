package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class GeneratePermutation {
    public static void main(String[] args) {
        String str = "abc";
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.forEach(TestMethodRef::doStuff1);

    }
}



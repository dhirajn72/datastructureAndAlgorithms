package session2;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class PrintACSII {
    public static void main(String[] args) {
        Stream.iterate(1, x -> ++x)
                .limit(128)
                .forEach(x -> {
                    int i = x;
                    char c = (char) i;
                    System.out.println(i + "->" + c);
                });
    }
}

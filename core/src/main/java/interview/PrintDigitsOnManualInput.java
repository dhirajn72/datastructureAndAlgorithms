package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 23/01/19
 */
public class PrintDigitsOnManualInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases you want to run: ");
        IntStream.range(0, sc.nextInt()).forEach(input -> {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter an Input");
            String question = sc1.nextLine();

            String regex = "_FOR_";

            final StringBuilder[] builder = {new StringBuilder()};

            Arrays.asList(question.replaceAll(" FOR ", regex).split(" "))
                    .stream().forEach(x -> {
                if (x.contains(regex)) {
                    Collections.nCopies(Integer.valueOf(x.split("_")[2]), x.split("_")[0]).stream().forEach(y -> {
                        builder[0].append(y);
                        builder[0].append(",");
                    });
                } else {
                    builder[0].append(x);
                    builder[0].append(",");
                }
            });
            System.out.print(builder[0]);
        });
    }
}
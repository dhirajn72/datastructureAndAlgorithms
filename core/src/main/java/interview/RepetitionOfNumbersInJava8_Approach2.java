package interview;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 23/01/19
 */
public class RepetitionOfNumbersInJava8_Approach2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of test cases you want to run: ");

            IntStream.range(0, sc.nextInt()).forEach(input -> {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter an Input");

                String question = sc1.nextLine();

                String regex = "_FOR_";
                BinaryOperator<List> combiner = (left, right) -> {
                    left.addAll(right);
                    return left;
                };
                List output = Arrays.stream(question.replaceAll(" FOR ", regex).split(" "))
                        .collect(Collector.of(ArrayList::new, (List list, String str) -> {
                            if (str.contains(regex)) {
                                list.addAll(Collections.nCopies(Integer.valueOf(str.split(regex)[1]), str.split(regex)[0]));
                            } else {
                                list.add(str);
                            }
                        }, combiner));

                System.out.println(output);

            });
        }
    }

    /*
Enter the number of test cases you want to run:
4
Enter an Input
2 FOR 12 5 FOR 2 10
[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 10]
Enter an Input
2 FOR 2 0 FOR 5 1
[2, 2, 0, 0, 0, 0, 0, 1]
Enter an Input
1 2 3 4 5 6 FOR 10
[1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
Enter an Input
1 FOR 5 0 FOR 0 0
[1, 1, 1, 1, 1, 0]
*/
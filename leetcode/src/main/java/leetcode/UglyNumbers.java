package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class UglyNumbers {
    public static void main(String[] args) {

        _printUglyNumbers(15);
    }

    private static void _printUglyNumbers(int number) {

        List<Integer> uglyNumbers=new ArrayList<>();
        for (int i = 0; i <number ; i++) {
            if (i%2==0)
                uglyNumbers.add(i);
            else if (i%3==0)
                uglyNumbers.add(i);
            else if (i%5==0)
                uglyNumbers.add(i);
        }
        System.out.println(uglyNumbers);

        /*

        From 1 to 15, there are 11 ugly numbers 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.
         */

    }
}

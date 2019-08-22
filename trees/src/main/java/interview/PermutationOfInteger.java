package interview;

/**
 * @author Dhiraj
 * @date 25/07/19
 */

// Cyclic permutation
public class PermutationOfInteger {
    public static void main(String[] args) {
        cyclic(1234);
    }

    static int countdigits(int N) {

        int count = 0;
        while (N > 0) {
            count++;
            N = N / 10;
        }
        return count;
    }


    // Function to generate all cyclic
    // permutations of a number

    static void cyclic(int N) {
        int num = N;
        int n = countdigits(N);

        while (true) {
            System.out.println(num);

            // Following three lines generates a
            // circular pirmutation of a number.
            int rem = num % 10;
            int dev = num / 10;
            num = (int) ((Math.pow(10, n - 1)) *
                    rem + dev);

            // If all the permutations are
            // checked and we obtain original
            // number exit from loop.
            if (num == N)
                break;
        }
    }
}



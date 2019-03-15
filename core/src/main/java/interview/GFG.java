package interview;

/**
 * @author Dhiraj
 * @date 01/03/19
 */
public class GFG {

    public static boolean isPalindromePossible(String input)
    {

        // convert the string to character array
        char[] charStr = input.toCharArray();
        int len = input.length(), i;

        // counts the number of differences which prevents
        // the string from being palindrome.
        int diffCount = 0;

        // keeps a record of the characters that prevents
        // the string from being palindrome.
        char[][] diff = new char[2][2];

        // loops from the start of a string till the midpoint
        // of the string
        for (i = 0; i < len / 2; i++) {

            // difference is encountered preventing the string
            // from being palindrome
            if (charStr[i] != charStr[len - i - 1]) {

                // 3rd differences encountered and its no longer
                // possible to make is palindrome by one swap
                if (diffCount == 2)
                    return false;

                // record the different character
                diff[diffCount][0] = charStr[i];

                // store the different characters
                diff[diffCount++][1] = charStr[len - i - 1];
            }
        }

        switch (diffCount) {

            // its already palindrome
            case 0:
                return true;

            // only one difference is found
            case 1:
                char midChar = charStr[i];

                // if the middleChar matches either of the
                // difference producing characters, return true
                if (len % 2 != 0 && (diff[0][0] == midChar
                        || diff[0][1] == midChar))
                    return true;

                // two differences are found
            case 2:

                // if the characters contained in the two sets are same,
                // return true
                if ((diff[0][0] == diff[1][0] && diff[0][1] == diff[1][1])
                        || (diff[0][0] == diff[1][1] && diff[0][1] == diff[1][0]))
                    return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindromePossible("bbg"));
        System.out.println(isPalindromePossible("bdababd"));
        System.out.println(isPalindromePossible("gcagac"));
        System.out.println(isPalindromePossible("abccbea"));

    }
}

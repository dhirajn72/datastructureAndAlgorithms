package algo;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class MaxNumberOfDuplicate {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 7, 2, 5, 8, 1, 9, 6, 0, 8, 6};
        System.out.println(maxNumberOfDuplicatesInArray(arr));
    }

    private static int maxNumberOfDuplicatesInArray(int[] arr) {
        int maxCounter = 0, number = 0, counter = 0;

        for (int i = 0; i < arr.length ; i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
                if (counter>maxCounter){
                    maxCounter=counter;
                    number=arr[i];
                }
            }
        }
        System.out.println(number+" >> wins the election with : "+maxCounter+ "votes !!");
        return maxCounter;
    }
}

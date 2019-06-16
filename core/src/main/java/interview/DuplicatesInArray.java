package interview;

/**
 * @author Dhiraj
 * @date 09/06/19
 */
public class DuplicatesInArray {
    public static void main(String[] args) {
        DuplicatesInArray repeat = new DuplicatesInArray();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        repeat.printRepeating(arr);
    }

    void printRepeating(int arr[]) {
        int count[] = new int[arr.length];
        System.out.println("Repeated elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]=count[arr[i]]+1;
        }
        System.out.println();
    }
}

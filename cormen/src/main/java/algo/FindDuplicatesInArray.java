package algo;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr={5,4,6,3,7,2,8,1,9,0,8};
        System.out.println(findDuplicatesInArray(arr));
    }

    private static boolean findDuplicatesInArray(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("First Duplicate element is: "+arr[i]);
                    return true;
                }
            }
        }
        return false;
    }
}

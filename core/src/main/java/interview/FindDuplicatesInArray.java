package interview;

import com.java.utils.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 29/01/19
 */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr= DataUtils.getSortedIntArray();
        arr[20]=20;
        arr[44]=40;
        System.out.println(Arrays.toString(arr));

        System.out.println("Duplicates are:");
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

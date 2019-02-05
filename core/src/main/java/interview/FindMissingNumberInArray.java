package interview;

import com.java.utils.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 29/01/19
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = DataUtils.getSortedIntArray();
        arr[49]=0;
        arr[59]=0;
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=i+1){
                System.out.println("Missing numbers are::"+ (i+1));
            }
        }
    }


}

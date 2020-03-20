package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/12/18
 */
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,7,8,9};
        int[] arr2={2,3,4,5,6,6,8,9};


        /*int sum1=0,sum2=0;
        for (int x:arr1)
            sum1+=x;
        for (int x:arr2)
            sum2+=x;
        System.out.println(sum1+ " "+sum2);
        System.out.println(sum1-sum2);*/
        Integer[] what = Arrays.stream( arr1 ).boxed().toArray(Integer[]::new);



    }
}

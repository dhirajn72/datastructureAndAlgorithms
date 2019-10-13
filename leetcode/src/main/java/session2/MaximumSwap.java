package session2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 10/09/19
 */
public class MaximumSwap {
    public static void main(String[] args) {
        maximumSwap(1);


    }
    public static int maximumSwap(int num) {

        if (num==0)return num;
        String s=String.valueOf(num);

        String s1=new String("hello");
        String s2=String.valueOf("hello");
        System.out.println(s1==(s2));

        List integers=Arrays.asList(new Integer[]{1,2,3,4});
        System.out.println(integers);



        return 0;
    }
}

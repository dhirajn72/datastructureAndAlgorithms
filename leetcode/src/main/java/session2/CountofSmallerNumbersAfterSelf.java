package session2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 28/08/19
 */
public class CountofSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        System.out.println(countSmaller(new int[]{5,2,6,1}));
    }

    public static List<Integer> countSmaller(int[] arr) {
        if (arr==null||arr.length==0)return new ArrayList<>();
        int count=0;
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int item=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<item)
                    count++;
            }
            result.add(count);
            count=0;
        }
        return result;
    }
}

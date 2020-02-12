package session3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 02/01/20
 */
public class Triangle {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
        List<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(7);
        List<Integer> list3=new ArrayList<>();
        list3.add(4);
        list3.add(1);
        list3.add(8);
        list3.add(3);

        List<List<Integer>> list4=new ArrayList<>();
        list4.add(list);
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);

        System.out.println(minimumTotal(list4));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}

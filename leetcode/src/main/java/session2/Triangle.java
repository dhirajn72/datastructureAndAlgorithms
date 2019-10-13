package session2;

import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 11/09/19
 */
public class Triangle {


    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        for (List<Integer> list:triangle){
            Collections.sort(list);
            sum+= list.get(0);
        }
        return sum;
    }
}

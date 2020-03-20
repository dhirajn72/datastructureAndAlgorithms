package session3;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dhiraj
 * @date 13/12/19
 */
public class DateTest {
    public static void main(String[] args) {
        int[] ranks={3,4,3,0,2,2,3,0,0};
        System.out.println(solution(ranks));
    }

    public static int solution(int[] ranks){
        int total=0;
        Map<Integer,Integer> rankMap = new TreeMap<>();
        if(ranks.length>=2){
            for(int rank:ranks){
                Integer countRank = rankMap.get (rank);
                if(countRank==null){
                    rankMap.put (rank,1);
                }else{
                    rankMap.put (rank,rankMap.get (rank)+1);
                }
                Integer nextRank = rankMap.get (rank+1);
                if(nextRank!=null){
                    total=total+rankMap.get (rank);
                    rankMap.put (rank,0);
                }
                Integer prevRank = rankMap.get (rank-1);
                if(prevRank!=null){
                    total=total+rankMap.get (rank-1);
                    rankMap.put (rank-1,0);
                }
            }
        }
        return total;
    }
}

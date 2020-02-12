package session3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 02/02/20
 */
public class Goldman2 {
    static int getCountOfPossibleTeams(List<Integer> coders) {
        System.out.print(coders);
        if(coders==null||coders.size()==0)return 0;
        if(coders.size()<3)return 0;
        Set<List<Integer>> result=new HashSet<>();
        ExecutorService service= Executors.newFixedThreadPool(10);
        makeResultSet(coders,result,new ArrayList<>(),service);
        System.out.print("*****");
        System.out.print(result);
        return result.size();
    }
    public static void makeResultSet(List<Integer> coders,Set<List<Integer>> result,List<Integer> partial,ExecutorService service){
        if(partial.size()>3) return;
        if(partial.size()==3 && partial.get(0)<partial.get(1) && partial.get(1) < partial.get(2)){
            result.add(new ArrayList<>(partial));
        }
        if(partial.size()==3 && partial.get(0)>partial.get(1) && partial.get(1) > partial.get(2)){
            result.add(new ArrayList<>(partial));
        }
        for (int i = 0; i < coders.size(); i++) {
            ArrayList<Integer> remainings=new ArrayList<>();
            int n=coders.get(i);
            for (int j = i+1; j < coders.size(); j++) {
                //remainings.add(coders.get(j));
                int finalJ = j;
                service.execute(()->{remainings.add(coders.get(finalJ));});
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(n);
            makeResultSet(remainings, result, partial_res,service);
        }
    }
}

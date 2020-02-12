package session3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 02/02/20
 */
public class Goldman1 {

    public static void main(String[] args) {
        int x=2;
        int y=10;
        int z=15;
        System.out.println(nonRepeatingDigitProductCount(x,y,z));
    }

    public static int nonRepeatingDigitProductCount(int x, int y, int z) {
        if(x==0)return 0;
        List<Integer> results=new ArrayList<>();
        for (int i = y; i <= z; i++) {
            int product=x*i;
            boolean res=isValid(i,product);
            if(!res){
                results.add(i);
            }
        }
        return results.size();
    }
    public static boolean isValid(int n,int p){
        String product=String.valueOf(p);
        String s=String.valueOf(n);
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < product.length(); i++) {
            map.put(product.charAt(i)+"", product.charAt(i)+"");
        }
        boolean res=false;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)+"")){
                res=true;
                break;
            }
        }
        return res;
    }
}

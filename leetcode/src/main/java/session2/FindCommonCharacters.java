package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        /*

        Input: ["bella","label","roller"]
Output: ["e","l","l"]
         */
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));

    }

    public static List<String> commonChars(String[] A) {
        if (A==null)return new ArrayList<>();
        for (int i = 0; i <A.length ; i++) {
            char[] arr=A[i].toCharArray();
            Arrays.sort(arr);
            String s="";
            for (char c:arr)
                s+=c;
            A[i]=s;
        }
        char[] first=A[0].toCharArray();
        char[] last=A[A.length-1].toCharArray();

        List<String> res=new ArrayList<>();
        Map<Character,Character> map=new HashMap<>();
        for (char c:first){
            if (!map.containsKey(c))
                map.put(c,c);
        }
        for (char c:last){
            if (map.containsKey(c))
                res.add(String.valueOf(c));
        }

        System.out.println(res);
        return res;

    }
}

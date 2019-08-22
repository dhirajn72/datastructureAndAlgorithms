package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
        //System.out.println(letterCombinations("3"));
    }


    public static List<String> letterCombinations(String digits) {
        /*Map<Integer,String> map=new HashMap<>();
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        map.put(0,"");

      //  ["adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"]
        List<String> result=new ArrayList<>();





        return result;*/
        List<String> rst = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return rst;
        }
        //Init map
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        // Init 1 digits and the chars in queue
        Queue<String> queue = new LinkedList<String>();
        char c = digits.charAt(0);
        String s = map.get(c);
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i) + "");
        }

        int size = 0;
        for (int i = 1; i < digits.length(); i++) {//iteratve all numbers
            c = digits.charAt(i);
            s = map.get(c);
            size = queue.size();
            for (int j = 0; j < size; j++) {//iteratve old queue
                String str = queue.poll();
                for (int k = 0; k < s.length(); k++) {//iteratve possibile chars per number key
                    queue.offer(str + s.charAt(k));
                }
            }
        }
        while (!queue.isEmpty()) {
            rst.add(queue.poll());
        }

        return rst;
    }
}

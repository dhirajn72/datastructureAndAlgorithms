package session2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class LetterCombinations {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits==null||digits.length()==0)return new ArrayList<>();
        String[] mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        generateLetterCombinations(result,digits,"",0,mapping);
        return result;
    }

    private static void generateLetterCombinations(List<String> result, String digits,String current, int index, String[] mapping) {
        if (index==digits.length()){
            result.add(current);
            return;
        }
        String letter=mapping[digits.charAt(index)-'0'];
        for (int i = 0; i < letter.length(); i++) {
            generateLetterCombinations(result,digits,current+letter.charAt(i),index+1,mapping);
        }
    }
}

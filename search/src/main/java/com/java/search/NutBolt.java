package com.java.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class NutBolt {
    public static void main(String[] args) {
        /*
        nuts[] = {'@', '#', '$', '%', '^', '&','*'}
        bolts[] = {'$', '%', '&', '^', '@', '#'}
         */
        char[] nuts = {'@', '#', '$', '%', '^', '&'};
        char[] bolts = {'$', '%', '&', '^', '@', '#','*'};
        _findNutsForBolt(nuts,bolts);
    }

    private static void _findNutsForBolt(char[] nuts, char[] bolts) {
        Map<Character,Character> nutsMap=new HashMap<>();
        for (Character c:nuts){
            nutsMap.put(c,c);
        }
        for (Character c:bolts){
            if (nutsMap.containsKey(c))
                System.out.println("For bolt: "+c +" contains nut: "+nutsMap.get(c));
            else
                System.out.println("For bolt: "+c +" doesn't contains any nuts: "+nutsMap.get(c));
        }


    }
}

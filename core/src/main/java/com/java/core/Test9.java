package com.java.core;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test9 {
    public static void main(String[] args) {
        //TreeSet treeSet= new TreeSet(new SBComparator());
        /*StringBuffer  stringBuffer =new StringBuffer("dhiraj");
        treeSet.add(stringBuffer);
        treeSet.add(stringBuffer);
        treeSet.add(stringBuffer);
        treeSet.add(stringBuffer);*/

       // System.out.println(treeSet);

        //TreeSet treeSet= new TreeSet(Collections.reverseOrder());
        TreeSet treeSet= new TreeSet();
        treeSet.add("abhay");
        treeSet.add("binod");
        treeSet.add("chandu");
        treeSet.add("dhiraj");
        System.out.println(treeSet);

    }
}

class SBComparator implements Comparator<StringBuffer>{

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        return o1.hashCode()-o2.hashCode();
    }
}
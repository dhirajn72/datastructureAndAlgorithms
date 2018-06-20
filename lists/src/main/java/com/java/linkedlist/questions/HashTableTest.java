package com.java.linkedlist.questions;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<String,String > hashtable= new Hashtable<>();
        hashtable.put("test","dhiraj");
        hashtable.put("zeplin","singh");
        hashtable.put("scraper","kumar");

        Enumeration<String> stringEnumeration=hashtable.keys();
        while (stringEnumeration.hasMoreElements()){
            String key=stringEnumeration.nextElement();
            System.out.println(key+":"+hashtable.get(key));
        }
    }
}

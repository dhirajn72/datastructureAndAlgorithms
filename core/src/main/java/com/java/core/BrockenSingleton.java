package com.java.core;

import java.lang.reflect.Field;

/**
 * @author Dhiraj
 * @date 08/05/18
 */
public class BrockenSingleton {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Immutable immutable=null;//=new Immutable("dhiraj",11);

        Field field= Immutable.class.getDeclaredField("name");
        field.setAccessible(true);

        System.out.println(immutable.getName());
        field.set(immutable,"brocken");
        System.out.println(immutable.getName());

        String s="";
        String s1=s+"";
        System.out.println(s==s1);


    }
}

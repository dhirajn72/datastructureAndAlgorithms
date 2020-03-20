package com.java.core.questions;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        CustomClassLoader loader = new CustomClassLoader();
        Class<?> c = loader.findClass("com.java.core.questions.Criminal");
        Object ob = c.newInstance();
        System.out.println(ob instanceof Criminal);
    }
}

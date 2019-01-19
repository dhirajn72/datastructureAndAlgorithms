package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class SingletonEager {
    private static final SingletonEager INSTANCE=new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        return INSTANCE;
    }
}

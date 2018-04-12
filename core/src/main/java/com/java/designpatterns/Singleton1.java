package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Singleton1 {

    private static volatile Singleton1 _instance;

    public Singleton1 getInstance(){
        if (_instance==null){
            synchronized (Singleton1.class){
                if (_instance==null){
                    _instance=new Singleton1();
                }
            }
        }
        return _instance;
    }
}

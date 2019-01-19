package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public class SingletonDoubleCheck {
    private static SingletonDoubleCheck instance = null;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null)
                    instance = new SingletonDoubleCheck();
            }
        }
        return instance;
    }
}

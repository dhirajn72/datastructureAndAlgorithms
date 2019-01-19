package com.java.designpatterns;

/**
 * @author Dhiraj
 * @date 12/01/19
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

package com.java.observers;

/**
 * @author Dhiraj
 * @date 24/06/18
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class ThreadSafeStringBuilderClient {
    public static void main(String[] args) {
        new Thread(new Task1()).start();
        new Thread(new Task1()).start();
        new Thread(new Task1()).start();

    }
}

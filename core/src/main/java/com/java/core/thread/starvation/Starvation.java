package com.java.core.thread.starvation;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Starvation {
    public static void main(String[] args) {
        Worker2 worker = new Worker2();
        for (int i = 1; i < 50; i++) {
            new Thread(() -> {
                try {
                    worker.work();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

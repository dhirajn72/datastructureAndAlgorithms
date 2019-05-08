package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 03/05/19
 */
public class ReadWriteLockTest {
    static final int READER_SIZE = 10;
    static final int WRITER_SIZE = 2;

    public static void main(String[] args) {
        Integer[] initialElements = {33, 28, 86, 99};

        ReadWriteList<Integer> sharedList = new ReadWriteList<>(initialElements);

        ExecutorService service= Executors.newFixedThreadPool(4);


        service.execute(()->{for (int i = 0; i < READER_SIZE; i++) {
            new Reader(sharedList).start();
        }});

        service.execute(()->{for (int i = 0; i < WRITER_SIZE; i++) {
            new Writer(sharedList).start();
        }});

        service.shutdown();



    }
}
package com.java.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite(new ReentrantReadWriteLock());
        new Thread(new Write(readWrite)).start();
        new Thread(new Read(readWrite)).start();

    }
}

class Read implements Runnable {
    private ReadWrite readWrite;

    public Read(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            readWrite.write(i);
        }
    }
}

class Write implements Runnable {
    private ReadWrite readWrite;

    public Write(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            readWrite.read();
        }
    }
}

class ReadWrite {
    private List<Integer> shared=new ArrayList<>();
    private ReentrantReadWriteLock lock;

    public ReadWrite(ReentrantReadWriteLock lock) {
        this.lock = lock;
    }
    public void write(int val) {
        try {
            lock.writeLock().lock();
            shared.add(val);
            System.out.println("Writing:" + val);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("Reading::" + shared);
        } finally {
            lock.readLock().unlock();
        }
    }
}

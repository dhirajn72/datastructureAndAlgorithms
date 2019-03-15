package com.java.designpatterns;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Singleton1 implements Cloneable, Serializable {

    private static volatile Singleton1 _instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (_instance == null) {
            synchronized (Singleton1.class) {
                if (_instance == null) {
                    _instance = new Singleton1();
                }
            }
        }
        return _instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        /*Singleton1 ob = Singleton1.getInstance();
        System.out.println(ob);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("ob.ser")));
        objectOutputStream.writeObject(ob);
        System.out.println("Serialized !");

        Singleton1 ob2 = (Singleton1) new ObjectInputStream(new FileInputStream(new File("ob.ser"))).readObject();
        System.out.println(ob2);

        Singleton1 ob3 = (Singleton1) ob.clone();
        System.out.println(ob3);*/
        System.out.println("************");
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                Singleton1 s = Singleton1.getInstance();
                System.out.println(s);
            });
        }
        service.shutdown();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    private Object readResolve() {
        return getInstance();
    }
}
